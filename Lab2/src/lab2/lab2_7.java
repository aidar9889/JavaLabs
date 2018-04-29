/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class lab2_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        int x,y;
        System.out.print("Введите целые числа: ");
        if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
          x = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
            if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
                y = sc.nextInt(); 
                if (x>0){
                    if (y>0)  System.out.print("Первая четверть");
                    else System.out.print("Четвертая четверть");
                }
                else if (y>0)  System.out.print("Вторая четверть");
                    else System.out.print("Третья четверть");
            }
        }       
    }
}
