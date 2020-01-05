package patterns.design.singleton;

public class SingletonThreadSafeMethod {
	
	private static SingletonThreadSafeMethod instance;

	private SingletonThreadSafeMethod() {

	}

//	making whole method synchronized
	public static synchronized SingletonThreadSafeMethod getInstance() {
		if (instance == null) {
			instance = new SingletonThreadSafeMethod();
		}
		return instance;
	}

}
