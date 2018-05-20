package simpleExercises.designPattern.Observer.notification;

import simpleExercises.designPattern.Observer.weather_forecast.WeatherForecast;

public class InternetNews implements Observer {
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("InternetNews - nowa prognoza pogody: temperatura: " + weatherForecast.getTemperature() + " stopni, ciśnienie: " + weatherForecast.getPressure() + "hPa");

    }
}
