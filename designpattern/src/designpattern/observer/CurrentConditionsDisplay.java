package designpattern.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
	private double temperature;
	private double humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	@Override
	public void display() {
		System.out.println("Current condition : " + temperature + "F degrees and " + humidity + "% humidity");
	}
	
	public void delete() {
		weatherData.removeObserver(this);
	}
}
