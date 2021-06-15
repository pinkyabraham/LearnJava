package Inheritance;

public class MultipleInheritance{
    public static void main(String[] args){
       Brakes car = new Brakes() {
          public void start() {
             System.out.println("Start Engines");
          }
          public void rev() {
             System.out.println("Race");
          }
          public void stop() {
             System.out.println("Apply Brakes to stop.");
          }
       };
 
       car.start();
       car.rev();
       car.stop();
    }
 }

interface Ignition {  //parent class1
    public void start();
 }
 interface Accelerate {  //parent class2
    public void rev();
 }
 interface Brakes extends Ignition, Accelerate{  // 2 parent class and a single child
    public void stop();
 }
