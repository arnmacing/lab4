package history.Dishes;

// Класс для кастрюли
public class Pan implements Dishes {
    @Override
    //Метод для переименования
    public String getName() { return "Сковородки"; }

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
