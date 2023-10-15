import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void eatMeat() throws Exception {

        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamily() {

        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittens() {
        assertEquals(1, feline.getKittens());

    }

}