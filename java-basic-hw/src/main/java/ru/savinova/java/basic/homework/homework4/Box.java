package ru.savinova.java.basic.homework.homework4;

public class Box {
    private final String[] size;
    private String color;
    private Boolean status;

    public void setColor(String color) {
        this.color = color;
        System.out.println("Теперь коробка " + color);
    }

    public String getStatus() {
        return ((status) ? "открыта" : "закрыта");
    }

    public Box(String color) {
        this.size = new String[3];
        this.color = color;
        this.status = true;
    }

    public void printInfo() {
        System.out.print("Коробка " + color + ", сейчас она " + getStatus() + " и в ней " + countOfThings() +
                " предмет(а)(ов) из 3... ");
        showContent();
    }

    public void openOrClose() {
        if (status) {
            status = false;
            System.out.println("Закрываем коробку... Коробка закрыта!");
        } else {
            status = true;
            System.out.println("Открываем коробку... Коробка открыта!");
        }
    }

    public void put(String item) {
        if (status) {
            for (int i = 0; i < size.length; i++) {
                if (size[i] == null) {
                    size[i] = item;
                    System.out.print("В коробке есть место! Положили " + item + " в коробку. В коробке: ");
                    showContent();
                    return;
                }
            }
        } else {
            System.out.println("Коробка закрыта, откройте её прежде, чем класть в неё свои предметы.");
        }
    }

    public void get(String item) {
        for (int i = 0; i < size.length; i++) {
            if (item.equals(size[i])) {
                size[i] = null;
                System.out.print("Вытащили из коробки предмет. В коробке: ");
                showContent();
            }
        }
    }

    private int countOfThings() {
        int count = 0;
        for (int i = 0; i < size.length; i++) {
            if (size[i] != null) {
                count++;
            }
        }
        return count;
    }

    private void showContent() {
        System.out.print("[");
        for (int i = 0; i < size.length; i++) {
            if (size[i] != null) {
                System.out.print(size[i] + " ");
            }
        }
        System.out.println("]");
    }
}