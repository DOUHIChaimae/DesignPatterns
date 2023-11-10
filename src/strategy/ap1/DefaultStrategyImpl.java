package strategy.ap1;

public class DefaultStrategyImpl implements Strategy{
    @Override
    public void operation() {
        System.out.println("DefaultStrategy");
    }
}
