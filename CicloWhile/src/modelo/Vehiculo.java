/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;



public class Vehiculo {
    private String placa;
    private Usuario propietario;
    private long horaEntrada;
    private long horaSalida;

    public Vehiculo(String placa, Usuario propietario) {
        this.placa = placa;
        this.propietario = propietario;
    }

    public void registrarEntrada() {
        this.horaEntrada = System.currentTimeMillis();
    }

    public void registrarSalida() {
        this.horaSalida = System.currentTimeMillis();
    }

    public long calcularTiempo() {
        return (horaSalida - horaEntrada) / 1000 / 60; // minutos
    }

    public String getPlaca() { return placa; }
}

