import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest {

    @Test
    void testHappyMood() {
        MoodAnalyser analyser = new MoodAnalyser();
        String result = analyser.analyseMood("I am in Happy Mood");
        assertEquals("HAPPY", result);
    }

    @Test
    void testSadMood() {
        MoodAnalyser analyser = new MoodAnalyser();
        String result = analyser.analyseMood("I am in Sad Mood");
        assertEquals("SAD", result);
    }

    @Test
    void testNeutralMoodForEmpty() {
        MoodAnalyser analyser = new MoodAnalyser();
        String result = analyser.analyseMood("");
        assertEquals("NEUTRAL", result);
    }

    @Test
    void testNeutralMoodForNull() {
        MoodAnalyser analyser = new MoodAnalyser();
        String result = analyser.analyseMood(null);
        assertEquals("NEUTRAL", result);
    }
}
