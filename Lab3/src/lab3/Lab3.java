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
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] mass = new int[10];
        for(int i=0;i<10;i++){
            mass[i]=2*(i+1);
            System.out.print(mass[i]+" ");
        }    
        System.out.println ();
        for(int j=0;j<10;j++){
            System.out.println (mass[j]);
        }            
    }
    
}
