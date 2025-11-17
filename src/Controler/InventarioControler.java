package Controler;

import Modelo.*;
import Vista.*;

public class InventarioControler {

    private BasedeDatos BasedeDatos;
    private InventarioVista inventarioVista;

    public InventarioControler(BasedeDatos baseDatos, InventarioVista vista) {
        this.BasedeDatos = baseDatos;
        this.inventarioVista = vista;
    }

    public void iniciar() {
        boolean salir = false;

        while (!salir) {
            int opcion = inventarioVista.mostrarMenu();

            switch (opcion) {
                case 1:
                    Producto nuevo = inventarioVista.pedirDatosUsuario();
                    BasedeDatos.agregarProducto(nuevo);
                    inventarioVista.mostrarMensaje(" Producto agregado correctamente.");
                    break;
                case 2:
                    String skuBuscar = inventarioVista.pedirSku();
                    Producto encontrado = BasedeDatos.buscarProductoSku(skuBuscar);
                    inventarioVista.mostrarProducto(encontrado);
                    break;
                case 3:
                    inventarioVista.mostrarProductos(BasedeDatos.buscarTodos());
                    break;
                case 4:
                    String skuEliminar = inventarioVista.pedirSku();
                    boolean eliminado = BasedeDatos.eliminarProducto(skuEliminar);
                    if (eliminado) {
                        inventarioVista.mostrarMensaje(" Producto eliminado correctamente.");
                    } else {
                        inventarioVista.mostrarMensaje(" No se encontró el producto con ese SKU.");
                    }
                    break;
                case 5:
                    salir = true;
                    inventarioVista.mostrarMensaje("Saliendo del sistema...");
                    break;
                default:
                    inventarioVista.mostrarMensaje(" Opción inválida. Intente nuevamente.");
            }
        }
    }
}
