/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Acer
 */
public class lab3_3 {
    public static void main(String[] args) {
        
       int[] mass=new int[15];

       int count = 0;
       
       
       for (int i=0 ; i<15 ; i++){
           mass[i] = (int)(Math.random()*10) ;

       }
       
       for (int i = 0; i < mass.length; i++)
           if (mass[i] % 2 == 0)
               count++;
       
       System.out.println( java.util.Arrays.toString(mass) );
       System.out.println("Количество четных чисел: " + count);
       

    }
}
