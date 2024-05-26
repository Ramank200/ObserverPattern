import java.util.Observable;

public class WeatherdatawithObserver extends Observable{

    private float Temprature;
    private float Humidity;
    private float Pressure;
//    private boolean Changed;

    public WeatherdatawithObserver(){
    }

    public void ValuesChanged(){
        setChanged();
        notifyObservers();
    }

    public float getTemprature(){
        return Temprature;
    }

    public float getHumidity(){
        return Humidity;
    }

    public float getPressure(){
        return Pressure;
    }

    public void setMeasurements(float temprature, float humidity, float pressure){
        this.Temprature = temprature;
        this.Pressure = pressure;
        this.Humidity = humidity;

        ValuesChanged();
    }


}
