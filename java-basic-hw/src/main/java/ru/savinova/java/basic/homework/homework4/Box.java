package ru.savinova.java.basic.homework.homework4;

import java.util.Objects;

public class Box {
    private final String[] boxSize;
    private String boxColor;
    private String status;

    public void setBoxColor(String boxColor) {
        this.boxColor = boxColor;
        System.out.println("Теперь коробка " + boxColor);
    }

    public Box(String boxColor) {
        this.boxSize = new String[3];
        this.boxColor = boxColor;
        this.status = "открыта";
    }

    public void printBoxInfo() {
        System.out.print("Коробка " + boxColor + ", сейчас она " + status + " и в ней " + size() +
                " предмет(а)(ов) из 3... ");
        contentInBox();
    }

    public void openOrCloseBox() {
        if (Objects.equals(status, "открыта")) {
            status = "закрыта";
            System.out.println("Закрываем коробку... Коробка закрыта!");
        } else {
            status = "открыта";
            System.out.println("Открываем коробку... Коробка открыта!");
        }
    }

    public void putContent(String item) {
        if (Objects.equals(status, "открыта")) {
            for (int i = 0; i < boxSize.length; i++) {
                if (boxSize[i] == null) {
                    boxSize[i] = item;
                    System.out.print("В коробке есть место! Положили " + item + " в коробку. В коробке: ");
                    contentInBox();
                    return;
                }
            }
        } else {
            System.out.println("Коробка закрыта, откройте её прежде, чем класть в неё свои предметы.");
        }
    }

    public String getContent(String item) {
        for (int i = 0; i < boxSize.length; i++) {
            if (item.equals(boxSize[i])) {
                boxSize[i] = null;
                System.out.print("Вытащили из коробки предмет. В коробке: ");
                contentInBox();
            }
        }
        return null;
    }

    int size() {
        int count = 0;
        for (int i = 0; i < boxSize.length; i++) {
            if (boxSize[i] != null) {
                count++;
            }
        }
        return count;
    }

    private void contentInBox() {
        System.out.print("[");
        for (int i = 0; i < boxSize.length; i++) {
            if (boxSize[i] != null) {
                System.out.print(boxSize[i] + " ");
            }
        }
        System.out.println("]");
    }
}