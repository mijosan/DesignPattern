package designpattern.observer;

public class WeatherStation {
	
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4);
		weatherData.setMeasurements(82, 70, 29.2);
		weatherData.setMeasurements(78, 90, 29.2);
	}

}
