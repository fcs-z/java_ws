import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void testCircle() {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2);

        System.out.println(circle1.toString());
        System.out.println(circle2.toString());

        System.out.println(circle1.equals(circle2));
    }

}