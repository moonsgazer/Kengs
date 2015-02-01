package galEnginePrototype.interfaceClasses;

import galEnginePrototype.engine.EngineEvent;
import galEnginePrototype.stage.GraphicNodeActor;
import galEnginePrototype.stage.Scene;
import galEnginePrototype.stage.StageConfig;

/**
 * 表示engine对 ui 公开的内容
 * @author Administrator
 *
 */
public interface EngineForUIInterface {
	
	public StageConfig getStageConfig();
	
	public String getCurrentSceneId();
	
	public Scene getCurrentScene();
	
	public GraphicNodeActor getGraphicNodeActor(String sceneId,String actorId);
	
	public void submitEngineEvent(EngineEvent engineEvent);

}
