import java.util.Scanner;
public class Complex {
    int a;
    int b;
    Complex() {
        this.a = 0;
        this.b = 0;
    }
    Scanner sc= new Scanner(System.in);
    void get_val(){
        System.out.print("Enter the real part value : ");
        this.a=sc.nextInt();
        System.out.print("Enter the imaginary part of value : ");
        this.b=sc.nextInt();
    }
    Complex add(Complex c1, Complex c2){
        Complex c3 = new Complex();
        c3.a=c1.a+c2.a;
        c3.b=c1.b+c2.b;
        return c3;
    }
    Complex subtract(Complex c1, Complex c2){
        Complex c3 = new Complex();
        c3.a=c1.a-c2.a;
        c3.b=c1.b-c2.b;
        return c3;
    }
    Complex multiply(Complex c1, Complex c2){
        Complex c3 = new Complex();
        c3.a=(c1.a*c2.a)-(c1.b*c2.b);
        c3.b=(c1.a*c2.b)+(c2.a*c1.b);
        return c3;
    }
    void display(){
        System.out.println("The Result is : " + this.a + "+i(" + this.b+")");
    }
    public static void main(String []args){
        Scanner scan= new Scanner(System.in);
        Complex x = new Complex();
        Complex y = new Complex();
        Complex z = new Complex();
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\4.Exit");
        int choice;
        while(true){
            System.out.print("Enter your choice : ");
            choice=scan.nextInt();
            switch (choice){
                case 1:  System.out.println("Enter the 1st number : ");
                         x.get_val();
                         System.out.println("Enter the 1st number : ");
                         y.get_val();
                         z=z.add(x,y);
                         z.display();
                         break;
                case 2:  System.out.println("Enter the 1st number : ");
                         x.get_val();
                         System.out.println("Enter the 1st number : ");
                        y.get_val();
                        z=z.subtract(x,y);
                        z.display();
                         break;
                case 3: System.out.println("Enter the 1st number : ");
                         x.get_val();
                         System.out.println("Enter the 1st number : ");
                          y.get_val();
                         z=z.multiply(x,y);
                         z.display();
                         break;
                case 4: System.exit(0);
                        break;
                default: System.out.println("INVALID CHOICE");
                            break;


            }
        }
    }


}
