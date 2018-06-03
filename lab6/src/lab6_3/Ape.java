
package lab6_3;


public class Ape extends Animal {
    
    protected int climbing_skill;
    private String fur_color;
    
    public Ape() {
        super();
        this.climbing_skill = 1;
        this.fur_color = "brown";
    }
    
    public Ape(char sex, 
            double swimming_speed, 
            double running_speed, 
            int climbing_skill, String fur_color) {
        
        super(sex, swimming_speed, running_speed);
        this.climbing_skill = climbing_skill;
        this.fur_color = fur_color;
    }
    
    protected Ape(char sex, 
            double swimming_speed, 
            double running_speed, 
            int climbing_skill) {
        
        super(sex, swimming_speed, running_speed);
        if (climbing_skill > 1) climbing_skill = 1;
        if (climbing_skill < 0) climbing_skill = 0;
        this.climbing_skill = climbing_skill;
    }
    
    public void climb() {
        switch (this.climbing_skill) {
            case 0:
                System.out.println("Не умеет карабкаться");
                break;
            case 1:
                System.out.println("Умеет карабкаться");
                break; 
            default:
                System.out.println("Неизвестно");
        }
    }
    
    public String get() {
        return (super.get() + '\n' + 
                "climbing skill: " + this.climbing_skill + '\n' +
                "fur color: " + this.fur_color);
    }
    
}
