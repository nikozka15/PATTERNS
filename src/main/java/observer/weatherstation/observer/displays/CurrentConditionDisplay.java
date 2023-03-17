package observer.weatherstation.observer.displays;

import observer.weatherstation.observer.subject.WeatherData;

public class CurrentConditionDisplay implements Observer, DisplayElement {
  private float humidity;
  private float temperature;
  private WeatherData weatherData;
  public CurrentConditionDisplay (WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }
  @Override
  public void display() {
    System.out.println("Current conditions: " + temperature
      + "F degrees and " + humidity + "% humidity");
  }
  @Override
  public void update() {
      this.temperature = weatherData.getTemperature();
      this.humidity = weatherData.getHumidity();
      display();
    }
  }


