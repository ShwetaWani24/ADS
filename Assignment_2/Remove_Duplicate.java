import java.util.Scanner;

class Remove_Duplicate {

    static void sort(int a[], int size) {
        int temp;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (a[i] > a[j]) { // Sorting in ascending order
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void countDuplicates(int a[], int size) {
        int count = 0;
        
        for (int i = 0; i < size - 1; i++) {
            if (a[i] == a[i + 1]) {
                count++;
            }
        }
        
        System.out.println("Number of duplicate elements: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr, size);  
        countDuplicates(arr, size);  
    }
}
