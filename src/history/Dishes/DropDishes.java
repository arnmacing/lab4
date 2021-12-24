package history.Dishes;

import history.NoHandsException;

//Класс кинутой посуды
public class DropDishes {
        String name = "Повариха ";

        //Метод, который собирает предложение о том, сколько предметов посуды было кинуто руками поварихи. Исключение при вводе с консоли значения "0".
        public String drop(int hands, int dishes) {
            //Исключение для случая, когда частное - нецелое число
            class NonWholeException extends RuntimeException {
                // Метод для реализации исключения
                public String toString() {
                    return "Повариха кидала " + hands + " руками " + dishes + " предметов посуды.";
                }
            }

            if (hands == 0 | dishes == 0)
                throw new NoHandsException();
            if (dishes/hands == 0)
                throw new NonWholeException();
            return name + " кидала по " + dishes/hands + " предметов посуды каждой из " + hands +  " рук.";
        }
}
