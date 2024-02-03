package ru.savinova.java.basic.homework.homework4;

public class MainApplication {
    public static void main(String[] args) {
        User[] users = {
                new User("Иванов", "Иван", "Иванович", 1985, "i@mail.ru"),
                new User("Иванов1", "Иван", "Иванович", 1990, "i@mail.ru"),
                new User("Иванов2", "Иван", "Иванович", 2008, "i@mail.ru"),
                new User("Иванов3", "Иван", "Иванович", 1943, "i@mail.ru"),
                new User("Иванов4", "Иван", "Иванович", 1957, "i@mail.ru"),
                new User("Иванов5", "Иван", "Иванович", 1020, "i@mail.ru"),
                new User("Иванов6", "Иван", "Иванович", 2023, "i@mail.ru"),
                new User("Иванов7", "Иван", "Иванович", 2000, "i@mail.ru"),
                new User("Иванов8", "Иван", "Иванович", 1982, "i@mail.ru")
        };
        for (int i = 0; i < users.length; i++) {
            if (2024 - (users[i].getYearOfBirth()) > 40) {
                users[i].printInfo();
            }
        }
        Box box = new Box("красная");
        box.printInfo();
        box.openOrClose();
        box.setColor("зелёная");
        box.setColor("пурпурная");
        box.printInfo();
        box.put("book1");
        box.openOrClose();
        box.put("book1");
        box.put("book2");
        box.put("book3");
        box.printInfo();
        box.get("book1");
        box.openOrClose();
    }
}