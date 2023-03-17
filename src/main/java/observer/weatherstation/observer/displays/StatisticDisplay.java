package observer.weatherstation.observer.displays;

import observer.weatherstation.observer.subject.WeatherData;
public class StatisticDisplay implements Observer, DisplayElement {
  private float maxTemp = 0.0f;
  private float minTemp = 200;
  private float temperatureSum = 0.0f;
  private int numReadings = 0;
  private WeatherData weatherData;
  public StatisticDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }
  @Override
  public void display() {
    System.out.println("Avg/Max/Min temperature = " + (temperatureSum / numReadings) +
      "F/" + maxTemp + "F/" + minTemp + "F");
  }

  @Override
  public void update() {

      float temperature = weatherData.getTemperature();
      temperatureSum += temperature;
      numReadings++;

      if (temperature> maxTemp) maxTemp = temperature;
      if (temperature < minTemp) minTemp = temperature;
      display();
    }
  }

