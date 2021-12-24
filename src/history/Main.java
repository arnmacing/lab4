package history;

import history.Dishes.*;
import history.Humans.*;
import history.Utensils.Poker;
import history.Utensils.Utensils;
import java.util.Scanner;

import static history.Items.*;

interface Understand{
    String understand();
}

enum RedOrBlackPlates {
    REDPLATES,
    BLACKPLATES
}

// Класс реализации текста
public class Main {

    public static void main(String[] args) {

        // Класс поварихи
        class Cook {
            // Метод для реализации действия поварихи
            public String drop() {
                return name + " кидает посуду.";
            }

            protected int CountTime = 0;
            protected String name = "Повариха";

            public String take() {
                return name + " взялась за другое дело.";
            }

            public String remove() {
                return name + " сняла с плиты.";
            }

            // Метод с исключением для реализации действия поварихи
            public String lose() throws Exception {
                if (CountTime == 1) {
                    throw new FindException();
                }
                CountTime++;
                return name + " потеряла немного времени.";
            }

            // Метод, в который мы передаём цвет тарелки
            public String hitPlates(RedOrBlackPlates plates) {
                if (plates == RedOrBlackPlates.REDPLATES) {
                    return name + " кидала красные тарелки";
                } else {
                    return name + " кидала чёрные тарелки";
                }
            }
        }

        // Анонимный класс
        Understand understand = new Understand() {
            @Override
            public String understand() {
                return "Ничего не произошло.";
            }
        };

        //Лямбда-выражение
        Understand newUnderstand = () -> {
            return "Нельзя было понять";
        };

	    Human duchess = new Duchess();
        Human baby = new Baby();
        Human alice = new Alice();
        Cook cook = new Cook();
        DropDishes dropDishes = new DropDishes();

        System.out.println(cook.drop());

        System.out.println("Сколько рук у поварихи?");
        Scanner handsCounter = new Scanner(System.in);
        int handsCount = handsCounter.nextInt();
        System.out.println("Сколько предметов посуды кидает повариха?");
        Scanner dishesCounter = new Scanner(System.in);
        int dishesCount = dishesCounter.nextInt();
        System.out.println("Тарелки какого цвета кидает повариха?");
        Scanner colorScanner = new Scanner(System.in);
        String color = colorScanner.nextLine();



        try {
            System.out.println(dropDishes.drop(handsCount, dishesCount));
        }
        catch (RuntimeException exception){
            System.out.println(exception.toString());
        }

        System.out.println("Летели тарелки " + color + " цвета.");

        try {
            System.out.println(cook.lose());
            System.out.println(cook.lose());
        }
        catch (Exception e){
            System.out.println(e.toString());
        }

        System.out.println(duchess.hit(poker));
        System.out.println(baby.hit(scoop));
        System.out.println(alice.hit(tong));
        System.out.println(cup.getAction());
        System.out.println(pan.getAction());
        System.out.println(plate.getAction());
        System.out.println(duchess.getState());
        System.out.println(baby.getState());
        System.out.println(alice.getState());


    }

}
