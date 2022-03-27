import java.util.Scanner;
public class Personal {
    String name;
    int age;
    String education;
    double salary;
    double basic;
    double da;
    double hra;
    int yrs_of_exp;
    int no_of_loans;
    double amount;
    Personal(String name, int age, String education, double basic, double da, double hra, int yrs_of_exp, int no_of_loans, double amount){
        this.name=name;
        this.age=age;
        this.education=education;
        this.basic=basic;
        this.da=da;
        this.hra=hra;
        this.yrs_of_exp=yrs_of_exp;
        this.no_of_loans=no_of_loans;
        this.amount=amount;
    }
    static void isEligible(Personal p1){
        if(p1.yrs_of_exp>=10 && (p1.basic+p1.da+p1.hra >=400000) && p1.no_of_loans<=1){
            System.out.println("Employee is eligible for loan");
        }
        else {
            System.out.println("Employee is not eligible for loan");
        }
    }
    static void tax_pay(Personal p1){
        double tax;
        if(p1.basic+p1.da+p1.hra<=100000){
            tax=0.0;
        }
        else if(p1.basic+p1.da+p1.hra<=200000){
            tax=0.1*(p1.basic+p1.da+p1.hra);
        }
        else if(p1.basic+p1.da+p1.hra<=300000){
            tax=0.2*(p1.basic+p1.da+p1.hra);
        }
        else if(p1.basic+p1.da+p1.hra<=350000){
            tax=0.3*(p1.basic+p1.da+p1.hra);
        }
        else if(p1.basic+p1.da+p1.hra<=400000){
            tax=0.35*(p1.basic+p1.da+p1.hra);
        }
        else {
            tax=0.4*(p1.basic+p1.da+p1.hra);
        }
        System.out.println("Tax amount is : - "+tax);
    }
    static void isEligible_promotion(Personal p1) {
        if(p1.yrs_of_exp>=10 && p1.no_of_loans<=1){
            System.out.println("Person is eligible for promotion");
        }
        else {
            System.out.println("Person is not eligible for promotion");
        }
    }
    static void display(Personal p){
        System.out.println("Name : - "+p.name);
        System.out.println("Age : - "+p.age);
        System.out.println("Education  - "+p.education);
        System.out.println("Salary : - "+(p.basic+p.da+p.hra));
        System.out.println("Years of experiance : - "+p.yrs_of_exp);
        System.out.println("Number of loans :  - "+p.no_of_loans);
        System.out.println("Loan amount :- "+p.amount);
    }
    public static void main(String []args){
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of employee : ");
        n=sc.nextInt();
        sc.nextLine();
        Personal []emp = new Personal[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the details for "+i+1+"employee ");
            System.out.print("Enter the name : ");
            String emp_name=sc.nextLine();
            System.out.print("Enter the age : ");
            int emp_age=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the education : ");
            String emp_edu=sc.next();
            System.out.print("Enter the basic salary : ");
            double emp_basic=sc.nextDouble();
            System.out.print("Enter the da salary : ");
            double emp_da=sc.nextDouble();
            System.out.print("Enter the hra salary : ");
            double emp_hra=sc.nextDouble();
            System.out.print("Enter the years of experience : ");
            int emp_exp=sc.nextInt();
            System.out.print("Enter the number of loans : ");
            int emp_loan=sc.nextInt();
            System.out.print("Enter the loan amount : ");
            double emp_loan_amount=sc.nextDouble();
            emp[i] = new Personal(emp_name,emp_age,emp_edu,emp_basic,emp_da,emp_hra,emp_exp,emp_loan,emp_loan_amount);
            System.out.println("-------------Displaying Details------------");
            display(emp[i]);
            tax_pay(emp[i]);
            isEligible(emp[i]);
            isEligible_promotion(emp[i]);
        }
    }

}
