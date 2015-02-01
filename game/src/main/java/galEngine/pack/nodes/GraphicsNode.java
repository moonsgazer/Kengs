package galEngine.pack.nodes;

import javafx.scene.image.Image;

public class GraphicsNode extends Node {

	public static enum GraphicsAction {
		Show, Hide
	};

	public Boolean ifRemove = true;
	public Integer xCoordinate = null;
	public Integer yCoordinate = null;
	public Integer zCoordinate = null;
	public Image image = null;

	public GraphicsAction action;

	public Image getImage() {
		// TODO
		if (image == null) {
			loadImage();
		} else {

		}

		return image;
	}

	public void loadImage() {
		// TODO
	}

}
