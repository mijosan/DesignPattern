package designpattern.observer;

public class WeatherData {
	
	double getTemperature() {
		return 0;
	}
	
	double getHumidity() {
		return 0;
	}
	
	double getPressure() {
		return 0;
	}
	
	public void measurementsChanged() {
		
		double temp = getTemperature();
		double humidity = getHumidity();
		double pressure = getPressure();
		
		currentConditionsDisplay.update(temp, humidity, pressure);
		statisticsDisplay.update(temp, humidity, pressure);
		forecastDisplay.update(temp, humidity, pressure);
	}
}
