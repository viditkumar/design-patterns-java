package patterns.design.hf.observer;

/**
 * Observer interface is implemented by all the Observers
 *
 */
public interface Observer {

	public void update(float temperature, float humidity, float pressure);

}
