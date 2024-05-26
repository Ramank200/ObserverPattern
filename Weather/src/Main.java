public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");


        Weatherdata weatherData = new Weatherdata();

        CurrentDisplay currentDisplay = new CurrentDisplay(weatherData);
        FrequentDisplay frequentdisplay  = new FrequentDisplay((weatherData));

        weatherData.setMeasurements(80,90,34.2f);
        weatherData.setMeasurements(40,70,24.2f);
        weatherData.setMeasurements(20,90,30.2f);
    }
}