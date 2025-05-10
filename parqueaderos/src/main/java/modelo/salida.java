package modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class salida {
    private entrada entrada;
    private LocalDateTime horaSalida;

    public salida(entrada entrada) {
        this.entrada = entrada;
        this.horaSalida = LocalDateTime.now();
    }

    public long calcularMinutosEstadia() {
        return Duration.between(entrada.getHoraEntrada(), horaSalida).toMinutes();
    }

    public double calcularPago() {
        long minutos = calcularMinutosEstadia();
        return minutos * 50; // $50 por minuto
    }
}
