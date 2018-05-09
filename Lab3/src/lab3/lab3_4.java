
package lab3;


public class lab3_4 {
    public static void main(String[] args) {

        int[][] mass=new int[8][5];
        
        for (int i=0 ; i<8 ; i++){
            for (int j=0 ; j<5 ; j++){
                mass[i][j] = ((int)(Math.random()*90+ 10))    ;
                System.out.print(mass[i][j]+" ");
            }
        System.out.println();        
       }
        
    }
}
