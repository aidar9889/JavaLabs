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
public abstract class Pet {
    
    protected String name;
    protected boolean hungry;
    protected double weight;
    protected final char sex;
    protected int age;
    
    public Pet() {
        this.name = "Bulka";
        this.hungry = true;
        this.weight = 3;
        this.sex = 'm';
        this.age = 1;
    }
    
    public Pet(String name, double weight, char sex, int age) {
        this.name = name;
        this.hungry = true;
        this.weight = weight;
        this.sex = sex == 'm' ? 'm' : 'w';
        this.age = age;
    }
    
    public String get() {
        return ("name: " + this.name + '\n' +
                "age: " + this.age + '\n' +
                "sex: " + this.sex + '\n' +
                "weight: " + this.weight + '\n' +
                "hungry: " + this.hungry);
    }
    
    public abstract void voice();
    
}
