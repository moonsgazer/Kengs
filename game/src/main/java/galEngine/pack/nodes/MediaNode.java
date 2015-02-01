package galEngine.pack.nodes;

import javafx.scene.media.Media;

public class MediaNode extends Node {

	public static enum MediaAction {
		Play, Stop
	};

	// stop
	public Boolean ifRemove = true;
	// play
	public Float startFrom = null;
	public Float endAt = null;
	public Boolean ifRepeat = false;

	public Media media = null;
	public MediaAction action;

	public Media getMedia() {
		// TODO
		if (media == null) {
			loadMedia();
		} else {

		}

		return media;
	}

	public void loadMedia() {
		// TODO
	}

}
