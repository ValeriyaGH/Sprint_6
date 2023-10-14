import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AnimalGetFoodTest {
    private final String animalKind;
    private final List<String> typesOfFood;

    public AnimalGetFoodTest(String animalKind, List<String> typesOfFood) {
        this.animalKind = animalKind;
        this.typesOfFood = typesOfFood;
    }

    @Parameterized.Parameters
    public static Object[][] paramsData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},

        };
    }

    @Test
    public void checkGetCorrectFood() throws Exception {
        Animal animal = new Animal();
        List<String> actual = animal.getFood(animalKind);
        assertArrayEquals(typesOfFood.toArray(), actual.toArray());
    }


}