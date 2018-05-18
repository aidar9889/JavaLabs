
package lab4;

import java.util.Scanner;
import static lab4.Lab4.random;
import static lab4.lab4_2.pr;


public class lab4_3 {
    
    public static void sort(int arr[]) {
        int out,in;
        
        for (out =arr.length-1 ; out>1; out--) {
            for(in=0;in<out;in++){
                if(arr[in]>arr[in+1]){
                    int temp = arr[in];
                    arr[in] = arr[in+1];
                    arr[in+1] = temp;
                }
            }    
        }            
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целые числа: ");
        if(sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] arr = new int[20];

            for (int i = 0; i < 20; i++)
                arr[i] = random(a, b);

            pr(arr);

            sort(arr);
            
            pr(arr);
        }    
    }
}
