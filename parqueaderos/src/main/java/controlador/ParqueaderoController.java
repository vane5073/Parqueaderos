package controlador;

import modelo.*;

import java.util.*;

public class ParqueaderoController {
    private List<celda> celdas;
    private Map<String, entrada> entradasActivas;

    public ParqueaderoController(int totalCeldas) {
        celdas = new ArrayList<>();
        for (int i = 1; i <= totalCeldas; i++) {
            celdas.add(new celda(i));
        }
        entradasActivas = new HashMap<>();
    }

    public entrada registrarEntrada(String placa, String tipo) {
        for (celda celda : celdas) {
            if (celda.isDisponible()) {
                vehiculo vehiculo = new vehiculo(placa, tipo);
                entrada entrada = new entrada(vehiculo, celda);
                celda.ocupar();
                entradasActivas.put(placa, entrada);
                return entrada;
            }
        }
        return null;
    }

    public salida registrarSalida(String placa) {
        entrada entrada = entradasActivas.get(placa);
        if (entrada != null) {
            salida salida = new salida(entrada);
            entrada.getCelda().liberar();
            entradasActivas.remove(placa);
            return salida;
        }
        return null;
    }
}

