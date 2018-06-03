package lab5;


public class CircleTest {
    
    public static void main(String args[]) {
        
        Circle cr1 = new Circle(0, 0, 5);
        Circle cr2 = new Circle(10, 0, 5); // Касается cr1 в одной точке
        Circle cr3 = new Circle(10.0000001, 0, 5);
        Circle cr4 = new Circle(3, 4, 3);
        Circle cr5 = new Circle(0, 0, 4.99999); // Внутри cr1, не касается
        Circle cr6 = new Circle(1, 0, 4); // Внутри cr1, касается в одной точке
                
        System.out.println(cr1.get_distance_to(cr1)); // Предсказуемо
        System.out.println(cr1.get_distance_to(cr2)); // Предсказуемо
        System.out.println(cr1.get_distance_to(cr3)); // Предсказуемо
        System.out.println(cr1.get_distance_to(cr4)); // Египетский треугольник
        System.out.println(cr1.is_touching(cr4)); // Касается
        System.out.println(cr1.is_tangent_to(cr4)); // Но не в одной точке
        System.out.println(cr1.is_touching(cr2)); // Касается
        System.out.println(cr1.is_tangent_to(cr2)); // Только в одной точке
        System.out.println(cr1.is_touching(cr3)); // Не касается
        System.out.println(cr1.is_touching(cr5)); // Не касается
        System.out.println(cr1.is_touching(cr6)); // Касается изнутри
        System.out.println(cr1.is_tangent_to(cr6)); // Касается в одной точке
        
        Circle cr0 = new Circle();
        System.out.println(cr0.get_coords());
        for (int i = 0; i < 5; i++) {
            cr0.rand_center();
            System.out.println(cr0.get_coords());
        }
        
    }
}