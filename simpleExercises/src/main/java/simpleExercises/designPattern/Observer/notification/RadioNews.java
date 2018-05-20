package simpleExercises.designPattern.Observer.notification;

import simpleExercises.designPattern.Observer.weather_forecast.WeatherForecast;

public class RadioNews implements Observer {
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("RadioNews - nowa prognoza pogody: temperatura: " + weatherForecast.getTemperature() + " stopni, ciśnienie: " + weatherForecast.getPressure() + "hPa");

    }
}
