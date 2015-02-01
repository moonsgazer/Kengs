package galEnginePrototype.pack.nodes;

import java.util.HashMap;

public class UINode extends Node {

	public static enum UIAction {
		Selection
	};

	// Selection
	public HashMap<Long, String> options = null;

	public UIAction action;

}
