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
public class Dog extends Pet {
    
    protected boolean can_fight;
    
    public Dog() {
        super();
        this.can_fight = false;
    }
    
    public Dog(String name, double weight, char sex, int age, boolean can_fight) {
        super(name, weight, sex, age);
        this.can_fight = can_fight;
    }
    
    public String get() {
        return (super.get() + '\n' +
                "can fight: " + this.can_fight);
    }
    
    public void voice() {
        System.out.println("gaw");
    }
    
}
