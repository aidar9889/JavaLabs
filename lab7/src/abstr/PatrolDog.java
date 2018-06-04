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
public class PatrolDog extends Dog {
    
    public PatrolDog() {
        super();
        this.can_fight = true;
    }
    
    public PatrolDog(String name, double weight, char sex, int age, boolean can_fight) {
        super(name, weight, sex, age, can_fight);
    }
    
    public void voice() {
        System.out.println("arrr");
    }
}
