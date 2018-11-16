package com.notepad;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<>

    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("cmd: ");
            String cmd = scanner.next();
            switch (cmd) {
                case "create"
                    ;
                    createPerson();
                    break;
                case "help"
                    ;
                    showHelp();
                    break;
                case "List":
                    list();
                    break;
                case "exit";                    ;
                    return;
                default;
                    System.out.println("Wrong command. Try help");
            }
        }
    }
}
