import java.util.Scanner;

public class reveresearr
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number of element :- ");

            int n = sc.nextInt();
            int input[] = new int[n];

            System.out.println("Enter the element :- ");

            for (int i = 0; i < n; i++)
            {
                input[i] = sc.nextInt();
                System.out.println("Reversed array:");
                for (i = n - 1; i >= 0; i--)
                {
                    System.out.print(input[i] + " ");
                }


            }
        }




    }
}
