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
public class lab3_2 {
    public static void main(String[] args) {
        
        int[] mass = new int[50];
        
        for(int i=0;i<50;i++){
            mass[i]= 1+2*i;
            System.out.print(mass[i]+" ");
        }
          
        System.out.println ();   
        
        for(int i=0;i<50;i++){
            mass[i]=98+(1-2*i);
            System.out.print(mass[i]+" ");
        }               
    }
}
