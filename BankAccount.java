import java.util.Scanner ;

public class BankAccount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Account acc = new Account(1000.0);

        System.out.println("Current Balance :" + acc.getBalance());

        System.out.println("Enter amount to withdraw :");
        double amount = sc.nextDouble();

        acc.debit(amount);

        System.out.println("Balance after transaction :" + acc.getBalance());
    }
}
class Account{
    private double balance ;

    public Account(double balance){
        if(balance > 0.0){
            this.balance = balance ;
        }else{
            this.balance = 0.0 ;
        }
    }

    public void credit(double amount){
        balance += amount ;
    }

    public void debit(double amount){
        if(amount > balance){
            System.out.println("Debit amount exceeded account balance ");
        }else {
            balance -= amount ;
        }
    }

    public double getBalance(){
        return balance ;
    }
}