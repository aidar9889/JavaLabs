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


public class lab8_6 {
    public static void main(String args[]) {
        
        HashMap<String, Object> map = new HashMap();
        
        map.put("Integer", new Integer(74));
        map.put("String", "74");
        map.put("Float", new Float(7.4));
        map.put("int", 7.4);
        map.put("char", 'n');
        map.put("double", 7.4);
        map.put("Long", new Long(74));
        map.put("byte", (byte)74);
        map.put("short", (short)74);
        map.put("HashMap", new HashMap());
        map.put("Object", new Object());
        
        for (String key : map.keySet())
            System.out.println(key + " " + map.get(key));
        
    }
}
