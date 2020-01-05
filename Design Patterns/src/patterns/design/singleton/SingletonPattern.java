package patterns.design.singleton;

public class SingletonPattern {

	public static void main(String[] args) {

		SingletonEager instance = SingletonEager.getInstance();
		System.out.println(instance);

		SingletonEager instance1 = SingletonEager.getInstance();
		System.out.println(instance1);

		SingletonLazy instanceLazy = SingletonLazy.getInstance();
		System.out.println(instanceLazy);
		
		SingletonThreadSafeMethod instanceMethod = SingletonThreadSafeMethod.getInstance();
		System.out.println(instanceMethod);
		
		SingletonThreadSafeBlock instanceBlock = SingletonThreadSafeBlock.getInstance();
		System.out.println(instanceBlock);

	}

}
