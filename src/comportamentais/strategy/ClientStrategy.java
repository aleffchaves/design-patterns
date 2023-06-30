package comportamentais.strategy;
//client
public class ClientStrategy {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        int[] array = {5, 2, 8, 1, 9};

        sorter.setStrategy(new BubbleSortStrategy());
        sorter.sortArray(array);  // Saída: Ordenando com Bubble Sort

        sorter.setStrategy(new QuickSortStrategy());
        sorter.sortArray(array);  // Saída: Ordenando com Quick Sort
    }
}
