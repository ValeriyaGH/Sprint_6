import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionManeTest {
    private final String sex;
    private final boolean hasMane;

    public LionManeTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Самка", false},
                {"Самец", true},
        };
    }

    @Test
    public void checkOnlyMaleshouldHaveMane() throws Exception {
        Lion lion = new Lion(sex, new Feline());
        assertEquals(lion.doesHaveMane(), hasMane);

    }

}