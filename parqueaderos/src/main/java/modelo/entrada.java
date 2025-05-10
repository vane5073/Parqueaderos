package modelo;

import java.time.LocalDateTime;

public class entrada {
    private vehiculo vehiculo;
    private celda celda;
    private LocalDateTime horaEntrada;

    public entrada(vehiculo vehiculo, celda celda) {
        this.vehiculo = vehiculo;
        this.celda = celda;
        this.horaEntrada = LocalDateTime.now();
    }

    public vehiculo getVehiculo() {
        return vehiculo;
    }

    public celda getCelda() {
        return celda;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }
}
