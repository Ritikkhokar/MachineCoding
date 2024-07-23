import Observabale.WeatherOfOhio;
import Observabale.WeatherOfTexas;
import Observers.EmailObserver;
import Observers.MobileObserver;
import Observers.Observers;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");


        Observers observer1 = new EmailObserver(new WeatherOfOhio(), "Ajay");
        Observers observer2 = new MobileObserver(new WeatherOfOhio(), "Karan");
        Observers observer3 = new EmailObserver(new WeatherOfTexas(), "Sanju");

//        WeatherOfOhio.ohioObserverList.add(observer1);
//        WeatherOfOhio.ohioObserverList.add(observer2);
//        WeatherOfTexas.texasObserverList.add(observer3);

        WeatherOfOhio weatherOfOhio = new WeatherOfOhio();
        weatherOfOhio.addObserver(observer1);
        weatherOfOhio.addObserver(observer2);
        weatherOfOhio.notifyObserver("weather of is very good");

        WeatherOfTexas weatherOfTexas = new WeatherOfTexas();
        weatherOfTexas.addObserver(observer3);
        weatherOfTexas.notifyObserver("weather of texas is very good");


    }





}