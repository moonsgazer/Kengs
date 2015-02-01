package galEnginePrototype.engine;

import galEnginePrototype.interfaceClasses.BaseEvent;

import java.util.HashMap;

public class EngineEvent extends BaseEvent {

	static public enum EventType {
		NextNode, ScenceSwitch
	};

	public EngineEvent(EventType eventType) {
		this.eventType = eventType;
	}

	final public EventType eventType;

}
