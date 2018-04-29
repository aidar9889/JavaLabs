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
public class lab2_4 {
    
    public static int min (int m,int n){
        if (m>n)
         return n;
        else return m;
    }
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        int m,n;
         System.out.print("Введите целое число: ");
        if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
          m = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
            if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
                n = sc.nextInt(); 
                System.out.print(min(m,n));
            }
        }       
    }
}
