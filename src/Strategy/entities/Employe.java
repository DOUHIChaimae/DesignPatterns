package Strategy.entities;

public class Employe {
    private String cin;
    private float salaireBrutMensuel;

    public Employe() {
    }

    public Employe(String cin, float salaireBrutMensuel) {

        this.cin = cin;
        this.salaireBrutMensuel = salaireBrutMensuel;

    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public float getSalaireBrutMensuel() {
        return salaireBrutMensuel;
    }

    public void setSalaireBrutMensuel(float salaireBrutMensuel) {
        this.salaireBrutMensuel = salaireBrutMensuel;
    }
}
