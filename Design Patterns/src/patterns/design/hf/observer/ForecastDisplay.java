package patterns.design.hf.observer;

public class ForecastDisplay implements Observer, Display {

	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;

	/**
	 * Constructor is passed with Subject and we use it to register
	 * ForecastDisplay as an Observer
	 * 
	 * @param weatherData
	 */
	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Forecast: " + "Temp= " + this.temperature + " Humidity= " + this.humidity + " Pressure= "
				+ this.pressure);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
