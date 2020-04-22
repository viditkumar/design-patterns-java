package patterns.design.hf.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {

	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	/**
	 * ArrayList to hold the observers
	 */
	public WeatherData(){
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		int index = observers.indexOf(observer);
		if(index >= 0)
			observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for(int i = 0; i<observers.size(); i++){
			Observer observer = observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged(){
		notifyObserver();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
