/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polim_2;

/**
 *
 * @author Acer
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class test {
    
    public static String check(Object obj) {
        
        Pattern cat = Pattern.compile(".*Cat@.*");
        Pattern dog = Pattern.compile(".*Dog@.*");
        Pattern bird = Pattern.compile(".*Bird@.*");
        Pattern lamp = Pattern.compile(".*Lamp@.*");
        
        Matcher cat_match = cat.matcher(obj.toString());
        Matcher dog_match = dog.matcher(obj.toString());
        Matcher bird_match = bird.matcher(obj.toString());
        Matcher lamp_match = lamp.matcher(obj.toString());
        
        if (cat_match.matches()) return "Кошка";
        if (dog_match.matches()) return "Собака";
        if (bird_match.matches()) return "Птица";
        if (lamp_match.matches()) return "Лампа";
        
        return "";
    }
    
    public static void main(String args[]) {
        
        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Lamp lamp = new Lamp();
        
        System.out.println(check(cat));
        System.out.println(check(dog));
        System.out.println(check(bird));
        System.out.println(check(lamp));
        
    }    
}
