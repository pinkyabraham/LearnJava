/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExeptionHandling;

/**
 *
 * @author asus
 */
public class TryCatchFinally {
    public static void main(String[] args) {
        int[] arr = new int[2];
        int n = 1;

        try{
            int i = arr[n];
            System.out.println("This statement will be executed if n is less than 2.");
        } catch(ArrayIndexOutOfBoundsException x) {
            System.out.println("The Exception is caught! Inside Catch!");
        } finally {
            System.out.println("This statement will be executed anyhow. Finally block.");
        }
        System.out.println("This is the program's continuation.");
    }
}
