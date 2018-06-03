package lab5;

import static java.lang.Math.abs;
import static java.lang.Math.floor;
import static java.lang.Math.pow;
import static java.lang.Math.random;
import static java.lang.Math.sqrt;


public class Circle {

    private double x;
    private double y;
    private double radius;
    
    public Circle() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }
    
    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = abs(radius);
    }
    
    
    public void rand_center() {
        this.x = floor(random()*199 - 99);
        this.y = floor(random()*199 - 99);
    }
    
    public String get_coords() {
        return ("(" + this.x + "; " + this.y + ")");
    }
    
    public double get_distance_to(Circle other) {
        double distance;
        distance = sqrt(pow(this.x - other.x, 2) + pow(this.y - other.y, 2));
        
        return distance;
    }
    
    
    
    /**
     * если окружности 
     * касаются только лишь в одной точке
     */
    
    public boolean is_tangent_to(Circle other) {
        double dist = this.get_distance_to(other);
        
        // Если центр окружности НЕ внутри друой окружности
        if (dist > this.radius && dist > other.radius)
            
            // Если суммы радиусов меньше расстояния, окружности не касаются
            return (this.radius + other.radius == dist);
        
        // Если центр окружности внутри друой окружности, центры не совпадают
        else if (dist > 0) {
            if (this.radius < other.radius)
                return (dist + this.radius == other.radius);
            else
                return (dist + other.radius == this.radius);
        }
        
        // Если центры совпадают, окружности не могут касаться только в одной точке
        else return false;
    }
    
    /**
     * true если окружности 
     * касаются хотя бы в одной точке
     */
    public boolean is_touching(Circle other) {
        double dist = this.get_distance_to(other);
        
        // Если центр окружности НЕ внутри друой окружности
        if (dist > this.radius && dist > other.radius)
            
            // Если суммы радиусов меньше расстояния, окружности не касаются
            return (this.radius + other.radius >= dist);
        
        // Если центр окружности внутри друой окружности
        else {
            if (this.radius < other.radius)
                return (dist + this.radius >= other.radius);
            else
                return (dist + other.radius >= this.radius);
        }
    }
}
