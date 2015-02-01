package galEnginePrototype.ui.event;

import galEnginePrototype.util.KeyWordsUtil.StageKeyWord;

public class GraphicUpdateEventMap {
	// TODO 确定ui的操作方式
	public static final StageKeyWord SCENE_ID_KEY = StageKeyWord.SceneId;
	public static final StageKeyWord ACTOR_ID_KEY = StageKeyWord.ActorId;

	public static String getSceneId(UIEvent uiEvent) {
		return uiEvent.getStringParam(SCENE_ID_KEY.toString());
	}

	public static String getActorId(UIEvent uiEvent) {
		return uiEvent.getStringParam(ACTOR_ID_KEY.toString());
	}

}
