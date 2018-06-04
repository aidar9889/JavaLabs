/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstr;

/**
 *
 * @author Acer
 */
public class Cat extends Pet {
    
    private String fur_color;
    
    public Cat() {
        super();
        this.fur_color = "white";
    }
    
    public Cat(String name, double weight, char sex, int age, String fur_color) {
        super(name, weight, sex, age);
        this.fur_color = fur_color;
    }
    
    public String get() {
        return (super.get() + '\n' +
                "fur color: " + this.fur_color);
    }
    
    public void Wait() {
        this.weight -= 0.3;
        this.hungry = true;
        this.age += 1;
    }
    
    public void feed() {
        this.hungry = false;
        this.weight += 0.1;
    }
    
    public void set_fur(String color) {
        this.fur_color = color;
    }
    
    public void voice() {
        System.out.println("Meow");
    }
    
}
