package simpleExercises.designPattern.Observer.weather_forecast;


import simpleExercises.designPattern.Observer.notification.Observer;

public interface Observable {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();

}
