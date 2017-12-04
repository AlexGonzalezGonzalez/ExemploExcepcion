/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploexcepcion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author agonzalezgonzalez
 */
public class ExemploExcepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        capturaExcepcion ce= new capturaExcepcion();
//        ce.dividirCaptura();
//         VariosCatch ce1=new VariosCatch();
//         ce1.dividirCapturaVariosCatch();
//        ConFinally cf = new ConFinally();
//        cf.dividirCapturaVariosCatch();
         
//            PropagarExcepcion pe = new PropagarExcepcion();
//            try{
//            pe.dividirPropagaExcepcion();
//        
//            }catch(ArithmeticException e1){
//                System.out.println(e1.getMessage());
//            }
                    DivdirCaNosaExcepcion ob1= new DivdirCaNosaExcepcion();
        try {
            ob1.dividirCaNosaExcepcion();
        } catch (NosaExcepcion ex) {
            System.out.println(ex.getMessage());
        }
    }
}