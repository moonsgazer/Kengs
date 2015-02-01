package galEnginePrototype.ui.event;

import galEnginePrototype.interfaceClasses.BaseEvent;

public class UIEvent extends BaseEvent{

	static public enum EventType {
		EngineReady, GraphicUpdate, EngineEnd
	};

	public UIEvent(EventType eventType) {
		this.eventType = eventType;
	}

	final public EventType eventType;
}
