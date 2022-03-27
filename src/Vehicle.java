import java.beans.VetoableChangeListener;
import java.util.Scanner;
import java.util.Vector;

abstract class Vehicle {
    int yr_of_manf;
    Vehicle(){
        this.yr_of_manf=0;
    }
    Vehicle(int y){
        this.yr_of_manf=y;
    }
    abstract int get_data();
    abstract void put_data(int y);
}
class Two_Wheeler extends Vehicle {
    Two_Wheeler(int y){
        super(y);
    }
    int get_data() {
        return this.yr_of_manf;
    }
    void put_data(int y){
        this.yr_of_manf=y;
    }
}
final class Four_Wheeler extends Vehicle {
    Four_Wheeler(){
       super();
    }
    int get_data() {
        return this.yr_of_manf;
    }
    void put_data(int y){
        this.yr_of_manf=y;
    }
}
class My_two_wheeler extends Two_Wheeler{
    My_two_wheeler(int y){
        super(y);
    }
    int get_data() {
        return super.yr_of_manf;
    }
    void put_data(int y){
       super.put_data(y);
    }
}
class Demo {
    public static void main (String []args ){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year of manufacture of your two wheeler :-");
        a=sc.nextInt();
        My_two_wheeler v1 = new My_two_wheeler(a);
        System.out.print("Enter the year of manufacture of four wheeler :-");
        a=sc.nextInt();
        Four_Wheeler v2 = new Four_Wheeler();
        v2.put_data(a);
        System.out.println("The year of manufacture of your two wheeler is : " + v1.get_data());
        System.out.println("The year of manufacture of four wheeler is : " + v2.get_data());

    }
}
