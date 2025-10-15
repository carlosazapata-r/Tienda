package model;

public class Cliente {
    protected String nombre;
    protected String cedula;
    protected String direccion;

    public Cliente(String nombre, String cedula, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
    }

    public double calcularDescuento(double total) {
        return 0; // por defecto no hay descuento
    }

    public String getNombre() {
        return nombre;
    }
}
