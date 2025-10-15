package FacturaApp;

import model.*;

public class FacturaApp {
    public static void main(String[] args) {
        Cliente cliente1 = new ClienteFrecuente("Ana Gómez", "12345", "Calle 10", 120);

        Producto p1 = new ProductoAlimenticio("A01", "Galletas", 5000, "2025-12-31");
        Producto p2 = new ProductoElectrodomestico("E01", "Licuadora", 150000, 24);

        Factura factura = new Factura("001", "2025-09-12", cliente1);
        factura.agregarProducto(p1);
        factura.agregarProducto(p2);

        factura.mostrarFactura();
    }
}

