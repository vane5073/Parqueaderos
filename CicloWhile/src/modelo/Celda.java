/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Celda {
    private int numero;
    private boolean disponible = true;
    private Vehiculo vehiculo;

    public Celda(int numero) {
        this.numero = numero;
    }

    public boolean ocuparCelda(Vehiculo vehiculo) {
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
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
