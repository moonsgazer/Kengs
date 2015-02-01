package galEngine.pack;

import galEngine.pack.nodes.Node;

import java.util.HashMap;

import javafx.scene.image.Image;
import javafx.scene.media.Media;

/**
 * 内容,脚本，资源，etc
 * 
 * @author Administrator
 * 
 */
public class Pack {

	static public Pack Load(String path) {
		return null;
	}

	private Pack() {

	}
	
	//root path
	private String rootPath; 
	// 基本信息
	private BaseInfo baseInfo;
	// 脚本数组集合
	private HashMap<String, SenceNodeArray> nodeArrayMap;
	//资源映射 id=>path
	private HashMap<String, String> resourceMap;

	public void loadPack(String path) {
		//load BaseInfo
		//load nodeArrays
		//load resourcef
	}

	public BaseInfo getBaseInfo() {
		return baseInfo;
	}
	
	//Node
	public Node getNode(String nodeArrayId, String nodeId) {
		return null;
	}
	
	public Node getNode(String nodeArrayId, Integer nodeId) {
		return null;
	}
	
	public SenceNodeArray getNodeArray(String nodeArrayId) {
		return null;
	}
	
	//resource method
	private String getTextResource(String resourceId) {
		return null;
	}
	
	private Image getImageResource(String resourceId) {
		return null;
	}
	
	private Media getMediaResource(String resourceId) {
		return null;
	}


}
