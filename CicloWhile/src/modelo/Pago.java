/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;



public class Pago {
    private Vehiculo vehiculo;
    private double monto;

    public Pago(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        long minutos = vehiculo.calcularTiempo();
        this.monto = minutos * 50; // Por ejemplo, $50 por minuto
    }

    public double getMonto() {
        return monto;
    }
}
