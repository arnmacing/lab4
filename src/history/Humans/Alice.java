package history.Humans;

import history.State;
import history.Utensils.Utensils;

// Класс Алисы
public class Alice extends Human {
    //Метод для задания имени через конструктор
    public Alice(){
        super("Алиса");
    }


    @Override
    // Метод для описания действия
    public String hit(Utensils item){
        setState(State.FEAR);
        return "В " + this.getName() + " прилетело " + item.getName() + ". ";
    }

    Subject subject = new Subject();
    //Метод описывающий поиск
    public String search(){
        return subject.msg();
    }

 //inner   
    //Класс для привлекательного предмета беседы
    protected class Subject{
        //Метод для задания имени
        protected String name = "более привлекательный предмет для беседы.";
        //Метод для реализации предложения
        public String msg(){
            return Alice.this.getName() + " старалась найти " + name;
        }
    }
}
