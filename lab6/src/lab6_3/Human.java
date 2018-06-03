
package lab6_3;


public class Human extends Ape {
    
    protected String name;
    protected int age;
    protected int IQ;
    protected String hair_color;
    

    public Human() {
        super('m', 0, 7, 0);
        this.name = "Igor";
        this.age = 17;
        this.IQ = 70;
        this.hair_color = "black";
    }
    
    public Human(String name) {
        super('m', 0, 7, 0);
        this.name = name;
        this.age = 17;
        this.IQ = 70;
        this.hair_color = "black";
    }
    
    public Human(String name, int age, char sex) {
        super(sex, 0, 7, 0);
        this.name = name;
        this.age = age;
        this.IQ = 70;
        this.hair_color = "black";
    }
    
    public Human(String name, int age, char sex, int IQ) {
        super(sex, 0, 7, 0);
        this.name = name;
        this.age = age;
        this.IQ = IQ;
        this.hair_color = "black";
    }
    
    public Human(String name, int age, char sex, int IQ, String hair) {
        super(sex, 0, 7, 0);
        this.name = name;
        this.age = age;
        this.IQ = IQ;
        this.hair_color = hair;
    }
    
    public String get() {
        return ("name: " + this.name + '\n' +
                "age: " + this.age + '\n' +
                "sex: " + this.sex + '\n' + 
                "hair: " + this.hair_color + '\n' +
                "IQ: " + this.IQ);
    }
    
    public String get_skills() {
        return ("running: " + this.running_speed + '\n' +
                "swimming: " + this.swimming_speed + '\n' +
                "climbing: " + this.climbing_skill);
    }
    
    public void say(String message) {
        System.out.println(this.name + ": " + message);
    }
    
}
