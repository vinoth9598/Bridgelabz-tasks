
import java.util.Scanner ;
public class ExceptionHandleMood {

    public static void main(String[] args){
        System.out.println("Enter firstName :");
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();

        System.out.println("Enter lastName :");
        String lastName = sc.nextLine();

        System.out.println("Enter email :");
        String email = sc.nextLine();

        System.out.println("Enter Phone number :");
        String phoneNumber = sc.nextLine();

        System.out.println("Enter password :");
        String password = sc.nextLine();
        try{
           validateFirst(firstName);
           validateLast(lastName);
           System.out.println("name : " + firstName + " " + lastName);

           validateEmail(email);

           validateMobile(phoneNumber);

           validatePassword(password);
        }catch(Exception e){
            System.out.println("Validation Error :" + e.getMessage());
        }
    }
    public static void validateFirst(String firstName) throws Exception{
        if(firstName.length()<3){
            throw new Exception("first letter not capital & should be three characters");
        }
        if(!Character.isUpperCase(firstName.charAt(0))){
            throw new Exception("first letter not capital & should be three characters");
        }
    }
    public static void validateLast(String lastName) throws Exception{
        if(lastName.length()<3){
            throw new Exception("lastName first letter not capital & should be three characters");
        }

        if(!Character.isUpperCase(lastName.charAt(0))){
            throw new Exception("lastName first letter not capital & should be three characters");
        }
    }

    public static void validateEmail(String email){
        try{
            String regex = "^[a-zA-Z0-9]+([._+-]?[a-zA-Z0-9]+)*@"        // local part
                    + "[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*"              // domain
                    + "\\.[a-zA-Z]{2,}$";

            boolean match = email.matches(regex);
            if(!match){
                System.out.println("Invalid email address");
            }else {
                System.out.println("Email valid :" + match);
            }

        }catch(Exception e){
            System.out.println("Email not valid");
        }
    }

    public static void validateMobile(String phoneNumber) {
        try{
            String regex = "^+[0-9]{2} [0-9]{10}$";
            String regex1 = "^[0-9]{10}$";
            boolean check ;
            if(phoneNumber.matches(regex)){
                check = true;
            }else if(phoneNumber.matches(regex1)){
                check = true;
            }else{
                check = false ;
            }
            if(check){
                System.out.println("Mobile Number is valid ");
            }else{
                System.out.println("Mobile Number is not valid ");
            }

        }catch(Exception e){
            System.out.println("Invalid mobile number");
        }
    }

    public static void validatePassword(String password) {
        try{
            String regex =  "^(?=.*[A-Z])" +
                    "(?=.*[0-9])" +
                    "(?=.*[@#$%^&+=!*_-])" +
                    ".{8,}$";

            boolean checkPassword =  password.matches(regex);
            if(!checkPassword){
                System.out.println("Invalid password");
            }else{
                System.out.println("Password is valid ");
            }

        }catch(Exception e){
            System.out.println("Invalid password");
        }
    }
}
