
package lab6_3;

public class Fish {
    
    protected final char sex;
    protected double swimming_speed;
    
    public Fish() {
        this.sex = 'm';
        this.swimming_speed = 18;
    }
    
    public Fish(char sex, double swimming_speed) {
        this.sex = sex == 'm' ? 'm' : 'w';
        if (this.swimming_speed < 0) this.swimming_speed = 0;
        this.swimming_speed = swimming_speed;
    }
    
    public void swim() {
        if (this.swimming_speed == 0) 
            System.out.println("Не умеет плавать");
        else
            System.out.println("Плывет со скоростью " + this.swimming_speed + " км/ч.");
    }
    
    public String get() {
        return ("sex: " + this.sex + '\n' +
                "swimming_speed: " + this.swimming_speed);
    }
    
}
