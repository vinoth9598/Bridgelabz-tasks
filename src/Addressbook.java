
import java.util.*;
import java.util.Scanner ;

class Contact{
    String name;
    String address;
    String city;
    String state ;
    String email;

    Contact(String name, String address, String city, String state, String email) {
        this.name = name ;
        this.address = address;
        this.city = city;
        this.state = state ;
        this.email = email;
    }

    public void showDetails() {
        System.out.println("users details are :");
        System.out.println("  name "+ this.name);
        System.out.println("  Address : " + this.address);
        System.out.println("  City : " + this.city);
        System.out.println("  State : " + this.state);
        System.out.println("  Email : " + this.email);
    }
}

public class Addressbook{

   public static void main(String[] args){
       List<Contact> employeeList = new ArrayList<>();

       System.out.println("The number of employees addressBook:");
       Scanner sc =new Scanner(System.in);
       int n = sc.nextInt();

       for(int i =1; i<=n;i++){
           System.out.println("Enter the name of the employee "+(i)+" :");
           System.out.println("Enter name : ");
           String name =  sc.nextLine();
           System.out.println("Enter Address : ");
           String address = sc.nextLine();
           System.out.println("Enter City : ");
           String city = sc.nextLine();
           System.out.println("Enter State : ");
           String state = sc.nextLine();
           System.out.println("Enter Email : ");
           String email =  sc.nextLine();
           employeeList.add(new Contact(name,address,city,state,email));
       }
       for(Contact c : employeeList){
           c.showDetails();
       }
   }
}