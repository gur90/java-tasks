import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OptionsWithHashPandasTest {

    @Test
    @DisplayName("check names")
    void getDifference() {
        List<OptionsWithPandas> pandas = new ArrayList<>();
        pandas.add(new OptionsWithPandas("Foro"));
        pandas.add(new OptionsWithPandas("Soro"));
        pandas.add(new OptionsWithPandas("Tuko"));
        pandas.add(new OptionsWithPandas("Boro"));
        List<OptionsWithPandas> pandas2 = new ArrayList<>();
        pandas2.add(new OptionsWithPandas("Foro"));
        pandas2.add(new OptionsWithPandas("Soro"));
        pandas2.add(new OptionsWithPandas("Tuko"));
        pandas2.add(new OptionsWithPandas("Goro"));
        HashSet<OptionsWithPandas> expected = new HashSet<>(Set.of(new OptionsWithPandas("Boro"), new OptionsWithPandas("Goro")));
        HashSet<OptionsWithPandas> actual = (HashSet<OptionsWithPandas>) OptionsWithHash.getDifference(pandas, pandas2);
        Assertions.assertEquals(expected, actual);
    }
}