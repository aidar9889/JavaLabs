
package lab4;

import java.util.Scanner;
import static lab4.Lab4.random;

public class lab4_2 {
    
     public static void pr(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целые числа: ");
        if(sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[][] arr = new int[5][10];
        
            for (int k = 0; k < 5; k++)
                for (int i = 0; i < 10; i++)
                    arr[k][i] = random(a, b);
                    
            for (int k = 0; k < 5; k++)
                pr(arr[k]);
            
        }
    }    
}

