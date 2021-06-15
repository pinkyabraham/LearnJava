package learnjava;

import java.util.Scanner;

public class Array {

    static int[] arr = new int[20];
    static int size;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Boolean flag = true;
        do {
            System.out.print("\nChoose Your Option\n"
                    + "1. Add elements to array\n"
                    + "2. Display nth element of array\n"
                    + "3. Display all elements of array\n"
                    + "4. Insert to nth position\n"
                    + "5. Delete an element \n"
                    + "6. Exit \n");
            int option;
            option = sc.nextInt();
            switch (option) {
                case 1:
                    addArray();
                    break;
                case 2:
                    displayNth();
                    break;
                case 3:
                    displayAll();
                    break;
                case 4:
                    InsertArray();
                    break;
                case 5:
                    DeleteNth();
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("\nInvalid input try again\n");

            }
        } while (flag == true);
    }

    private static void addArray() {        //add values to array

        System.out.print("\nEnter number of element\n");
        size = sc.nextInt();
        System.out.print("Enter the elements\n");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The array is :\n");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            System.out.print("\t");
        }
    }

    private static void displayNth() {          //display nth value

        if (size == 0) {
            System.out.print("\n Array is empty\n");
        } else {
            System.out.print("Enter the position of element to be displayed\n");
            int n = sc.nextInt();
            if (n > size) {
                System.out.print("The element in " + n + "th position does not exist \n");
            } else {
                System.out.print("The element in " + n + "th position is \t:" + arr[n] + "\n");
            }
        }
    }

    private static void displayAll() {              //diaplay all values

        if (size == 0) {
            System.out.print("\n Array is empty\n");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + "\t");
            }
        }
    }

    private static void InsertArray() {             //Insert into nth position 
        System.out.print("Enter the position for element to be insertes\n");
        int n = sc.nextInt();
        System.out.print("Enter the  element to be insertes\n");
        int element = sc.nextInt();
        size++;
        for (int j = size - 1; j >= n - 1; j--) {
            arr[j + 1] = arr[j];
        }
        arr[n - 1] = element;

        System.out.print("The resultant array is \n");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    private static void DeleteNth() {           // Delete nth position
        if (size == 0) {
            System.out.print("\n Array is empty\n");
        } else {
            System.out.print("Enter the position of element to be deleted\n");
            int n = sc.nextInt();
            if (n > size) {
                System.out.print("The element in " + n + "th position does not exist \n");
            } else {
                System.out.print("The element in " + n + "th position " + arr[n] + "is deleted\n");
                for (int i = n - 1; i < size; i++) {
                    arr[i] = arr[i + 1];
                }
                size--;
                System.out.print("The resultant array is \n");
                for (int i = 0; i < size; i++) {
                    System.out.print(arr[i] + "\t");
                }
            }
        }
    }
}
