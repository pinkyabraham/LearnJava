/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class linkedList {
       static Scanner sc = new Scanner(System.in);
     static int size;
   static LinkedList<Integer> linklist = new LinkedList<Integer>();
   
  
   public static void  main(String[] args){
       
         Boolean flag = true;
        do{
        System.out.print("\nChoose Your Option\n"
                + "1. Add elements to LinkedList\n"
                + "2. Display nth element of LinkedList\n"
                + "3. Display all elements of LinkedList\n"
                + "4. Insert to nth position\n"
                + "5. Delete an element \n"
                + "6. Update an element"
                 + "7. Exit \n");
        int option;
        option = sc.nextInt();
        switch(option){
            case 1 :
                addLinkedList();
                break;
            case 2 :
                displayNth();
                break;
            case 3:
                displayAll();
                break;
            case 4:
                 InsertLinkedList();
                 break;
            case 5:
                 DeleteNth();
                 break;
            case 6:
                 UpdateLinkedList();
                 break;    
            case 7:
                 flag = false;
        break;
            default:
                System.out.println("\nInvalid input try again\n");
      
        }
        }while(flag == true); 
   }
    private static void addLinkedList() {
        
      System.out.print("\nEnter number of element\n");
      size = sc.nextInt();
      System.out.print("Enter the elements\n");
      for(int i = 0;i<size;i++){
        linklist.add(i,sc.nextInt());
      }
      System.out.print("The LinkedList is :\n");
    System.out.print(linklist);
      }
    
   
    private static void displayNth() {
        
          if(size==0){
              System.out.print("\n LinkedList is empty\n");
          }
          else{
       System.out.print("Enter the position of element to be displayed\n");
       int n = sc.nextInt();
       if(n>size){
            System.out.print("The element in "+n+"th position does not exist \n");
       }
       else{
          int  element = linklist.get(n-1);
       System.out.print("The element in "+n+"th position is \t:"+element+"\n");
       }}
    }
    
    private static void displayAll() {
        
          if(size==0){
              System.out.print("\n LinkedList is empty\n");
          }
          else{
      System.out.print(linklist);
}
    }

    private static void InsertLinkedList() {
          System.out.print("Enter the position for element to be insertes\n");
       int n = sc.nextInt();
        System.out.print("Enter the  element to be insertes\n");
       int element = sc.nextInt();
       size++;
        linklist.add(n-1,element);
      
        System.out.print("The resultant LinkedList is \n");
      
         System.out.print(linklist);
         
    }
    
    private static void DeleteNth() {
        if(size==0){
              System.out.print("\n LinkedList is empty\n");
          }
        else{
          System.out.print("Enter the position of element to be deleted\n");
       int n = sc.nextInt();
         if(n>size){
            System.out.print("The element in "+n+"th position does not exist \n");
       }
         else{
       System.out.print("The element in "+n+"th position "+linklist.get(n-1)+"is deleted\n");
            linklist.remove(n-1);
       System.out.print("The resultant LinkedList is \n");
      
        System.out.print(linklist);
      
    }
    }
    }

    private static void UpdateLinkedList() {
          System.out.print("Enter the position for element to be updated\n");
       int n = sc.nextInt();
        System.out.print("Enter the  element to be updated\n");
       int element = sc.nextInt();
       size++;
        linklist.set(n-1,element);
      
        System.out.print("The resultant LinkedList is \n");
         System.out.print(linklist);
    }
    
}


