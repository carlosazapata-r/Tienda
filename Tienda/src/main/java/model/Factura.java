package model;

import java.util.ArrayList;

public class Factura {
    private String numero;
    private String fecha;
    private Cliente cliente;
    private ArrayList<Producto> listaProductos;

    public Factura(String numero, String fecha, Cliente cliente) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.listaProductos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : listaProductos) {
            total += p.getPrecioUnitario();
        }
        double descuento = cliente.calcularDescuento(total);
        return total - descuento;
    }

    public void mostrarFactura() {
        System.out.println("Factura N°: " + numero);
        System.out.println("Fecha: " + fecha);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Productos:");
        for (Producto p : listaProductos) {
            System.out.println(" - " + p.getNombre() + ": $" + p.getPrecioUnitario());
        }
        System.out.println("Total a pagar: $" + calcularTotal());
    }
}

