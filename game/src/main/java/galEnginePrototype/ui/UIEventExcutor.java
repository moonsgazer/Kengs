package galEnginePrototype.ui;

import galEnginePrototype.interfaceClasses.EngineForUIInterface;
import galEnginePrototype.interfaceClasses.UIForUIEventExcutor;
import galEnginePrototype.pack.BaseInfo;
import galEnginePrototype.stage.GraphicNodeActor;
import galEnginePrototype.stage.StageConfig;
import galEnginePrototype.ui.event.GraphicUpdateEventMap;
import galEnginePrototype.ui.event.UIEvent;
import galEnginePrototype.util.CollectionUtil;
import galEnginePrototype.util.KeyWordsUtil.StageKeyWord;
import galEnginePrototype.util.KeyWordsUtil.UIKeyWord;

import java.util.HashMap;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * 保存UI实际执行uiEvent的代码
 * 
 * @author Administrator
 * 
 */
public class UIEventExcutor implements Runnable {

	public UIEventExcutor(UIForUIEventExcutor uiInterFace, UIEvent uiEvent) {
		this.uiEvent = uiEvent;
		this.uiInterFace = uiInterFace;
	}

	UIForUIEventExcutor uiInterFace = null;
	UIEvent uiEvent = null;

	// From ui
	private EngineForUIInterface engineInterface;
	private Stage primaryStage;
	private HashMap<String, Scene> scenesMap;

	// TODO 要直接暴露还是？
	private void initUIObjects() {
		engineInterface = uiInterFace.getEngineInterface();
		primaryStage = uiInterFace.getPrimaryStaget();
		scenesMap = uiInterFace.getScenesMap();
	}

	public void run() {
		initUIObjects();
		switch (uiEvent.eventType) {
		case EngineReady:
			setupAndDispaly();
		case GraphicUpdate:
			updateGraphic();
		case EngineEnd:
			endEngine();
		}

	}

	// 初始化并显示窗口
	private void setupAndDispaly() {
		//
		StageConfig stageConfig = engineInterface.getStageConfig();
		BaseInfo baseInfo = stageConfig.packBaseInfo;
		// setup
		primaryStage.setWidth(baseInfo.windowWidth);
		primaryStage.setHeight(baseInfo.windowHeight);
		// first Scene setup
		String sceneId = engineInterface.getCurrentSceneId();
		Scene firstScene = new Scene(null);
		StackPane basePane = new StackPane();
		firstScene.setRoot(basePane);
		scenesMap.put(sceneId, firstScene);
		primaryStage.setScene(firstScene);
		primaryStage.show();
	}

	// 基于Engine的Stage来更新当前的画面
	private void updateGraphic() {
		// get params in stage
		String sceneId = GraphicUpdateEventMap.getSceneId(uiEvent);
		String actorId = GraphicUpdateEventMap.getActorId(uiEvent);
		GraphicNodeActor nodeActor = engineInterface.getCurrentScene()
				.getGraphicNodeActorByActorId(actorId);
		// get object in javafx
		Scene scene = scenesMap.get(sceneId);
		StackPane baseGroup = (StackPane) scene.getRoot();
		ObservableList<Node> baseGroupChildren = baseGroup.getChildren();
		// 尝试找已有的对应javafx节点
		Canvas canvasNode = (Canvas) CollectionUtil.findJavaFxNodeByActorId(
				baseGroupChildren, actorId);
		if (canvasNode == null) {
			canvasNode = new Canvas();// default node
			canvasNode.getProperties().put(StageKeyWord.ActorId, actorId);
			canvasNode.getProperties().put(UIKeyWord.ZOrder,
					nodeActor.zCoordinate);
			baseGroupChildren.add(canvasNode);// 不用更新？//Z轴重新排列
		}
		// drawing
		GraphicsContext graphicsContext = canvasNode.getGraphicsContext2D();
		graphicsContext.drawImage(nodeActor.image, nodeActor.xCoordinate,
				nodeActor.yCoordinate);
	}

	// 结束程序
	private void endEngine() {
		primaryStage.close();
	}
}
