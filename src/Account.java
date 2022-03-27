import java.util.Scanner;

public class Account {
    long Accno;
    String name;
    long  phnno;
    double balance_amt;
    Scanner sc= new Scanner(System.in);
    void get_input(){
        System.out.print("Enter the name of the person : ");
//        sc.nextLine();
        this.name=sc.nextLine();
        System.out.print("Enter the account number : ");
        this.Accno=sc.nextLong();
        System.out.print("Enter phone number : ");
        this.phnno=sc.nextLong();
        balance_amt=0.0;
    }
    void Deposit(){
        System.out.print("Enter the amount to be deposited : ");
        double bal=sc.nextInt();
        balance_amt+=bal;
        System.out.println("The current balance is : - " + balance_amt);
    }
    void withdraw() {
        System.out.print("Enter the amount to be withdrawn : ");
        double bal_2=sc.nextInt();
        if(balance_amt-bal_2<0){
            System.out.println("insufficient funds");
        }
        else {
            balance_amt-=bal_2;
            System.out.println("The current balance is : - " + balance_amt);
        }
    }
    void display(){
        System.out.println("Name : - "+name);
        System.out.println("Account number : - "+Accno);
        System.out.println("Phone number : - "+phnno);
        System.out.println("Current Balance : - "+balance_amt);
    }
    public static void main(String []args) {
            Account a1 = new Account();
            while(true) {
                System.out.println("1.Get details\n2.Deposit money\n3.Withdraw money\n4.Display\n5.Exit");
                System.out.print("Enter your choice : ");
                Scanner scan = new Scanner(System.in);
                int choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        a1.get_input();
                        break;
                    case 2:
                        a1.Deposit();
                        break;
                    case 3: a1.withdraw();
                        break;
                    case 4: a1.display();
                            break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("INVALID CHOICE");
                }
            }
    }
}
