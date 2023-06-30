package comportamentais.strategy;

public class QuickSortStrategy implements SortingStrategy{
    @Override
    public void sort(int[] array) {
        System.out.println("Ordenando com Quick sort");
    }
}
