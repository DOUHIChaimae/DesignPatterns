package state;

public class AvionImpl implements Avion {
    private State state;

    public AvionImpl() {
        state = new EnPisteState();
    }

    @Override
    public void sortirDuGarrage() {
        state.sortirDuGarrage();
    }

    @Override
    public void entrerAuGarrage() {
        state.entrerAuGarrage();
    }

    @Override
    public void decoller() {
        state.decoller();
    }

    @Override
    public void atterir() {
        state.atterir();
    }

    @Override
    public void doActivity() {
        state.doActivity();
    }


    abstract class State {
        public abstract void sortirDuGarrage();

        public abstract void entrerAuGarrage();

        public abstract void decoller();

        public abstract void atterir();

        public abstract void doActivity();
    }

    class EnPisteState extends State {
        @Override
        public void sortirDuGarrage() {
            System.out.println("Impossible de sortir du garage depuis la piste");
        }

        @Override
        public void entrerAuGarrage() {

        }

        @Override
        public void decoller() {

        }

        @Override
        public void atterir() {

        }

        @Override
        public void doActivity() {

        }
    }

    class AuGarageState extends State {
        @Override
        public void sortirDuGarrage() {
            System.out.printf("Sortir du garage");
        }

        @Override
        public void entrerAuGarrage() {

        }

        @Override
        public void decoller() {

        }

        @Override
        public void atterir() {

        }

        @Override
        public void doActivity() {

        }
    }

    class State3 extends State {
        @Override
        public void sortirDuGarrage() {

        }

        @Override
        public void entrerAuGarrage() {

        }

        @Override
        public void decoller() {

        }

        @Override
        public void atterir() {

        }

        @Override
        public void doActivity() {

        }
    }

    class State4 extends State {
        @Override
        public void sortirDuGarrage() {

        }

        @Override
        public void entrerAuGarrage() {

        }

        @Override
        public void decoller() {

        }

        @Override
        public void atterir() {

        }

        @Override
        public void doActivity() {

        }
    }
}
