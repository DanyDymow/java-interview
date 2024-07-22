package NoEng.Patterns.Strategy;

class Sorter {
    private SortingStrategy strategy;

    // Конструктор для установки стратегии
    public Sorter(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    // Метод для выполнения сортировки
    public void sortArray(int[] array) {
        strategy.sort(array);
    }

    // Метод для изменения стратегии на лету
    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }
}
