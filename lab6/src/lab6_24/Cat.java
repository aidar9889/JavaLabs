
package lab6_24;


public class Cat extends Pet {
    
    private String fur_color;
    
    public Cat() {
        super();
        this.fur_color = "black";
    }
    
    public Cat(double weight, char sex, int age, String fur_color) {
        super(weight, sex, age);
        this.fur_color = fur_color;
    }
    
    public String get() {
        return ("weight: " + this.weight + '\n' +
                "sex: " + this.sex + '\n' +
                "age: " + this.age + '\n' +
                "fur color: " + this.fur_color);
    }
    
    public void Wait() {
        this.weight -= 0.2;
        this.age += 1;
    }
    
    public void feed() {
        this.weight += 0.1;
    }
    
    public void set_fur(String color) {
        this.fur_color = color;
    }
    
}
