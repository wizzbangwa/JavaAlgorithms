package javaalgorithms.Algorithms;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class StringManipulationTests {
    @ParameterizedTest
    @CsvSource({"hello, 2", "hello hello hello, 6", "I count the sea shells, 7", "A whooo woooo WOOO!, 11"})
    void CountVowels_CorrectCount(String input, int vowelCount) {
        int result = StringManipulation.CountVowels(input);
        assertEquals(vowelCount, result);
    }
}
