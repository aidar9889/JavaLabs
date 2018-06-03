
package lab6_24;


public class Dog extends Pet {
    
    private boolean can_fly;
    
    public Dog() {
        super();
        this.can_fly = false;
    }
    
    public Dog(double weight, char sex, int age, boolean can_fly) {
        super(weight, sex, age);
        this.can_fly = can_fly;
    }
    
    public String get() {
        return ("weight: " + this.weight + '\n' +
                "sex: " + this.sex + '\n' +
                "age: " + this.age + '\n' +
                "can fly: " + this.can_fly);
    }
    
}
