package modelo;

public class vehiculo {
    private String placa;
    private String tipo;

    public vehiculo(String placa, String tipo) {
        this.placa = placa;
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipo() {
        return tipo;
    }
}
