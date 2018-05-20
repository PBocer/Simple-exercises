package simpleExercises.designPattern;

import simpleExercises.designPattern.Observer.notification.InternetNews;
import simpleExercises.designPattern.Observer.notification.RadioNews;
import simpleExercises.designPattern.Observer.notification.TvNews;
import simpleExercises.designPattern.Observer.weather_forecast.WeatherForecast;

public class Main {

    public static void main(String[] args) {

        WeatherForecast weatherForecast= new WeatherForecast(25,1003);
        RadioNews radioNews= new RadioNews();
        TvNews tvNews= new TvNews();
        InternetNews internetNews= new InternetNews();
        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(tvNews);
        weatherForecast.notifyObservers();

        weatherForecast.unregisterObserver(tvNews);
        weatherForecast.unregisterObserver(radioNews);

        System.out.println("\nNowa prognoza - powiadomienie tylko dla serwisu internetowego:");

        weatherForecast.updateForecast(18, 1007);





    }
}
