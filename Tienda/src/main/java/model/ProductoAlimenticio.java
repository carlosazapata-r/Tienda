package model;

public class ProductoAlimenticio extends Producto {
    private String fechaVencimiento;

    public ProductoAlimenticio(String codigo, String nombre, double precioUnitario, String fechaVencimiento) {
        super(codigo, nombre, precioUnitario);
        this.fechaVencimiento = fechaVencimiento;
    }
}

