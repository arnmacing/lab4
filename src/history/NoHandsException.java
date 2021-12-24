package history;

//Исключение при попытке поварихи кинуть посуду
public class NoHandsException extends RuntimeException {
    // Метод для реализации исключения
    public String toString() {
        return "Повариха не будет кидать посуду. Посуда летит сама";
    }
}
