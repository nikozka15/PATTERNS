package observer.weatherstation.observeble.displays;

import observer.weatherstation.observeble.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
  private float humidity;
  private float temperature;
  Observable observable;
  public CurrentConditionDisplay (Observable observable) {
    this.observable = observable;
    observable.addObserver(this);
  }
  @Override
  public void display() {
    System.out.println("Current conditions: " + temperature
      + "F degrees and " + humidity + "% humidity");
  }
  @Override
  public void update(Observable observable, Object o) {
    if (observable instanceof WeatherData) {
      WeatherData weatherData = (WeatherData) observable;
      this.temperature = weatherData.getTemperature();
      this.humidity = weatherData.getHumidity();
      display();
    }
  }
}
