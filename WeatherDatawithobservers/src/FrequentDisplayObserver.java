import Interfaces.Displayelement;

import java.util.Observable;
import java.util.Observer;

public class FrequentDisplayObserver implements Observer, Displayelement {

    Observable observable;
    private float Temprature;
    private float Humidity;

    public FrequentDisplayObserver(Observable O){
        this.observable = O;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg) {
        WeatherdatawithObserver weatherdata = (WeatherdatawithObserver) obs;
        this.Temprature = weatherdata.getTemprature();
        this.Humidity = weatherdata.getHumidity();
        display();
    }

    public void display(){
        System.out.println("Temprature"+Temprature+"Humidity"+Humidity);
    }
}
