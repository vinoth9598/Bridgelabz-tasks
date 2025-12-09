import java.util.Scanner;

public class UserRegEx {

    public static void main(String[] args){

        System.out.println("Enter your first name :");
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();

        boolean validfirstName = firstName.matches("^[A-Z][a-zA-Z]{2,}$");
        if(validfirstName){
            System.out.println("FirstName is correct");
        }else{
            System.out.println("Invalid name & first letter must be capital.");
        }

        System.out.println("Enter your last name :");
        Scanner input2 = new Scanner(System.in);
        String lastName = input2.nextLine();
        boolean validLastName = lastName.matches("^[A-Z][a-zA-Z]{2,}$");
        if(validLastName){
            System.out.println("LastName is correct");
        }else{
            System.out.println("Invalid name & first letter must be capital.");
        }

        System.out.println("________________________________________");
        System.out.println("Full name :" + firstName + " " + lastName);

        System.out.println("Enter your email address : ");
        Scanner input3 = new Scanner (System.in);
        String email = input3.nextLine();

        boolean valid = email.matches(
                "^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$"
        );

        System.out.println("valid email ? " + valid);

        System.out.println("Enter mobile number : ");
        Scanner input4 = new Scanner(System.in);
        String mobile = input4.nextLine();

        boolean validMobile = mobile.matches("\\+[0-9]{1,3} [0-9]{10}$");
        System.out.println("valid mobile ? " + validMobile);

        System.out.println("Enter Password : ");
        Scanner input5 = new Scanner(System.in);
        String password= input4.nextLine();

        boolean validPassword = password.matches(
                "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%?&]{8,}$"
        );

        System.out.println("Valid ?" + validPassword);
    }
}
