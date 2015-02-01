package galEnginePrototype.interfaceClasses;

import java.util.HashMap;
import java.util.logging.Logger;

public class BaseEvent {

	static public Logger LOG = Logger.getLogger(BaseEvent.class.getName());

	private HashMap<String, Object> eventData = new HashMap<String, Object>();

	public void setParam(String key, Object value) {
		eventData.put(key, value);
	}

	public String getStringParam(String key) {
		String value = null;
		try {
			value = (String) eventData.get(key);
		} catch (ClassCastException e) {
			LOG.info(e.getMessage());
		}
		return value;
	}

}
