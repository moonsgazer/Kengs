package galEnginePrototype.pack.nodes;

/**
 * baseNode 其余Node由此继承
 * 
 * @author Administrator
 * 
 */
public class Node {

	public static enum NodeType {
		TextNode, GraphicsNode, MediaNode, ControlNode, UINode
	};

	public Long packID;
	public String resID;
	public NodeType nodeType;
	

}
