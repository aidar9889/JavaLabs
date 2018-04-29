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
public class lab2_2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        int m,n;
        System.out.print("Введите целое число: ");
        if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
          m = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
            if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
                n = sc.nextInt();  
                for (int i=0;i<m;i++){
                    for(int j=0;j<n;j++)
                        {
                            System.out.print(8);
                            
                        }
                    System.out.println ();
                }
            }
        }
    }
}
