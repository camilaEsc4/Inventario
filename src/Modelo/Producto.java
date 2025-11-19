package Modelo;

public class Producto {

    /*si inventario*/

    private String nombre;
    private String sku;
    private int cantidad;
    private double precio;
    private String color; //prueba

    public Producto(String nombre, String sku, int cantidad, double precio) {
        this.nombre = nombre;
        this.sku = sku;
        this.cantidad = cantidad;
        this.precio = precio;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSku() {
        return sku;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "SKU: " + sku + " | Nombre: " + nombre
                + " | Cantidad: " + cantidad + " | Precio: $" + precio;
    }
}
