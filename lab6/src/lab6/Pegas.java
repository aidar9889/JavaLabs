
package lab6;


public class Pegas extends Horse {
    
    private boolean is_flying;
    
    public Pegas(String name) {
        super(name);
        this.is_flying = false;
    }
    
    public void fly() {
        this.is_flying = true;
    }
    
    public void land() {
        this.is_flying = false;
    }
    
    public boolean is_flying() {
        return this.is_flying;
    }
    
}
