package patterns.design.singleton;

public class SingletonThreadSafeBlock {

	private static SingletonThreadSafeBlock instance;

	private SingletonThreadSafeBlock() {

	}

	public static SingletonThreadSafeBlock getInstance() {
		if (instance == null) {
			synchronized (SingletonThreadSafeBlock.class) {
				if (instance == null) {
					instance = new SingletonThreadSafeBlock();
				}
			}
		}
		return instance;
	}

}
