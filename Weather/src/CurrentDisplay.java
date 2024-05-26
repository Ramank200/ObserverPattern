import Interfaces.*;

 public class CurrentDisplay implements Observer, Displayelement{
    private float temprature;
    private float humidity;
    private float pressure;

     public CurrentDisplay(SubjectInterface WeatherDataObject){
         WeatherDataObject.registerObserver(this);
    }

    public void update(float temp,float humid,float pressure){
        this.temprature = temp;
        this.humidity = humid;
        this.pressure = pressure;
        display();
    }


    public void display(){
        System.out.println(STR."tempratue\{humidity}% pressure\{temprature} pressure\{pressure}");
    }

 }