package Observabale;

import Observers.Observers;

import java.util.ArrayList;
import java.util.List;

public class WeatherOfOhio implements Subject{
   public static List<Observers> ohioObserverList = new ArrayList<>();
   String weather = "Weather of Ohio is rainy";



    @Override
    public void addObserver(Observers observer) {
        ohioObserverList.add(observer);
    }

    @Override
    public void removeObserver(Observers observer) {
        ohioObserverList.remove(observer);
    }

    @Override
    public void notifyObserver(String weather) {

        if(weather != this.weather){
            this.weather = weather;
         for( Observers observer : ohioObserverList){
             observer.update();
         }
     }
    }

    @Override
    public String getData() {
        return weather;
    }
}
