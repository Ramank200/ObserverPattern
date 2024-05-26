import Interfaces.*;
import java.util.ArrayList;

public class Weatherdata implements SubjectInterface{
    private float Temprature;
    private float Humidity;
    private float Pressure;
    private ArrayList ObserverList;

    public Weatherdata(){
        ObserverList = new ArrayList();
    }

    public void registerObserver(Observer O){
        ObserverList.add(O);
    }

    public void removeObserver(Observer O){
        int i = ObserverList.indexOf(O);
        if(i>=0){
            ObserverList.remove(O);
        }
    }

    public void notifyUser(){
        for(int i=0;i<ObserverList.size();i++){
            Observer observers = (Observer)ObserverList.get(i);
            observers.update(Temprature,Humidity,Pressure);
        }
    }

    public void ValuesChanged(){
        notifyUser();
    }
    
    public void setMeasurements(float temprature, float humidity, float pressure){
        this.Temprature = temprature;
        this.Pressure = pressure;
        this.Humidity = humidity;
        ValuesChanged();
    }
    
}
