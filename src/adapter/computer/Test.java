package adapter.computer;

public class Test {
    public static void main(String[] args) {
        UniteCentrale uniteCentrale = new UniteCentrale();
        uniteCentrale.setVga(new Ecran());
        uniteCentrale.print("Bonjour");
        uniteCentrale.setVga(new VideoProjector());
        uniteCentrale.print("Hello");
    }

}
