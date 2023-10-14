import com.example.Animal;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
    Animal animal = new Animal();

    @Test
    public void getFamily() {
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }
}