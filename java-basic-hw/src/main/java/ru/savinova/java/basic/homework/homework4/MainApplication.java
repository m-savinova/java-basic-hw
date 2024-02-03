package ru.savinova.java.basic.homework.homework4;

public class MainApplication {
    public static void main(String[] args) {
        User[] users = {
                new User("Иванов", "Иван", "Иванович", 18, "i@mail.ru"),
                new User("Иванов1", "Иван", "Иванович", 20, "i@mail.ru"),
                new User("Иванов2", "Иван", "Иванович", 24, "i@mail.ru"),
                new User("Иванов3", "Иван", "Иванович", 31, "i@mail.ru"),
                new User("Иванов4", "Иван", "Иванович", 40, "i@mail.ru"),
                new User("Иванов5", "Иван", "Иванович", 41, "i@mail.ru"),
                new User("Иванов6", "Иван", "Иванович", 8, "i@mail.ru"),
                new User("Иванов7", "Иван", "Иванович", 1, "i@mail.ru"),
                new User("Иванов8", "Иван", "Иванович", 62, "i@mail.ru")
        };
        for (int i = 0; i < users.length; i++) {
            if (users[i].getEarOfBirth() > 40) {
                users[i].printUserInfo();
            }
        }

        Box box = new Box("красная");
        box.printBoxInfo();
        box.openOrCloseBox();
        box.setBoxColor("зелёная");
        box.setBoxColor("пурпурная");
        box.printBoxInfo();
        box.putContent("book1");
        box.openOrCloseBox();
        box.putContent("book1");
        box.putContent("book2");
        box.putContent("book3");
        box.printBoxInfo();
        box.getContent("book1");
        box.openOrCloseBox();
    }
}