package td1.exercice1.observer;

import java.util.ArrayList;
import java.util.List;

public class Joueur {
    private int score;
    private List<Observer> observers;

    public Joueur() {
        score = 0;
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
