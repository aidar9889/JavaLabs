
package Test;

import lab6_3.Animal;
import lab6_3.Ape;
import lab6_3.Fish;
import lab6_3.Human;


public class labTest {
    
    public static void main(String args[]) {
        
        Fish fish = new Fish();
        fish.swim();
        System.out.println(fish.get());
        System.out.println();
        
        Animal anim = new Animal('m', 4, 30);
        anim.swim();
        anim.run();
        System.out.println(anim.get());
        System.out.println();
        
        Ape ape = new Ape('w', 0, 15, 1, "black");                
        ape.swim();
        ape.run();
        ape.climb();
        System.out.println(ape.get());
        System.out.println();
        
        Human hum = new Human();
        hum.swim();
        hum.run();
        hum.climb();
        System.out.println(hum.get());
        System.out.println(hum.get_skills());
        hum.say("Здравствуйте");
        System.out.println();
        
    }
}
