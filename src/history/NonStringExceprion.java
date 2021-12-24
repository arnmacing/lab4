package history;

//Исключение для случая, когда переменная count не типа String
class NonStringException extends RuntimeException {

    // Метод для реализации исключения
    public String toString() {
        return "Вы ввели не буковки!!!";
    }
}
