
package lab6_24;



public class Pet {
    
    protected double weight;
    protected final char sex;
    protected int age;
    
    public Pet() {
        this.weight = 4;
        this.sex = 'm';
        this.age = 0;
    }
    
    public Pet(double weight, char sex, int age) {
        this.weight = weight;
        this.sex = sex == 'm' ? 'm' : 'w';
        this.age = age;
    }
    
}
