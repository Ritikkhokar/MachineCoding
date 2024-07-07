package Observabale;

import Observers.Observers;

public interface Subject {

    void addObserver(Observers observer);
    void removeObserver(Observers observer);
    void notifyObserver(String weather);
    String getData();
}
