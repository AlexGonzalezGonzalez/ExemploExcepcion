/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploexcepcion;

/**
 *
 * @author agonzalezgonzalez
 */
public class NosaExcepcion extends Exception {

    public NosaExcepcion() {
        super("informacion da excepcion");
    }

    public NosaExcepcion(String mensaxe) {
        super(mensaxe); 
    }
    
    
}
