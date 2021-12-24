package history;

import history.Dishes.Cup;
import history.Dishes.Dishes;
import history.Dishes.Pan;
import history.Dishes.Plate;
import history.Utensils.Poker;
import history.Utensils.Scoop;
import history.Utensils.Tong;
import history.Utensils.Utensils;

// Класс для предметов посуды
public class Items {
    protected static Utensils poker = new Poker();
    protected static Utensils scoop = new Scoop();
    protected static Utensils tong = new Tong();

    protected static Dishes pan = new Pan();
    protected static Dishes plate = new Plate();
    protected static Dishes cup = new Cup();
}
