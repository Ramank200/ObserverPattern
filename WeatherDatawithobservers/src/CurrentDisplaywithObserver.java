import Interfaces.Displayelement;

import java.util.Observable;
import java.util.Observer;

public class CurrentDisplaywithObserver implements Observer, Displayelement {
    Observable observable;
    private float Temprature;
    private float Pressure;
    public CurrentDisplaywithObserver(Observable O){
        this.observable = O;
        observable.addObserver(this);
    }

    public void update(Observable obs,Object args){
        if(obs instanceof WeatherdatawithObserver) {
            WeatherdatawithObserver weatherdata = (WeatherdatawithObserver) obs;
            this.Temprature = weatherdata.getTemprature();
            this.Pressure = weatherdata.getPressure();
            display();
        }
    }

    public void display(){
        System.out.println("Pressure"+Pressure +"Temprature"+Temprature+"deg C");
    }
}
