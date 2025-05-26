
package ciclowhile;
import Sistema.SistemaParqueadero;
import modelo.*;
import sistema.*;
import java.util.Scanner;

public class CicloWhile {



    public static void main(String[] args) throws InterruptedException {
        SistemaParqueadero sistema = new SistemaParqueadero(10);

        sistema.registrarUsuario("Ana Gómez", "123456789");
        Usuario ana = new Usuario("Ana Gómez", "123456789");

        Vehiculo carro = new Vehiculo("ABC123", ana);
        Celda celda = sistema.asignarCeldaDisponible(carro);

        if (celda != null) {
            System.out.println("Vehículo estacionado en la celda " + celda.getNumero());
            Thread.sleep(3000); // Simula 3 segundos de tiempo estacionado

            Pago pago = sistema.registrarSalidaVehiculo("ABC123");
            System.out.println("Monto a pagar: $" + pago.getMonto());
        } else {
            System.out.println("No hay celdas disponibles.");
        }
    }
}




        
       
        
        
    
    

