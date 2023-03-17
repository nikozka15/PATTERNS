package observer.weatherstation.observeble.displays;

import observer.weatherstation.observeble.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class StatisticDisplay implements Observer, DisplayElement {
  private float maxTemp = 0.0f;
  private float minTemp = 200;
  private float temperatureSum = 0.0f;
  private int numReadings = 0;
  Observable observable;
  public StatisticDisplay(Observable observable) {
    this.observable = observable;
    observable.addObserver(this);
  }
  @Override
  public void display() {
    System.out.println("Avg/Max/Min temperature = " + (temperatureSum / numReadings) +
      "F/" + maxTemp + "F/" + minTemp + "F");
  }

  @Override
  public void update(Observable observable, Object o) {
    if (observable instanceof WeatherData) {
      WeatherData weatherData = (WeatherData) observable;
      float temperature = weatherData.getTemperature();
      temperatureSum += temperature;
      numReadings++;

      if (temperature> maxTemp) maxTemp = temperature;
      if (temperature < minTemp) minTemp = temperature;
      display();
    }
  }
}
