package chapterThree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CarApplication {

    @Test
    void checkPrice(){
        Car car1 = new Car("Honda", "2014", 1000);
        Car car2 = new Car("Mercedes", "2023", 2000);

        assertEquals(1000, car1.getPrice());
        assertEquals(2000, car2.getPrice());

    }
    @Test
    void checkDiscount(){
        Car car2 = new Car("Mercedes", "2023", 2000-(2000*0.07));

        Car car1 = new Car("Mercedes", "2014", 1000-(1000*0.05));

        assertEquals(1860, car2.getPrice());
        assertEquals(950, car1.getPrice());



    }
}
