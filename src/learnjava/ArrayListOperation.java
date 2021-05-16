/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author asus
 */
public class ArrayListOperation{
    static Scanner sc = new Scanner(System.in);
     static int size;
   static ArrayList<Integer> arrlist = new ArrayList<Integer>();
   
  
   public static void  main(String[] args){
       
         Boolean flag = true;
        do{
        System.out.print("\nChoose Your Option\n"
                + "1. Add elements to ArrayList\n"
                + "2. Display nth element of ArrayList\n"
                + "3. Display all elements of ArrayList\n"
                + "4. Insert to nth position\n"
                + "5. Delete an element \n"
                + "6. Update an element"
                 + "7. Exit \n");
        int option;
        option = sc.nextInt();
        switch(option){
            case 1 :
                addArrayList();
                break;
            case 2 :
                displayNth();
                break;
            case 3:
                displayAll();
                break;
            case 4:
                 InsertArrayList();
                 break;
            case 5:
                 DeleteNth();
                 break;
            case 6:
                 UpdateArrayList();
                 break;    
            case 7:
                 flag = false;
        break;
            default:
                System.out.println("\nInvalid input try again\n");
      
        }
        }while(flag == true); 
   }
    private static void addArrayList() {
        
      System.out.print("\nEnter number of element\n");
      size = sc.nextInt();
      System.out.print("Enter the elements\n");
      for(int i = 0;i<size;i++){
        arrlist.add(i,sc.nextInt());
      }
      System.out.print("The ArrayList is :\n");
    System.out.print(arrlist);
      }
    
   
    private static void displayNth() {
        
          if(size==0){
              System.out.print("\n ArrayList is empty\n");
          }
          else{
       System.out.print("Enter the position of element to be displayed\n");
       int n = sc.nextInt();
       if(n>size){
            System.out.print("The element in "+n+"th position does not exist \n");
       }
       else{
          int  element = arrlist.get(n-1);
       System.out.print("The element in "+n+"th position is \t:"+element+"\n");
       }}
    }
    
    private static void displayAll() {
        
          if(size==0){
              System.out.print("\n ArrayList is empty\n");
          }
          else{
      System.out.print(arrlist);
}
    }

    private static void InsertArrayList() {
          System.out.print("Enter the position for element to be insertes\n");
       int n = sc.nextInt();
        System.out.print("Enter the  element to be insertes\n");
       int element = sc.nextInt();
       size++;
        arrlist.add(n-1,element);
      
        System.out.print("The resultant ArrayList is \n");
      
         System.out.print(arrlist);
         
    }
    
    private static void DeleteNth() {
        if(size==0){
              System.out.print("\n ArrayList is empty\n");
          }
        else{
          System.out.print("Enter the position of element to be deleted\n");
       int n = sc.nextInt();
         if(n>size){
            System.out.print("The element in "+n+"th position does not exist \n");
       }
         else{
       System.out.print("The element in "+n+"th position "+arrlist.get(n-1)+"is deleted\n");
            arrlist.remove(n-1);
       System.out.print("The resultant ArrayList is \n");
      
        System.out.print(arrlist);
      
    }
    }
    }

    private static void UpdateArrayList() {
          System.out.print("Enter the position for element to be updated\n");
       int n = sc.nextInt();
        System.out.print("Enter the  element to be updated\n");
       int element = sc.nextInt();
       size++;
        arrlist.set(n-1,element);
      
        System.out.print("The resultant ArrayList is \n");
         System.out.print(arrlist);
    }
    
}
