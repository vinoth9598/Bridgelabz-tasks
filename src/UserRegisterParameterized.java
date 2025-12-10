import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
public class UserRegisterParameterized {

    UserRegistraction user = new UserRegistraction();

    @ParameterizedTest
    @ValueSource(strings = {
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc.100@abc.com.au"
    })
    void testValidEmails(String email) {
        assertTrue(user.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "abc",
            "abc@.com.my",
            "abc123@gmail.a",
            "abc123@.com",
            "abc()*@gmail.com"
    })
    void testInvalidEmails(String email) {
        assertFalse(user.validateEmail(email));
    }
}
