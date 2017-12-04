/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploexcepcion;

import javax.swing.JOptionPane;

/**
 *
 * @author agonzalezgonzalez
 */
public class ConFinally {
    
    private int numerador;
    private int denominador;

    public void dividirCapturaVariosCatch() {
        try{
        numerador = Integer.parseInt(JOptionPane.showInputDialog("Teclea numerador"));
        denominador = Integer.parseInt(JOptionPane.showInputDialog("Teclea denominador"));
        try {
            int resultado = numerador / denominador;
            System.out.println(numerador + " / " + denominador + " = " + resultado);
        } catch (ArithmeticException e1) {
            System.out.println("Non se pode dividir entre 0");

        }

    }catch(NumberFormatException e2){
            System.out.println("erro2,"+e2.toString());
    }
        finally{
            System.out.println("esta sentenza executase sempre");
        }
    
    }
    
        
}

