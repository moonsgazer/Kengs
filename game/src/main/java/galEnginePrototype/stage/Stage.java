package galEnginePrototype.stage;

import java.util.HashMap;

/**
 * 表示Stage，Sence等的状态，所有判断基于这里
 * @author Administrator
 *
 */
public class Stage {
	
	private StageConfig stageConfig;
	private HashMap<String, Scene> sences;
	public String currentSenceId;
	
}
