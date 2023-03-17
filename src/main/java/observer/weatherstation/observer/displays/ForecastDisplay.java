package observer.weatherstation.observer.displays;

import observer.weatherstation.observer.subject.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
  private float currentPressure = 29.92f;
  private float lastPressure;
  private WeatherData weatherData;

  public ForecastDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }
  @Override
  public void display() {
    StringBuilder sb = new StringBuilder();
    sb.append("Forecast: ");
    if(currentPressure > lastPressure){ sb.append("Improving weather on the way!");}
    else if (currentPressure == lastPressure) { sb.append("More of the same");}
    else if (currentPressure < lastPressure) { sb.append("Watch out for cooler, rainy weather");}
    System.out.println(sb);
  }
  @Override
  public void update() {
      lastPressure = currentPressure;
      currentPressure = weatherData.getPressure();
      display();
    }
  }

