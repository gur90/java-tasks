import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import static org.junit.jupiter.api.Assertions.*;

class OptionsWithHashTest {

    @Test
    void getIntesection() {
        List<String> names = new ArrayList<>();
        names.add("Frodo");
        names.add("Sam");
        names.add("Bilbo");
        names.add("Tuk");
        List<String> names2 = new ArrayList<>();
        names2.add("Frodo");
        names2.add("Sam");
        names2.add("Tuk");
        names2.add("Gimly");
        HashSet<String> expected = new HashSet<>(Set.of("Frodo", "Gimly", "Sam"));
        HashSet<String> actualResult = OptionsWithHash.getIntesection(names, names2);
        Assertions.assertEquals(expected, actualResult);
    }

}