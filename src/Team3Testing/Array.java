package Team3Testing;

public class Array {
    public static void main(String[] args) {
        int[] arr = = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Array:");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "  ");;

        System.out.println();git status


        System.out.println("Reversed of Array: ");

        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + "  ");;
    }
}


