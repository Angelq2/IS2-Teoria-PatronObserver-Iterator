package patronobserver;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author angel
 */
public abstract class Subject {
    
    private final List<Observer> observers = new ArrayList<>();
    
    public abstract void updateStatusSubject(); //alguien modifica el sujeto
    public abstract Object getStatusSubject();  //se solicita el estado del sujeto para saber si es necesario modificarlo
    
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    //se notifica a todos los observadores
    public void notifyObservers(){
            for (Observer observer : observers){
                observer.update(this);
            }
    }
}
