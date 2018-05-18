
package lab4;

import java.util.Scanner;

public class Lab4 {
    public static int random (int a,int b){
        int k = (int)(Math.random()*a+b);
        return k;
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целые числа: ");
        if(sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int[] mass=new int[20];
            for(int i =0;i<20;i++){
                mass[i]=random(a,b);
                System.out.print(mass[i]+" ");
            }
        }    
    }
    
}
