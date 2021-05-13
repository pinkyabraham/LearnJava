/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        
        // add, insert ,nth dispaly,all display,nth delete
        System.out.print("Choose Your Option\n"
                + "1. Add elements to array\n"
                + "2. Display nth element of array\n"
                + "3. Display all elements of array\n"
                + "4. Insert to nth position\n"
                + "5. Delete an element \n");
        int option;
        option = sc.nextInt();
        switch(option){
            case 1 :
                addArray();
                break;
            case 2 :
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
            default:
                 break;
       
        }
        
    }

    private static void addArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void displayNth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void displayAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void InsertArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void DeleteNth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
