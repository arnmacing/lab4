package history;

//Перечисление состяний персонажей
public enum State {
    SCREAM,
    FEAR,
    IGNORE,
    MADNESS;

    // Статческий метод, который возвращает состояние персонажа, наименовывая его
    public static String locale(State state) {
        switch (state) {
            case FEAR: {
                return " вне себя от ужаса.";
            }
            case IGNORE: return " ничего не замечает.";
            case SCREAM: return " кричит.";
            case MADNESS: return " в бешестве.";
        }
        return "";
    }
}
