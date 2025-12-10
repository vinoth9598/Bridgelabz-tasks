import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRegisterJunit {

    UserRegistraction user = new UserRegistraction();

    @Test
    void testValidFirstName() {
        assertTrue(user.validateFirstName("Vino"));
    }

    @Test
    void testInvalidFirstName() {
        assertFalse(user.validateFirstName("vi"));
    }

    @Test
    void testValidEmail() {
        assertTrue(user.validateEmail("abc.xyz@bl.co.in"));
    }

    @Test
    void testInvalidEmail() {
        assertFalse(user.validateEmail("abc@.com.my"));
    }

    @Test
    void testValidMobile() {
        assertTrue(user.validateMobile("91 9876543210"));
    }

    @Test
    void testInvalidMobile() {
        assertFalse(user.validateMobile("919876543210"));
    }

    @Test
    void testValidPassword() {
        assertTrue(user.validatePassword("Abcd@123"));
    }
}
