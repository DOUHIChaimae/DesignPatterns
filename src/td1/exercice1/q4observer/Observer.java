package td1.exercice1.q4observer;

/**
 * Pattern Observer :  Définit une relation entre les objets de type un à plusieurs,de façon que, lorsqu'un
 * objet change d'état, tous ce qui en dependent en soient informés et soient mis à jour automatiquement
 */

public interface Observer {
    void update(Observable observable); //Pop technique
}
