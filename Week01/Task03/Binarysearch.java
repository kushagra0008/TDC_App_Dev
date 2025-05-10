import java.util.Arrays;
import java.util.Scanner;

    public class Binarysearch {

        public static int binarySearch(int[] arr, int target) {
            int low = 0;
            int high = arr.length - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            int[] arr = new int[size];
            System.out.println("Enter the elements of the array (sorted in ascending order):");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.print("Enter the target value to search for: ");
            int target = scanner.nextInt();

            int result = binarySearch(arr, target);

            if (result == -1) {
                System.out.println("Element is not found in the array");
            } else {
                System.out.println("Element is found at index: " + result);
            }
            scanner.close();
        }
    }

