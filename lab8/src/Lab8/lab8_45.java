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


public class lab8_45 {
    
    public static void main(String args[]) {
        
        HashMap<String, String> map = new HashMap();
        
        for (int i = 1; i <= 10; i++)
            map.put("Ключ" + i, "Значение" + i);
        
        for (String str : map.keySet()) {
            System.out.println(str);
        }
        
        for (String str : map.keySet()) {
            System.out.println(map.get(str));
        }
        
    }
}
