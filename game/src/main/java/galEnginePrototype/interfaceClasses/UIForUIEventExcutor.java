package galEnginePrototype.interfaceClasses;

import java.util.HashMap;

import javafx.scene.Scene;
import javafx.stage.Stage;

public interface UIForUIEventExcutor {

	public Stage getPrimaryStaget();

	public EngineForUIInterface getEngineInterface();

	public HashMap<String, Scene> getScenesMap();

}
