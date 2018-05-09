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
public class lab3_5 {
    public static void main(String[] args) {
        
        int[][] mass=new int[7][4];
        
        int [] mass2 = new int[mass.length];
        
        for (int i=0 ; i<7 ; i++){
            for (int j=0 ; j<4 ; j++){
                mass[i][j] = (int)(Math.random()*11) - 5    ;
                System.out.print(mass[i][j]+"   ");
                if(j==0)mass2[i]=mass[i][j];
                else mass2[i]*=mass[i][j];
                
//                if(j==mass[i].length-1)
//                    System.out.println(" ");
            }
        System.out.println();        
       }
    System.out.println();  
    
    int maxp=0,max_i=0;
    
     for(int i=0;i<mass2.length;i++){
            if(Math.abs(mass2[i])>maxp){
                maxp=mass2[i];
                max_i=i;
            }
        }
        
        System.out.println("Строка с наибольшим по модулю произведением элементов  имеет индекс - "+max_i);
    }
}
