public class SampleExample {

    public static void main(String[] args){
        String email1 = "abc@yahoo.com";

        String emailCheck = "^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";

        boolean validEmail1 = email1.matches(emailCheck);

        System.out.println("Valid email-1: ?" + validEmail1);

        String email2 = "abc-100@yahoo.com";

        boolean validEmail2 = email2.matches(emailCheck);
        System.out.println("Valid email-2: ?" + validEmail2);

        String email3 = "abc.100@yahoo.com";
        boolean validEmail3 = email3.matches(emailCheck);
        System.out.println("Valid email-3: ?" + validEmail3);

        String email4 = "abc111@abc.com";
        boolean validEmail4 = email4.matches(emailCheck);
        System.out.println("Valid email-4: ?" + validEmail4);

        String email5 = "abc111@abc.net";
        boolean validEmail5 = email5.matches(emailCheck);
        System.out.println("Valid email-5: ?" + validEmail5);

        String email6 = "abc.100@abc.com.au";
        boolean validEmail6 = email6.matches(emailCheck);
        System.out.println("Valid email-6: ?" + validEmail6);

        String email7 = "abc@1.com";
        boolean validEmail7 = email7.matches(emailCheck);
        System.out.println("Valid email-7: ?" + validEmail7);

        String email8 = "abc@gmail.com.com";
        boolean validEmail8 = email8.matches(emailCheck);
        System.out.println("Valid email-8: ?" + validEmail8);

        String email9 = "abc+100@gmail.com";
        boolean validEmail9 = email9.matches(emailCheck);
        System.out.println("Valid email-9: ?" + validEmail9);

//        Invalid emails
System.out.println("__________________Invalid emails_______________");
        String email10 = "abc";
        boolean validEmail10 = email10.matches(emailCheck);
        System.out.println("Valid email-10: ?" + validEmail10);

        String email11 = "abc@.com.my";
        boolean validEmail11 = email11.matches(emailCheck);
        System.out.println("Valid email-11: ?" + validEmail11);

        String email12 = "abc123@gmail.a";
        boolean validEmail12 = email12.matches(emailCheck);
        System.out.println("Valid email-12: ?" + validEmail12);

        String email13 = "abc13@.com";
        boolean validEmail13 = email13.matches(emailCheck);
        System.out.println("Valid email-13: ?" + validEmail13);

        String email14 = "abc@.com.com";
        boolean validEmail14 = email14.matches(emailCheck);
        System.out.println("Valid email-14: ?" + validEmail14);

        String email15 = ".abc@abc.com";
        boolean validEmail15 = email15.matches(emailCheck);
        System.out.println("Valid email-15: ?" + validEmail15);

        String email16 = "abc||*@gmail.com";
        boolean validEmail16 = email16.matches(emailCheck);
        System.out.println("Valid email-16: ?" + validEmail16);

        String email17 = "ac@%*com";
        boolean validEmail17 = email17.matches(emailCheck);
        System.out.println("Valid email-17: ?" + validEmail17);

        String email18 = "abc..2002@gmail.com";
        boolean validEmail18 = email18.matches(emailCheck);
        System.out.println("Valid email-18: ?" + validEmail18);

        String email19 = "abc.@gmail.com";
        boolean validEmail19 = email19.matches(emailCheck);
        System.out.println("Valid email-19: ?" + validEmail19);

        String email20 = "abc@gmail.com.";
        boolean validEmail20 = email20.matches(emailCheck);
        System.out.println("Valid email-20: ?" + validEmail20);

        String email21 = "abc@abc@gmail.com";
        boolean validEmail21 = email21.matches(emailCheck);
        System.out.println("Valid email-21: ?" + validEmail21);

        String email22 = "abc@gmail.com.1a";
        boolean validEmail22 = email22.matches(emailCheck);
        System.out.println("Valid email-22: ?" + validEmail22);

        String email23 = "abc@gmail.com.aa.au";
        boolean validEmail23 = email23.matches(emailCheck);
        System.out.println("Valid email-23: ?" + validEmail23);
    }
}
