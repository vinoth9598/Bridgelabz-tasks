import java.util.Scanner ;
public class AddressBookManage {
    String firstName;
    String lastName ;
    String address ;
    String city ;
    String state;
    String email ;
    int zip ;
    String phone;

    public AddressBookManage(){

    }

    private void display() {
        System.out.println("users details are :");
        System.out.println("  first name "+ this.firstName);
        System.out.println("  last Name : " + this.lastName);
        System.out.println("  Address : " + this.address);
        System.out.println("  City : " + this.city);
        System.out.println("  State : " + this.state);
        System.out.println("  Email : " + this.email);
        System.out.println("  Zip : " + this.zip);
        System.out.println("  Phone : " + this.phone);
    }

    private void updateDetails(String first){
        this.firstName = first;

        System.out.println("Update name : " + firstName);
        System.out.println("__________delete person Name__________");
        firstName = "" ;
        System.out.println("delete person Name finished");
        System.out.println("delete name : " + firstName);


    }



    public static void main(String[] args){
            AddressBookManage employee1 = new AddressBookManage();
            employee1.firstName = "vinoth";
            employee1.lastName ="kumar";
            employee1.address = "123, west street, Tambaram";
            employee1.city ="chennai";
            employee1.state = "Tamil Nadu";
            employee1.email ="vinoth@gmail.com";
            employee1.zip = 600045 ;
            employee1.phone = "8587877610 ";

            employee1.display();
            System.out.println("_________update name ______");
            System.out.println("Enter update modifies user name :");
            Scanner userInput = new Scanner(System.in);
            String name = userInput.nextLine();
            employee1.updateDetails(name);


    }


}
