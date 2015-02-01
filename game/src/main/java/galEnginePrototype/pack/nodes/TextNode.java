package galEnginePrototype.pack.nodes;


public class TextNode extends Node {

	public static enum TextAction {
		Click, Page
	};

	public TextAction action;
	public String text;

}
