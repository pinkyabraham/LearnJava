/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * @author asus
 */
public class Application {
    public static void main(String[] args) {
    Salary s = new Salary("Mohd Mohtashim", "Senior Systems Engineer", 3, 56000.00);
    System.out.println("Call mailCheck using Salary reference --");
    s.mailCheck();
    }
}
