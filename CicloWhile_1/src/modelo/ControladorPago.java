/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.time.LocalDate;

/**
 *
 * @author user
 */

    

public class ControladorPago {
    private PagoDAO dao;

    public ControladorPago() {
        dao = new PagoDAO();
    }

    public void registrarNuevoPago(int idUsuario, double monto) {
        String fechaHoy = LocalDate.now().toString();
        Pago nuevoPago = new Pago(idUsuario, monto, fechaHoy);
        boolean exito = dao.registrarPago(nuevoPago);
        if (exito) {
            System.out.println("Pago registrado exitosamente.");
        } else {
            System.out.println("No se pudo registrar el pago.");
        }
    }
}

