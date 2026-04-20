package org.scoula.lib;

import java.util.Scanner;

public class Input {

    private static final Scanner sc = new Scanner(System.in);

    public static String read(String title) {
        System.out.print(title);
        return sc.nextLine();
    }

    public static String read(String title, String defaultValue) {
        System.out.print(title + "(" + defaultValue + "): ");
        String userText = sc.nextLine().trim();
        if(userText.isEmpty()) return defaultValue;
        return userText;
    }

    public static int readInt(String title) {
        System.out.print(title);
        return Integer.parseInt(sc.nextLine());
    }

    public static boolean confirm(String title, boolean defaultValue) {
        String select = defaultValue ? "(Y/n)" : "(y/N)";

        System.out.print(title + " " + select + ": ");
        String userText = sc.nextLine().trim().toLowerCase();

        if(userText.isEmpty()) return defaultValue;
        return userText.equals("y");
    }

    public static boolean confirm(String title) {
        return confirm(title, true);
    }


}
