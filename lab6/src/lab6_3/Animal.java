
package lab6_3;

public class Animal extends Fish{
    
    protected double running_speed;
    
    public Animal() {
        super();
        this.swimming_speed /= 3;
        this.running_speed = 16;
    }
    
    public Animal(char sex, double swimming_speed, double running_speed) {
        super(sex, swimming_speed);
        if (running_speed < 0) running_speed = 0;
        this.running_speed = running_speed;
    }
    
    public void run() {
        if (this.running_speed == 0) System.out.println("Не умеет бегать");
        System.out.println("Бежит со скоростью " + this.running_speed + " км/ч.");
    }
    
    public String get() {
        return (super.get() + '\n' + "running_speed: " + this.running_speed);
    }
    
}
