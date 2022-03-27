import javax.net.ssl.SNIHostName;
import java.util.Scanner;

public class matrix {
    int row;
    int column;
    int[][] array;

    matrix(int a, int b) {
        this.row = a;
        this.column = b;
        this.array = new int[this.row][this.column];
    }

    Scanner sc = new Scanner(System.in);

    void get_input() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = sc.nextInt();
            }
        }
    }

    void display() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    matrix multiply(matrix m1, matrix m2) {
        System.out.println("MULTIPLYING");
        matrix m3 = new matrix(m1.row, m2.column);
        for (int i = 0; i < m1.row; i++) {
            for (int j = 0; j < m2.column; j++) {
                for (int k = 0; k < m1.column; k++) {
                    m3.array[i][j] += m1.array[i][k] * m2.array[k][j];
                }
            }
        }
        return m3;
    }
    public static void  main(String []args){
        int r1,c1,r2,c2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the row and column of matrix 1 : ");
        r1=scan.nextInt();
        c1=scan.nextInt();
        matrix a = new matrix(r1,c1);

        System.out.print("Enter the row and column of matrix 2 : ");
        r2=scan.nextInt();
        c2=scan.nextInt();
        matrix b = new matrix(r2,c2);
        a.get_input();
        b.get_input();
        matrix c = new matrix(a.row,b.column);
        c=c.multiply(a,b);
        a.display();
        System.out.println("\n");
        b.display();
        System.out.println("\n");
        c.display();

    }

}
