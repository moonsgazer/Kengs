package galEnginePrototype.pack.nodes;


public class ControlNode extends Node {

	public static enum ControlAction {
		Stop, Goto
	};

	// goto
	public Long index;

	public ControlAction action;
}
