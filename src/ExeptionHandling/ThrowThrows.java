/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExeptionHandling;

import java.io.IOException;

/**
 *
 * @author asus
 */
public class ThrowThrows  {
    void m() throws IOException {
        throw new IOException("device error");// checked exception
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }

    public static void main(String args[]) {
        ThrowThrows obj = new ThrowThrows();
        obj.p();
        System.out.println("normal flow...");
    }
}
