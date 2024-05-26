
Observer Pattern Implementation README

Overview:
This repository contains a simple implementation of the Observer Pattern in Java. The Observer Pattern is a behavioral design pattern where an object, known as the subject, maintains a list of its dependents, called observers, and notifies them of any state changes, usually by calling one of their methods.

Files:
Subject.java: Defines the Subject interface, which declares methods for attaching, detaching, and notifying observers.
WeatherData.java: Implements the Subject interface and maintains the state of interest, which triggers notifications to observers upon changes.
CurrentDisplay.java: Defines the Observer interface, specifying the method to be called when the subject's state changes.
Main.java: Contains the main code to demonstrate the implementation of the Observer Pattern.
Implementation Details:
Subject Interface:

registerObserver(Observer observer): Adds a new observer to the list of observers.
removeObserver(Observer observer): Removes an observer from the list of observers.
notifyUsers(): Notifies all registered observers when a state change occurs.
Observer Interface:

update(): This method is called by the subject when its state changes. Concrete observer classes must implement this method.
Usage:
Clone the repository to your local machine.
Navigate to the directory containing the files.
Compile the Java files using javac *.java.
Run Main.java using java Main.
Example:
java
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
Output:
Hello world!
Temprature80.0Humidity90.0
Pressure34.2Temprature80.0deg C
Temprature40.0Humidity70.0
Pressure24.2Temprature40.0deg C
Temprature20.0Humidity90.0
Pressure30.2Temprature20.0deg C

Further Improvements:
Implement error handling for attaching and detaching observers.
Add support for passing additional data to observers when notifying them of state changes.
Explore variations of the Observer Pattern, such as using weak references to avoid memory leaks in languages that do not have built-in garbage collection.

Contributors:
Raman

Contact:
For any questions, suggestions, or issues, please contact alexesramon0909@gmail.com.
