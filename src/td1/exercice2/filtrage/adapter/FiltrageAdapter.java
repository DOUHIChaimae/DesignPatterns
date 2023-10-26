package td1.exercice2.filtrage.adapter;

import td1.exercice2.filtrage.strategy.services.FilterStrategy;

public class FiltrageAdapter implements FilterStrategy {
    private ImplNonStandard implNonStandard;

    @Override
    public int[] filter(int[] data) {
        return implNonStandard.applyFilter("filterAdapter", data);
    }
}
