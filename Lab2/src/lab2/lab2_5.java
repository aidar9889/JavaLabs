package lab2;

import java.util.Scanner;


public class lab2_5 {
    public static void main(String args[]) {

        String s1, s2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введи первое имя:");
        s1 = sc.nextLine();
        System.out.println("Введи второе имя:");
        s2 = sc.nextLine();

        if (s1.equals(s2)) System.out.println("Имена идентичны");
        else if (s1.length() == s2.length()) System.out.println("Длины имен равны");
        else System.out.println("Имена разные");

    }
}