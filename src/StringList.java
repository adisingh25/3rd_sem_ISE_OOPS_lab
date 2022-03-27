import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class StringList {
    public static void main(String []args) {
    LinkedList<String> l = new LinkedList<String>();
    Scanner sc = new Scanner(System.in);
     while(true)

    {
        System.out.println("1.Insert");
        System.out.println("2.Remove an element");
        System.out.println("3.Display those having length < 5");
        System.out.println("4.Display");
        System.out.println("5.Exit");
        int choice;
        System.out.print("Enter your choice : ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter the element : ");
                String x = sc.next();
                l.add(x);
                break;
            case 2:
                if (l.isEmpty()) {
                    System.out.println("The list is empty");
                } else {
                    System.out.print("Enter the position for deletion : ");
                    int p = sc.nextInt();
                    System.out.println("The deleted element is : " + l.remove(p));
                }
                break;
            case 3:
                if (l.isEmpty()) {
                    System.out.println("The list is empty");
                } else {
                    Iterator<String> itr = l.iterator();
                    System.out.println("The elements with size less than 5 :- ");
                    String e1 = " ";
                    while (itr.hasNext()) {
                        e1 = itr.next();
                        if (e1.length() < 5) {
                            System.out.print(e1 + " ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 4:
                if (l.isEmpty()) {
                    System.out.println("The list is empty");
                } else {
                    Iterator<String> itr = l.iterator();
                    System.out.println("The elements  :- ");
                    while (itr.hasNext()) {
                        System.out.println(itr.next());
                    }
                    System.out.println();
                }
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
}
