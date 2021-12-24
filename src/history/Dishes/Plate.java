package history.Dishes;

// Класс для тарелки
public class Plate implements Dishes {


    @Override
    //Метод для переименования
    public String getName() { return "Тарелки"; };

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

    //Класс красных тарелок
    protected static class RedPlates{
        String name = "Красные тарелки";
        //Метод для выполнения действия
        public String fly(){
            return name + " посыпались";
        }
    }

    //Класс чёрных тарелок
    protected static class BlackPlates {
        String name = "Чёрные тарелки";

        //Метод для выполнения действия
        public String fly() {
            return name + " посыпались";
        }
    }


}



