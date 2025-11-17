
import Modelo.BasedeDatos;
import Vista.InventarioVista;
import Controler.InventarioControler;

public class App {

    public static void main(String[] args) {
        BasedeDatos baseDatos = new BasedeDatos();
        InventarioVista vista = new InventarioVista();
        InventarioControler controlador = new InventarioControler(baseDatos, vista);
        controlador.iniciar();
    }
}
