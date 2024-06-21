package Patterns.Observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        WeatherApp app1 = new WeatherApp();
        WeatherApp app2 = new WeatherApp();

        weatherStation.addObserver(app1);
        weatherStation.addObserver(app2);

        weatherStation.setWeather("Warm weather"); //Both apps should display this message in the console
    }
}
