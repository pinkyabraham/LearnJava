/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;

/**
 *
 * @author asus
 */
public class EnumTest {
        public static void main(String[] args) {
        enum Days {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }

        for (Days day : Days.values()) {
            System.out.println(day);
        }
    }
}
    
