package history.Dishes;

// Интерфейс для действий, совершаемых посудой
public interface Dishes {
    //Метод для выполнения действия
    default String getAction() {
        return getName() + " посыпались градом.";
    };
    String getName();
}
