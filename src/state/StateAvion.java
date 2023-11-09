package state;

public interface StateAvion {
    void sortirDuGarrage(); //transition

    void entrerAuGarrage(); //transition

    void decoller(); //transition

    void atterir(); //transition

    void doActivity(); // this method is used to simulate the activity of the plane
}
