import java.util.Arrays;
import java.util.Scanner;

public class Commutative {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            Arrays.sort(arr);
            System.out.println("Sorted array: " + Arrays.toString(arr));

            System.out.println("Cumulative sum of the array elements:");
            int cumulativeSum = 0;
            for (int num : arr) {
                cumulativeSum += num;
                System.out.print(cumulativeSum + " ");
            }
            System.out.println();

            scanner.close();
        }
    }

