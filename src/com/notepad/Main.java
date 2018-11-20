package com.notepad;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static final String EMAIL = scanner.next();
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
                case "delete":
                    deleteId();
                    return;
                case "exit":
                    return;
                default:
                    System.out.println("Wrong command. Try 'help'");
            }
        }
    }

    private static void showList() {
        records.forEach(person -> {
            System.out.println(person);
        });
    }

    private static void showHelp() {
        System.out.println("create - create new person");
        System.out.println("list - show list of persons");
        System.out.println("exit - exit from program");
        System.out.println("delete - ID deletion");

    }

    private static void createPerson() {
        System.out.println("Name: ");
        String name = scanner.next();

        System.out.println("Surname: ");
        String surname = scanner.next();

        System.out.println("Phone number: ");
        String phoneNumber = scanner.next();

        if (phoneNumber) = Random rand;
        rand.nextInt(5) + 1;
        long t1 = System.currentTimeMillis();
        for (int i = 1; i <= 5; i++) {
            int phoneNumber = readPhoneNumber();
            if (phoneNumber == PhoneNumber) {}

        }
        while ("")



        System.out.println("Email: ");
        String email ????? = scanner.next();

        Person person = new Person(name, surname, phoneNumber);
        records.add(person);
    }

    private static void deleteId() {
        System.out.println("Which ID to delete?");
        ???????
        System.out.println("ID " + "is deleted");

    }
}
