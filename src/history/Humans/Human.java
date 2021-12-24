package history.Humans;

import history.State;
import history.Utensils.Utensils;

// Абстрактный класс для всех персонажей данного текста. Содержит в себе функционал для выполнения действий.
public abstract class Human {
    private String name;
    private State state;

    //Метод для создания конструктора имени
    public Human(String name){
        this.name = name;
    }

    //Метод, который вовзращает имя
    protected String getName() {
        return this.name;
    }
    //Метод, который вовзращает имя и состояние
    public String getState() {
        return this.getName() + State.locale(this.state);
    }
    //Метод для создания конструктора состояния
    protected void setState(State state) {
        this.state = state;
    }
    //Метод для исполнения действия Utensils
    abstract public String hit(Utensils item);

    // Метод для вычисления хэш-кода объекта
    @Override
    public int hashCode() {
        return name.hashCode() * State.locale(state).hashCode();
    }

    // Метод для преставления объекта в строковом виде
    @Override
    public String toString() {
        return name;
    }

    // Метод для сравнения двух объектов
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Human) {
            return name.equals(((Human) obj).getName()) && state == ((Human) obj).state;
        }
        return false;
    }


}
