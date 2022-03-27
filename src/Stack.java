import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Stack {
    int size;
    int top=-1;
    int []stack;
    Stack(int a){
        size=a;
        stack = new int[size];
    }
    Scanner sc=new Scanner(System.in);
    void push(){
        if(top==size-1){
            System.out.println("Stack Overflow");
        }
        else {
            System.out.println("Enter the value : ");
            int val=sc.nextInt();
            stack[++top]=val;
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack underflow");
        }
        else {
            System.out.println("The deleted element is : "+stack[top--]);
        }
    }
    void display(){
        int i=0;
        if(top==-1){
            System.out.println("Stack underflow");
        }
        else {
            System.out.println("------Displaying Elements-------");
            while (i<=top){
                System.out.println(stack[i]+" ");
                i++;
            }
        }
    }
    public static void main(String []args){
        System.out.print("Enter the size of the stack : ");
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        Stack s1 = new Stack(n);
        while(true){
            System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit");
            System.out.println("Enter your choice : - ");
            int choice=scan.nextInt();
            switch (choice){
                case 1 : s1.push();
                         break;
                case 2: s1.pop();
                        break;
                case 3: s1.display();
                        break;
                case 4: System.exit(0);
                        break;
                default: System.out.println("INVALID CHOICE");
                         break;
            }
        }
    }
}
