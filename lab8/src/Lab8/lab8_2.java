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
import java.util.HashMap;
import java.util.Iterator;


public class lab8_2 {
    public static void main(String args[]) {
        
        HashMap<String, String> plants = new HashMap();
        
        plants.put("арбуз", "ягода");
        plants.put("банан", "трава");
        plants.put("вишня", "ягода");
        plants.put("груша", "фрукт");
        plants.put("дыня", "овощ");
        plants.put("ежевика", "куст");
        plants.put("жень-шень", "корень");
        plants.put("земляника", "ягода");
        plants.put("ирис", "цветок");
        plants.put("картофель", "клубень");
        
        Iterator<HashMap.Entry<String, String>> iter;
        iter = plants.entrySet().iterator();
        
        while (iter.hasNext()) {
            HashMap.Entry<String, String> ent = iter.next();
            
            System.out.println(ent.getKey() + " - " + ent.getValue());
        }
        
    }
}
