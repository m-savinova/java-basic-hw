package ru.savinova.java.basic.homework.homework4;

public class User {
    private String secondName;
    private String name;
    private String middleName;
    private int yearOfBirth;
    private String email;

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String secondName, String name, String middleName, int yearOfBirth, String email) {
        this.secondName = secondName;
        this.name = name;
        this.middleName = middleName;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }

    public void printInfo() {
        System.out.println("ФИО: " + secondName + " " + name + " " + middleName + "\n" + "Год рождения: "
                + yearOfBirth + "\n" + "e-mail: " + email + "\n");
    }
}