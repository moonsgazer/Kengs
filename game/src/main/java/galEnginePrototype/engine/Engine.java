package galEnginePrototype.engine;

import galEngine.pack.Pack;
import galEngine.stage.Stage;
import galEnginePrototype.interfaceClasses.EngineForUIInterface;
import galEnginePrototype.interfaceClasses.UIForEngineInterface;
import galEnginePrototype.stage.GraphicNodeActor;
import galEnginePrototype.stage.Scene;
import galEnginePrototype.stage.StageConfig;
import galEnginePrototype.ui.UI;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

/**
 * 引擎对象
 * 
 * @author Administrator
 * 
 */
public class Engine implements EngineForUIInterface {

	static private Engine engineInstance;

	static synchronized public Engine getInstance() {
		if (engineInstance == null) {
			engineInstance = new Engine();
		}
		return engineInstance;
	}

	private Engine() {
	};

	Logger logger = Logger.getLogger(this.getClass().getName());

	private UIForEngineInterface uiInterface;
	private Pack pack;
	private Stage stage;
	// executor
	ExecutorService executorService = Executors.newSingleThreadExecutor();
	// eventQueue, must threadSafe
	ConcurrentLinkedDeque<EngineEvent> eventQueue = new ConcurrentLinkedDeque<EngineEvent>();
	// Main loop
	MainLoop mainLoop = new MainLoop();

	public void init(UIForEngineInterface uiInterface) {
		this.uiInterface = uiInterface;
		this.pack = Pack.Load("devPack");
		// TODO Engine的启动和基本流程
		// TODO EngineEvent
	}

	// get set start
	public Pack getPack() {
		return pack;
	}

	// get set end

	// start EngineForUIInterface

	/*
	 * TODO 实现 EngineForUIInterface 的方法
	 * (non-Javadoc)
	 * @see galEnginePrototype.interfaceClasses.EngineForUIInterface#getStageConfig()
	 */
	public StageConfig getStageConfig() {
		return null;
	}

	public GraphicNodeActor getGraphicNodeActor(String secenId, String actorId) {
		return null;
	}

	public void submitEngineEvent(EngineEvent engineEvent) {
	}

	public String getCurrentSceneId() {
		return null;
	}

	public Scene getCurrentScene() {
		return null;
	}

	// end EngineForUIInterface

}
