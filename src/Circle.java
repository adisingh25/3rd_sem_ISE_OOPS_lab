import java.util.Scanner;
public class Circle {
    double radius;
    Circle(double r){
        this.radius=r;
    }
    double area() {
        return 3.14 * radius * radius;
    }
}
class Sector extends Circle{
    double degree;
    Sector(double r,double d){
        super(r);
        this.degree=d;
    }
    double area(){
        return 0.5*radius*radius*degree;
    }
}
class Segment extends Circle{
    double length;
    Segment(double radius, double length){
        super(radius);
        this.length=length;
    }
    double area(){
        double h = this.radius - Math.pow(Math.pow(this.radius, 2) - Math.pow((this.length / 2), 2), 0.5);
        return ((h / (6 * this.length)) * ((3 * h * h) + (4 * this.length * this.length)));
    }
}
class Main{
    public static void main(String []args){
        double a,r,l;
        int ch;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Menu-");
            System.out.println("1. Area of circle");
            System.out.println("2. Area of sector of circle");
            System.out.println("3. Area of segment of circle");
            System.out.println("4. Exit!");

            System.out.println("Enter your choice?");
            ch = sc.nextInt();

            switch(ch){

                case 1:
                    System.out.print("Enter the radius of the circle : ");
                    r = sc.nextDouble();
                    Circle c = new Circle(r);
                    System.out.println("The area of the circle is: "+ c.area());
                    break;

                case 2:
                    System.out.print("Enter the radius of the circle : ");
                    r = sc.nextDouble();
                    System.out.print("Enter the angle of sector in radians : ");
                    a = sc.nextDouble();
                    Sector s1 = new Sector(a,r);
                    System.out.println("The area of the segment of the circle is: "+s1.area());
                    break;

                case 3:
                    System.out.print("Enter the radius of the circle : ");
                    r = sc.nextDouble();
                    System.out.print("Enter the length of segment of the circle : ");
                    l = sc.nextDouble();
                    Segment s2 = new Segment(l,r);
                    System.out.println("The area of the segment of the circle is: "+s2.area());
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!!");
            }
        }
    }

}
