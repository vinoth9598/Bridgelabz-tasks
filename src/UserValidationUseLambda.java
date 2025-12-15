
import java.util.Scanner ;

@FunctionalInterface
interface userValidation{
    boolean validate(String input);
}
public class UserValidationUseLambda {

    static userValidation firstName = firstname -> firstname.matches("^[A-Z][a-z]{2,}$");

    static userValidation lastName = lname ->lname.matches("^[A-Z][a-z]{2,}$");
    static userValidation email = checkEmail -> checkEmail.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$");
    static userValidation mobile = phone -> phone.matches("^[0-9]{10}$");
    static userValidation password = checkPassword -> checkPassword.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$");

    public static void main(String[] args){
        System.out.println("Enter firstName :");
        Scanner sc = new Scanner(System.in);
        String fName = sc.nextLine();

        System.out.println("Enter lastName :");
        String lName = sc.nextLine();

        System.out.println("Enter Email :");;
        String checkEmail = sc.nextLine();

        System.out.println("Enter Mobile :");
        String checkMobile = sc.nextLine();

        System.out.println("Enter Password :");
        String checkPassword = sc.nextLine();

        System.out.println("First Name Valid :" + firstName.validate(fName));
        System.out.println("Last Name Valid :" + lastName.validate(lName));
        System.out.println("Email valid :" + email.validate(checkEmail));;
        System.out.println("Mobile valid :" + mobile.validate(checkMobile));
        System.out.println("Password valid :" + password.validate(checkPassword));
    }
}
