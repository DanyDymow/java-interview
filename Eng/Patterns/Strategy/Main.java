package Eng.Patterns.Strategy;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 1, 2};

        // Используем быструю сортировку
        Sorter sorter = new Sorter(new QuickSort());
        sorter.sortArray(array);

        // Переключаемся на сортировку слиянием
        sorter.setStrategy(new MergeSort());
        sorter.sortArray(array);
    }
}
