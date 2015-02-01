package galEnginePrototype.stage;

import java.util.HashMap;

public class Scene {
	// base
	public String sceneId;
	// res
	// 线程问题？
	private HashMap<String, GraphicNodeActor> graphicNodeActors;
	// TODO wait for first dev cyc
	// private ArrayList<MediaNodeActor> mediaNodeActor;
	// private ArrayList<TextNodeActor> textNodeActor;
	// private ArrayList<UINodeActor> UINodeActor;

	public Long currentPackId;

	public HashMap<String, GraphicNodeActor> getGraphicNodeActors() {
		return graphicNodeActors;
	}
	
	public GraphicNodeActor getGraphicNodeActorByActorId(String actorId){
		return graphicNodeActors.get(actorId);
	}
}
