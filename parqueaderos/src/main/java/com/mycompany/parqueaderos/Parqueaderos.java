import controlador.ParqueaderoController;
import modelo.entrada;
import modelo.salida;

public class Parqueaderos {
    public static void main(String[] args) throws InterruptedException {
        ParqueaderoController parqueadero = new ParqueaderoController(5);

        // Registrar entrada
        entrada entrada = parqueadero.registrarEntrada("ABC123", "Carro");
        if (entrada != null) {
            System.out.println("Vehículo ingresado a celda: " + entrada.getCelda().getNumero());
        } else {
            System.out.println("No hay celdas disponibles.");
        }

        // Simular tiempo de estadía
        Thread.sleep(3000); // 3 segundos

        // Registrar salida
        salida salida = parqueadero.registrarSalida("ABC123");
        if (salida != null) {
            System.out.println("Vehículo salió. Tiempo: " + salida.calcularMinutosEstadia() + " minutos.");
            System.out.println("Pago: $" + salida.calcularPago());
        } else {
            System.out.println("Vehículo no encontrado.");
        }
    }
}