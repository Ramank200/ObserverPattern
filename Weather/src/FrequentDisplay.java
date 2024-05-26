import Interfaces.Displayelement;
import Interfaces.Observer;
import Interfaces.SubjectInterface;

public class FrequentDisplay implements Observer, Displayelement {

    private float Temprature;
    private float Humidity;
    private float Pressure;


    public FrequentDisplay(SubjectInterface weatherData){
        weatherData.registerObserver(this);
    }

    public void update(float temp,float humid, float press){
        this.Temprature = temp;
        this.Humidity = humid;
        this.Pressure = press;
        display();
    }

    public void display(){
        System.out.println(STR."temprature \{Temprature} pressure \{Pressure}% Humidity \{Humidity} FrequentDisplay ");
    }

}
