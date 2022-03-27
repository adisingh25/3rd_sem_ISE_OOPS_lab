
package Q11.StudentPackage;
import java.util.Scanner;
import Q11.ResultPackage.Result;

interface Student{
    public void getName();
    public void getBranch();
}
class CreditLimit extends Exception{
    CreditLimit(String s){
        super(s);
    }
}
public class RegisterStudent extends Result implements Student{
    Scanner sc = new Scanner(System.in);
    public void getName(){
        System.out.println("Enter name:\t");
        name = sc.nextLine();
    }
    public void getBranch(){
        System.out.println("Enter branch:\t");
        branch = sc.nextLine();
    }
    public void register(int sem){
        semester = sem;
        if(semester == 1){
            getName();
            getBranch();
        }
        System.out.println("Enter the 6 subjectss registered");
        for(int i=0;i<6;i++){
            System.out.println("Enter subjects "+(i+1));
            subjects[i] = sc.next();
        }
        System.out.println("Enter the respective credits");
        totalCredits =0;
        for(int i=0;i<6;i++){
            System.out.println("Enter the credits of subjects "+(i+1));
            credit[i] = sc.nextInt();
            totalCredits += credit[i];
        }
        try{
            if(totalCredits >30){
                throw new CreditLimit("Credit Limit Exception");
            }
        }
        catch(CreditLimit cl){
            System.out.println(cl.getMessage());
        }
    }
}