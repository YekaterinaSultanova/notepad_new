package com.notepad;

public class Person {
    private static int counter = 0;
    private int id; //ID mozhno toljko 4itatj

    private String name;
    private String surname;
    private String phoneNumber;
    private String email;

    public Person() {
        counter++;
        id = counter;
    }

    public Person(String name, String surname, String phoneNumber) {
        this();
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getEmail() {return email; }


    public Person(int id, String name, String surname, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
