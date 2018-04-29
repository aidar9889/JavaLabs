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
public class lab2_6 {
    
    public static int min2 (int m,int n){
        if (m>n)
        return n;
        else return m;
    }
    
    public static int min4 (int m,int n,int b, int v ){
        return min2(min2(m,n),min2(b,v));
        
    }
     
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        int m,n,b,v;
         System.out.print("Введите целые числа: ");
        if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
            m = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
            if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
                n = sc.nextInt(); 
                if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
                    b = sc.nextInt();
                    if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
                        v = sc.nextInt();
                        System.out.print(min4(m,n,b,v));
                    }
                }    
            }
        }       
    }
}
