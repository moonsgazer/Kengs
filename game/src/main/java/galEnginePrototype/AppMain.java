package galEnginePrototype;

import galEnginePrototype.engine.Engine;
import galEnginePrototype.ui.UI;

import java.util.logging.Logger;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application {

	static Logger LOG = Logger.getLogger(AppMain.class.getName());

	@Override
	public void start(Stage primaryStage) throws Exception {
		AppMain.LOG.info("Main start");
		// main object
		Engine engine = Engine.getInstance();
		UI ui = new UI(primaryStage);
		// init
		engine.init(ui);

	}

}
