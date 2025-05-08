import java.util.Scanner;

public class Buzznumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number 'n' to find buzz number :-" );
        int n = sc.nextInt();
        // Buzz no is a no which is divisible by 7 or last digit is 7
        if(n/7==0 || n%10==7){
            System.out.println("Number is a Buzz number");
        }
        else{
            System.out.println("Number is not a Buzz number");
        }

    }
}
