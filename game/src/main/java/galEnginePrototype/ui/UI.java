package galEnginePrototype.ui;

import galEnginePrototype.interfaceClasses.EngineForUIInterface;
import galEnginePrototype.interfaceClasses.UIForUIEventExcutor;
import galEnginePrototype.interfaceClasses.UIForEngineInterface;
import galEnginePrototype.pack.BaseInfo;
import galEnginePrototype.stage.StageConfig;
import galEnginePrototype.ui.event.UIEvent;

import java.util.HashMap;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * 基于javafx的一个UI类，负责所有展示， 状态来自Stage，和Engine线程互相独立，并互相有事件交互
 * 
 * @author Administrator
 * 
 */
public class UI implements UIForEngineInterface, UIForUIEventExcutor {

	private EngineForUIInterface engineInterface;
	private Stage primaryStage;
	private HashMap<String, Scene> scenesMap = new HashMap<String, Scene>();

	public UI(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

	/**
	 * Call by engine
	 * 
	 * @param engineInterface
	 */
	public void init(EngineForUIInterface engineInterface) {
		this.engineInterface = engineInterface;
		// TODO init
	}

	/*
	 * 实现各个事件的逻辑 (non-Javadoc)
	 * 
	 * @see
	 * galEnginePrototype.interfaceClasses.UIForEngineInterface#submitUIEvent
	 * (galEnginePrototype.ui.event.UIEvent)
	 */
	public void submitUIEvent(UIEvent uiEvent) {
		UIEventExcutor uiEventExcutor = new UIEventExcutor(this, uiEvent);
		Platform.runLater(uiEventExcutor);
	}

	public Stage getPrimaryStaget() {
		return primaryStage;
	}

	public EngineForUIInterface getEngineInterface() {
		return engineInterface;
	}

	public HashMap<String, Scene> getScenesMap() {
		return scenesMap;
	}

}
