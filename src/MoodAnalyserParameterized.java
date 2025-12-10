import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class MoodAnalyserParameterized {

    @ParameterizedTest
    @CsvSource({
            "I am Happy today, HAPPY",
            "Feeling sad now, SAD",
            "'', NEUTRAL",
            "null, NEUTRAL"
    })

    void testMultipleMoods(String input, String expected){
        if("null".equals(input)) input = null ;

        MoodAnalyser analyser = new MoodAnalyser();
        assertEquals(expected, analyser.analyseMood(input));
    }
}
