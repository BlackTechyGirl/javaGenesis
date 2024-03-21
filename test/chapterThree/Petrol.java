package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Petrol {
    @Test
    void testPercentageDiscount(){
        var petrol = new PetrolPurchase("Abuja", "3380",
                4, 200, 20);
        assertEquals(640, petrol.getPurchaseAmount());
    }
    @Test
    void testLocation(){
        var petrol = new PetrolPurchase("Abuja", "3380",
                4, 200, 20);
        assertEquals("Abuja", petrol.getLocation());
//        assertNotEquals();
//        assertTrue();
//        assertFalse();
//        assertNull();
//        assertNotNull();
//        assertThrows()
    }

}
