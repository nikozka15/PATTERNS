package observer.weatherstation.observer;

import observer.weatherstation.observer.displays.CurrentConditionDisplay;
import observer.weatherstation.observer.displays.ForecastDisplay;
import observer.weatherstation.observer.displays.StatisticDisplay;
import observer.weatherstation.observer.subject.WeatherData;

public class WeatherStation {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();
    CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
    StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);
    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
   // HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
    weatherData.setMeasurements(80, 65, 30.4f);
    weatherData.setMeasurements(82, 70, 29.2f);
    weatherData.setMeasurements(78, 90, 29.2f);

  }
}
