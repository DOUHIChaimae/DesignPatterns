package td1.exercice1.observer;

public class Couloir implements Observer {
    @Override
    public void update(Observable observable) {
        int score = ((Joueur) observable).getScore();
        double result = Math.pow(score, score) + 19;
        System.out.println("** Couloir **");
        System.out.println("Updated score: " + score);
        System.out.println("Result: " + result);
    }
}
