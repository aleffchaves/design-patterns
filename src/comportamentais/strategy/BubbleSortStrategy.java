package comportamentais.strategy;

public class BubbleSortStrategy implements SortingStrategy {

    @Override
    public void sort(final int[] array) {
        System.out.println("Ordenando com bubble sort");
    }
}
