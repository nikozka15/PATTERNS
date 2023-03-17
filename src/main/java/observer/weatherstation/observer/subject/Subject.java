package observer.weatherstation.observer.subject;

import observer.weatherstation.observer.displays.Observer;

public interface Subject {
  public void registerObserver(Observer o);
  public void removeObserver(Observer o);
  public void notifyObservers();
}
