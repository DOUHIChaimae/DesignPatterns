package proxy;

import java.util.Random;

public class Proxy implements Standard {
    private StandardImpl1 target = new StandardImpl1();

    //Control access to the object
    @Override
    public void process() {
        System.out.println("Security context verification...");
        boolean b = new Random().nextBoolean();
        if (b) {
            target.process();
        } else {
            throw new RuntimeException("Forbidden 403");
        }
    }
}
