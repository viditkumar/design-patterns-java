package patterns.design.test.creational;

public class SingletonPattern {
	
	// private static variable
	private static SingletonPattern singletonPatternInstance;
	
	// private constructor
	private SingletonPattern(){
	}
	
	/**
	 * public static method
	 * Thread Safe, Good for Multi-threading
	 * Making getSingletonInstance() method singleton reduce performance
	 */
	public static SingletonPattern getSingletonInstance(){
		if(singletonPatternInstance == null){
			synchronized(SingletonPattern.class){
				if(singletonPatternInstance == null)
					singletonPatternInstance = new SingletonPattern();
			}
		}
		return singletonPatternInstance;
	}
}
