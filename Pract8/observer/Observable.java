package Pract8.observer;

public interface Observable {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}