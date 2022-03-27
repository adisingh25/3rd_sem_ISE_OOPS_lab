import java.sql.SQLSyntaxErrorException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class prog6 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Extract a portion of a string");
        System.out.println("2.Count the occurrence of a particular word in a string");
        System.out.println("3.Replace a substring in a string");
        System.out.println("4.Rearrange the string and rewrite in alphabetical order");
        System.out.println("5.Comparing two string ignoring cases");
        System.out.println("6.Concatenate two strings");
        int choice;
        while(true){
            System.out.print("Enter your choice : ");
            choice=sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1: System.out.print("Enter a string : ");
                         String s = sc.nextLine();
//                         sc.nextLine();
                         System.out.print("Enter the postion from where you want to extract " );
                         int n=sc.nextInt();
                         System.out.print("Enter the number of characters to be extracted");
                         int m=sc.nextInt();
                         String k=s.substring(n-1,m+n-1);
                         System.out.println("Extracted string : "+k);
                         break;
                case 2:  System.out.print("Enter a string : ");
                         String s11=sc.nextLine();
//                         sc.nextLine();
                         System.out.println("Enter the word whose occurences you wanna find ");
                         String k2=sc.next();
                         int counter =0;
                         String []arr=s11.split(" ");
                         for(int i=0; i<arr.length; i++){
                             if(arr[i].equals(k2)){
                                 counter++;
                             }
                         }
                         System.out.println("The no of occurences of the word " + k2 + "are" + counter);
                         break;
                case 3: System.out.print("Enter the string : ");
                        String s12=sc.nextLine();
//                        sc.nextLine();
                        System.out.print("Enter the substring you wanna replace : ");
                        String k3=sc.next();
                        System.out.print("Enter the substring you want to replace with : ");
                        String p=sc.next();
                        String t=s12.replace(k3,p);
                        System.out.println("The new String is : " + t);
                        break;
                case 4: System.out.print("Enter the string : ");
                        String s33=sc.nextLine();
//                        sc.nextLine();
                        String k4=s33.toLowerCase();
                        char []arr2 = k4.toCharArray();
                        Arrays.sort(arr2);
                        String p5= new String(arr2);
                        System.out.println("The string arranged alphabetically is : " + p5);
                        break;
                case 5: System.out.print("Enter the string 1 : ");
                        String s_1=sc.nextLine();
//                        sc.nextLine();
                        System.out.print("Enter the string 2 : ");
                        String s_2=sc.nextLine();
                        boolean cmp=s_1.equalsIgnoreCase(s_2);
                        if(cmp){
                            System.out.println("The two String are equal");
                        }
                        else {
                            System.out.println("The two are not equal");
                        }
                        break;
                case 6: System.out.print("Enter string 1 : ");
                        s_1=sc.nextLine();
//                        sc.nextLine();
                        System.out.print("Enter string 2 : ");
                        s_2=sc.nextLine();
                        String s_3=s_1 +" " +s_2;
                        System.out.println("The Concatenated string is : "+s_3);
                        break;
                case 7: System.exit(0);
                        break;
                default: System.out.println("INVALID CHOICE");
                         break;
            }
        }
    }
}
