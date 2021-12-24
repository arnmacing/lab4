package history.Humans;

import history.State;
import history.Utensils.Utensils;

// Класс Ребёночка
public class Baby extends Human {
    //Метод для задания имени через конструктор
    public Baby(){
        super("Ребёночек");

    }

    @Override
    // Метод для описания действия
    public String hit(Utensils item){
        setState(State.SCREAM);
        return "В " + this.getName() + " прилетело " + item.getName() + ". ";
    }
}