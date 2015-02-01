package galEngine.engine;

import galEngine.pack.Pack;
import galEngine.stage.Stage;

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
public class Engine {

	Logger logger = Logger.getLogger(this.getClass().getName());

	// base obj
	private Stage stage;
	private Pack pack;

	// executor
	ExecutorService executorService = Executors.newSingleThreadExecutor();
	// eventQueue, must threadSafe
	ConcurrentLinkedDeque<EngineEvent> eventQueue = new ConcurrentLinkedDeque<EngineEvent>();
	// Main loop
	MainLoop mainLoop = new MainLoop();

	public Engine(javafx.stage.Stage stage) {
	}

	public Pack getPack() {
		return pack;
	}

}
