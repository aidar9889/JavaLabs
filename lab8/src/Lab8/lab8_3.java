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


public class lab8_3 {
    public static void main(String args[]) {
        
        Cat[] cats = new Cat[10];
        String[] names = new String[] {"Артур", "Балтазар", "Виски","Пушок",
            "Огонек", "Марс", "Педро", "Лукас", "Цезарь", "Кузя"};
        
        HashMap<String, Cat> cat_map = new HashMap();
        
        for (int i = 0; i < 10; i++) {
            cats[i] = new Cat(names[i]);
            cat_map.put(cats[i].get_name(), cats[i]);
        }
        
        Iterator<HashMap.Entry<String, Cat>> iter;
        iter = cat_map.entrySet().iterator();
        
        while (iter.hasNext()) {
            HashMap.Entry<String, Cat> ent = iter.next();
            System.out.println(ent.getKey() + " - " + ent.getValue());
        }
                
    }
}
