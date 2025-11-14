package Modelo;

import java.util.ArrayList;
import java.util.List;

public class BasedeDatos {
    private List<Producto> productos;

    public BasedeDatos() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Producto buscarProductoSku(String sku) {
        for (Producto p : productos) {
            if (p.getSku().equalsIgnoreCase(sku)) {
                return p;
            }
        }
        return null;
    }

    public List<Producto> buscarTodos() {
        return productos;
    }

    public boolean eliminarProducto(String sku) {
        Producto encontrado = buscarProductoSku(sku);
        if (encontrado != null) {
            productos.remove(encontrado);
            return true;
        }
        return false;
    }
}
