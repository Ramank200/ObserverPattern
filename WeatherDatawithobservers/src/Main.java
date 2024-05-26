public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        WeatherdatawithObserver weatherData = new WeatherdatawithObserver();
        CurrentDisplaywithObserver cd =  new CurrentDisplaywithObserver(weatherData);
        FrequentDisplayObserver fd = new FrequentDisplayObserver((weatherData));
        weatherData.setMeasurements(80,90,34.2f);
        weatherData.setMeasurements(40,70,24.2f);
        weatherData.setMeasurements(20,90,30.2f);
    }
}