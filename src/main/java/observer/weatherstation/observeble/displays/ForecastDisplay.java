package observer.weatherstation.observeble.displays;



import observer.weatherstation.observeble.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
  private float currentPressure = 29.92f;
  private float lastPressure;
 Observable observable;

  public ForecastDisplay(Observable observable) {
    this.observable = observable;
    observable.addObserver(this);
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
  public void update(Observable observable, Object o) {
    if (observable instanceof WeatherData) {
      WeatherData weatherData = (WeatherData) observable;
      lastPressure = currentPressure;
      currentPressure = weatherData.getPressure();
      display();
    }
  }
}
