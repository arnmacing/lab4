package history.Humans;

import history.State;
import history.Utensils.Utensils;

// Класс Герцогини
public class Duchess extends Human {
    //Метод для задания имени через конструктор
    public Duchess(){
        super("Герцогиня");

    }
    @Override
    // Метод для описания действия
    public String hit(Utensils item){
        setState(State.IGNORE);
        return "В " + this.getName() + " прилетело " + item.getName() + ". ";
    }
}


