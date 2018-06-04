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
public class Snake extends Pet {
    
    public String get() {
        return ("weight: " + this.weight + '\n' +
                "sex: " + this.sex + '\n' +
                "age: " + this.age);
    }
    
    public void voice() {
        System.out.println("sss");
    }
}
