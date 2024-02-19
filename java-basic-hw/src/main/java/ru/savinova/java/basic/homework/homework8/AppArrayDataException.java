package ru.savinova.java.basic.homework.homework8;

public class AppArrayDataException extends RuntimeException {
    public AppArrayDataException(int column, int row) {
        super("В ячейке [" + column + "][" + row + "] не удалось преобразование в int");
    }
}
