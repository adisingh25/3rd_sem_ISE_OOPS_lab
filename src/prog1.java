import java.util.Scanner;

public class prog1 {
    static int rfib(int a) {
        if(a==0){
            return 0;
        }
        else if (a == 1) {
            return 1;
        }
        return rfib(a - 1) + rfib(a - 2);
    }
    static void fib(int a){
        int x=0,y=1;
        int z;
        while(a>0){
            System.out.print(x + " ");
            z=x+y;
            x=y;
            y=z;
            a--;
        }
    }
    static void prime_no(int a){
        int flag=0;
        for(int i=2; i<=a/2; i++){
            if(a%i==0){
                flag=1;
                break;
            }
            else {
                flag=0;
            }
        }
        if(flag==1) {
            System.out.println(a + " is not a prime number");
        }
        else {
            if(a!=1 && a!=0){
                System.out.println(a + " is a prime number");
            }
            else {
                System.out.println(a + "is neither prime nor composite");
            }
        }
    }
    static void sort(int []a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<(a.length-1); j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void main(String []args){
        int val;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms for fibonacci series : ");
        val=sc.nextInt();
        int i=0;
        while(i<val){
            System.out.print(rfib(i) + " ");
            i++;
        }
        System.out.println();
        fib(val);
        System.out.println();
        int num;
        System.out.print("Enter the number to be checked : ");
        num=sc.nextInt();
        prime_no(num);
        System.out.println("Enter the number of elements : ");
        int size;
        size=sc.nextInt();
        int []arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for(int k=0; k<size; k++){
            int t=sc.nextInt();
            arr[k]=t;
        }
        sort(arr);
        System.out.println("SORTED ARRAY");
        for(int j=0; j<size; j++){
            System.out.print(arr[j]+ " ");
        }
    }
}
