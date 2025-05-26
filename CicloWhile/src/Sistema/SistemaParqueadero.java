
package Sistema;


import modelo.*;

import java.util.ArrayList;

public class SistemaParqueadero {
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Celda> celdas = new ArrayList<>();
    private ArrayList<Pago> pagos = new ArrayList<>();

    public SistemaParqueadero(int numCeldas) {
        for (int i = 1; i <= numCeldas; i++) {
            celdas.add(new Celda(i));
        }
    }

    public void registrarUsuario(String nombre, String cedula) {
        usuarios.add(new Usuario(nombre, cedula));
    }

    public Celda asignarCeldaDisponible(Vehiculo v) {
        for (Celda c : celdas) {
            if (c.estaDisponible()) {
                v.registrarEntrada();
                c.ocuparCelda(v);
                return c;
            }
        }
        return null;
    }

    public Pago registrarSalidaVehiculo(String placa) {
    for (Celda c : celdas) {
        if (!c.estaDisponible() && c.getVehiculo().getPlaca().equals(placa)) {
            c.getVehiculo().registrarSalida();            // ✅ CORRECTO
            Pago pago = new Pago(c.getVehiculo());        // ✅ CORRECTO
            pagos.add(pago);
            c.liberarCelda();
            return pago;
        }
    }
    return null;
}

}
