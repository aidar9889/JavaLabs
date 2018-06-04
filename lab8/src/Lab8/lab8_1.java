/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

/**
 *
 * @author Acer
 */
import java.util.HashSet;
import java.util.Iterator;


public class lab8_1 {
    public static void main(String args[]) {
        
        HashSet plants = new HashSet();
        
        plants.add("арбуз");
        plants.add("банан");
        plants.add("вишня");
        plants.add("груша");
        plants.add("дыня");
        plants.add("ежевика");
        plants.add("жень-шень");
        plants.add("земляника");
        plants.add("ирис");
        plants.add("картофель");
        
        Iterator iter = plants.iterator();
        
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        
    }
}
