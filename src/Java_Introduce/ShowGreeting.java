package Java_Introduce;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class ShowGreeting {

    private static void Display(String name) {
        System.out.printf("Hello: %10s", name);
    }

    public static void main(String[] args) {

        System.out.println("Enter your name:");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        ShowGreeting.Display(name);
    }
}
