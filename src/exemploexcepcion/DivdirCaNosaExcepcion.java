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
public class DivdirCaNosaExcepcion {

    private int numerador;
    private int denominador;

    public DivdirCaNosaExcepcion() {
    }

    public void dividirCaNosaExcepcion() throws NosaExcepcion {
        numerador = Integer.parseInt(JOptionPane.showInputDialog("Teclea numerador"));
        denominador = Integer.parseInt(JOptionPane.showInputDialog("Teclea denominador"));
        if (denominador == 0) {
            throw new NosaExcepcion("....non dividas entre 0....");
        }
        System.out.println("resultado = " + numerador / denominador);
    }
}
