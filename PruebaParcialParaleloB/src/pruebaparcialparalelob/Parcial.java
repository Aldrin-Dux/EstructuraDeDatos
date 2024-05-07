
package pruebaparcialparalelob;

/**
 *
 * @author utpl
 */
public class Parcial {

    public static void main(String[] args) {
        Metodos obj = new Metodos();
        int opc;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1:
                    obj.guardar();
                    break;
                default:
                    break;

            }
        } while (opc != 0);
    }
}
