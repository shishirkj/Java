// Array to create , display , insert , delete.
import java.util.Scanner;

public class Array {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("enter size of array = ");
        n = scanner.nextInt();

        int[] arr = new int[n];
        create(arr);
        display(arr);
        insert(arr,n);
        display(arr);

    }
    public static void create(int[] arr){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create Array");
        for(int i = 0; i< arr.length ; i++){
            arr[i] = scanner.nextInt();
        }

    }

    public static void display (int[] arr) {
        System.out.print("Display");
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

    public static void insert(int[] arr,int n){
        System.out.println("Insert");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter element to insert = ");
        int value = scanner.nextInt();
        System.out.println("Enter position to enter array element = ");
        int pos = scanner.nextInt();

        for(int i = n; i>=pos-1; i--){
            arr[i+1] = arr[i];
        }
        arr[pos-1] = value;
        n = n+1;
    }



}