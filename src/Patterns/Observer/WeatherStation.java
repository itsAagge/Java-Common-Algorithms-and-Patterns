package Patterns.Observer;

import java.util.ArrayList;

public class WeatherStation implements Subject {
    private ArrayList<Observer> observers;
    private String weather;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        if(!this.observers.contains(o)) {
            this.observers.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        if(this.observers.contains(o)) {
            this.observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(weather);
        }
    }

    public void setWeather(String newWeather) {
        this.weather = newWeather;
        notifyObservers();
    }
}
