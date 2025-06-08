
package ciclowhile;

import modelo.ControladorPago;


public class CicloWhile {



    public static void main(String[] args) {
        try {
            ControladorPago cp = new ControladorPago();
            cp.registrarNuevoPago(1, 80000.0);
        } catch (Exception e) {
            System.out.println("Error general: " + e.getMessage());
            e.printStackTrace();
        }
    }
}




        
       
        
        
    
    

