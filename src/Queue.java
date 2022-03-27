import java.util.ArrayList;
import java.util.Scanner;

public class Queue {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> Q = new ArrayList<String>();
        while(true){
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Peek");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            int choice;
            System.out.print("Enter your choice : ");
            choice=sc.nextInt();
            switch(choice){
                case 1: System.out.print("Enter the string : ");
                        String x = sc.next();
                        Q.add(Q.size(),x);
                        break;
                case 2: if(Q.isEmpty()){
                         System.out.println("Queue is empty");
                          }
                          else {
                           System.out.print("The deleted element is : " + Q.remove(0));
                             }
                    System.out.println();
                             break;
                case 3:  if(Q.isEmpty()){
                          System.out.println("Queue is empty");
                             }
                          else {
                            System.out.print("The top element is : " + Q.get(0));
                            }
                          System.out.println();
                           break;
                case 4 : if(Q.isEmpty()){
                            System.out.println("The Queue is empty.");
                        }
                        else {
                        System.out.println("The elements are : - ");
                         for(int i=0; i<Q.size(); i++) {
                               System.out.print(Q.get(i) + " ");
                           }
                    System.out.println();
                        }
                        break;
                case 5: System.exit(0);
                        break;
                default: System.out.println("Invalid choice");
                         break;
            }

        }
    }
}

