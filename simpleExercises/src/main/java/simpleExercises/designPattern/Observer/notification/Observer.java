package simpleExercises.designPattern.Observer.notification;

import simpleExercises.designPattern.Observer.weather_forecast.WeatherForecast;

public interface Observer {

    void updateForecast(WeatherForecast weatherForecast);
}
