package Patterns.Observer;

public class WeatherApp implements Observer {
    private String weather;

    public WeatherApp() {
    }

    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }

    public void display() { //Displays the observed weather in the console
        System.out.println(this.weather);
    }
}
