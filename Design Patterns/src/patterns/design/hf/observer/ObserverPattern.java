package patterns.design.hf.observer;

/**
 * Observer Pattern defines, a one-many dependency between objects, so that when
 * one object changes state, all of its dependents are notified and updated
 * automatically
 *
 */
public class ObserverPattern {

	public static void main(String[] args) {

		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(21, 22, 23);
		weatherData.setMeasurements(31, 32, 33);
		weatherData.setMeasurements(41, 42, 43);
	}
}
