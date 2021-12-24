package history.Dishes;

// Класс для чашки
public class Cup implements Dishes {
    //Метод для переименования
    @Override
    public String getName() {
        return "Кружки";
    }

    // Метод для сравнения двух объектов
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        return !(obj == null || getClass() != obj.getClass());
    }

    // Метод для преставления объекта в строковом виде
    @Override
    public String toString() {
        return "Действие посыпались";
    }

    // Метод для вычисления хэш-кода объекта
    @Override
    public int hashCode() {
        return this.getName().hashCode() * 127;
    }
}
