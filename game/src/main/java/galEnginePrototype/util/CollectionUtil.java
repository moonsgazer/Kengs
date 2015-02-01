package galEnginePrototype.util;

import galEnginePrototype.util.KeyWordsUtil.StageKeyWord;
import javafx.collections.ObservableList;
import javafx.scene.Node;

public class CollectionUtil {

	public static Node findJavaFxNodeByActorId(ObservableList<Node> nodeList,
			String actorId) {
		Node result = null;
		for (Node node : nodeList) {
			String nodeActorId = (String) node.getProperties().get(
					StageKeyWord.ActorId);
			if (nodeActorId.equals(actorId)) {
				result = node;
			}
		}
		return result;
	}

}
