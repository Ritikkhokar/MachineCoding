package Observabale;

import java.util.ArrayList;
import java.util.List;
import Observers.Observers;

public class WeatherOfTexas implements Subject{
   public static List<Observers> texasObserverList = new ArrayList<>();
    String weather = "Weather of Texas is sunny";
    @Override
    public void addObserver(Observers observer) {
        texasObserverList.add(observer);
    }

    @Override
    public void removeObserver(Observers observer) {
        texasObserverList.remove(observer);
    }

    @Override
    public void notifyObserver(String weather) {
        if(weather != this.weather){
            this.weather = weather;
            for( Observers observer : texasObserverList){
                observer.update();
            }
        }
    }

    @Override
    public String getData() {
        return weather;
    }
}
