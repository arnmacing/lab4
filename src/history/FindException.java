package history;

//Исключение при попытке поварихи потерять время
public class FindException extends Exception{
    @Override
    // Метод для реализации исключения
    public String toString() {
        return "Повариха больше никогда не теряла времени";
    }
}

