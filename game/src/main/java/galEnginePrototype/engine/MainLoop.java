package galEnginePrototype.engine;

import java.util.concurrent.Callable;

/**
 * TODO 拆分以下几个东西：可以被操作的资源（Engine/Stage/UI）， 事件本身的逻辑，Engine基本的流程逻辑，共通的部分方法。
 * 
 * Engine's Looper
 * 
 * @author Administrator
 * 
 */
public class MainLoop implements Callable<String> {

	public String call() throws Exception {
		// TODO loop and check eventQueue,do action by eventType
		return null;
	}

}
