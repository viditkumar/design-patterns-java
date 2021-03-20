package patterns.design.test.structural;

public class DesignPatternTest {
	public static void main(String[] args) {
		AdapterPattern.testClassAdapter();
		AdapterPattern.testObjectAdapter();
		
		CompositePattern.testCompositePattern();
		
		ProxyPattern.testProxyPattern();
		
		DecoratorPattern.testDecoratorPattern();
		
		BridgePattern.testBridgePattern();
	}
}
