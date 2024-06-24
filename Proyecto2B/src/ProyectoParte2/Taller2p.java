package ProyectoParte2;
public class Taller2p {
    public static void main(String[] args) {
        Metodos obj = new Metodos();
        int opc, num;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1:
                    obj.llenarLista();
                    break;
                case 2:
                    obj.reporte('H');
                    break;
                case 3:
                    obj.reporte('M');
                    break;
            }

        } while (opc != 0);
    }
}
