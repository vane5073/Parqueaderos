/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class ControladorPago {
    private int numero;
    private boolean disponible = true;
    private PagoDAO vehiculo;

    public ControladorPago(int numero) {
        this.numero = numero;
    }

    public boolean ocuparCelda(PagoDAO vehiculo) {
        if (disponible) {
            this.vehiculo = vehiculo;
            disponible = false;
            return true;
        }
        return false;
    }

    public void liberarCelda() {
        this.vehiculo = null;
        disponible = true;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public int getNumero() {
        return numero;
    }

    // 🔧 Este método nuevo permite acceder a vehiculo de forma segura
    public PagoDAO getVehiculo() {
        return vehiculo;
    }
}
