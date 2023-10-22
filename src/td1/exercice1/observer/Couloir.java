package td1.exercice1.observer;

public class Couloir implements Observer {
    @Override
    public void update(Observable observable) {
        int score = ((Joueur) observable).getScore();
        System.out.println("Player's score has changed to: " + score);
        handleScore(score);
    }

    private void handleScore(int score) {
        if (score > 75) {
            displayHighScoreMessage();
        } else {
            displayNormalScoreMessage();
        }
    }

    private void displayHighScoreMessage() {
        displayMessage("High score achieved! Lights are flashing.");
    }

    private void displayNormalScoreMessage() {
        displayMessage("Normal score. Lights remain steady.");
    }

    private void displayMessage(String message) {
        System.out.println(message);
    }
}
