package model;

public class ClienteFrecuente extends Cliente {
    private int puntosFidelidad;

    public ClienteFrecuente(String nombre, String cedula, String direccion, int puntosFidelidad) {
        super(nombre, cedula, direccion);
        this.puntosFidelidad = puntosFidelidad;
    }

    @Override
    public double calcularDescuento(double total) {
        return total * 0.05; // 5% de descuento
    }
}

