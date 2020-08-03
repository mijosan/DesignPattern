package designpattern.observer;

import java.util.Observable;

public class CurrentConditionsDisplay implements java.util.Observer, DisplayElement{
	Observable observable;
	private double temperature;
	private double humidity;
	
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable obs, Object arg) {
		if(obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
	}
	
	@Override
	public void display() {
		System.out.println("Current condition : " + temperature + "F degrees and " + humidity + "% humidity");
	}

}
