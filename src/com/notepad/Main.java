package com.notepad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<Person> records = new ArrayList<>();

    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("What do you want to do?");
            String cmd = scanner.next();
            switch (cmd) {
                case "create":
                    createPerson();
                    break;
                case "help":
                    showHelp();
                    break;
                case "list":
                    showList();
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Wrong command. Try 'help'");
            }
        }
    }

    private static void showList() {
        records.forEach(person -> {
            String name = person.getName();
            String surname = person.getSurname();
            String phoneNumber = person.getPhoneNumber();

            System.out.println(name + " " + surname + " " + phoneNumber);
        });
    }

    private static void showHelp() {
        System.out.println("create - create new person");
        System.out.println("list - show list of persons");
        System.out.println("exit - exit from program");

    }

    private static void createPerson() {
        System.out.println("Name: ");
        String name = scanner.next();
        System.out.println("Surname: ");
        String surname = scanner.next();
        System.out.println("Phone number: ");
        String phoneNumber = scanner.next();

        Person person = new Person(name, surname, phoneNumber);
        records.add(person);
    }
}
