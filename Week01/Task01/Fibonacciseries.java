import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number 'n' to find fibonacci series :-" );
        int n = sc.nextInt();

        //where NO_1 & No_2 is the first and second number of fibonacci no.
        int No_1 = 0, No_2 = 1;
        int nextNo;

        for(int i = 1; i<=n; i++){
            System.out.print(No_1 + ", " );
            nextNo = No_1 + No_2;
            No_1 = No_2;
            No_2 = nextNo;
        }
}
}
