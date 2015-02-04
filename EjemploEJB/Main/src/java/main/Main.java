/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import ejb.OperacionesBeanRemote;
import javax.ejb.EJB;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class Main {
    @EJB
    private static OperacionesBeanRemote ope;
    
    public static void main(String[] args) {
        //System.err.println("result = ");
        JOptionPane.showMessageDialog(null, ope.calculaFactorial(5));
       // System.out.println("hola que hacen");
    }
    
}
