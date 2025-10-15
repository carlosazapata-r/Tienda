package model;

public class Producto {
    protected String codigo;
    protected String nombre;
    protected double precioUnitario;

    public Producto(String codigo, String nombre, double precioUnitario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public String getNombre() {
        return nombre;
    }
}
