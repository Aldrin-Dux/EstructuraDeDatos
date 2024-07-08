package tablahash;

public class TablaHash {

    public static void main(String[] args) {
        int opc;
        Metodos obj = new Metodos(16);
        do {
            opc=obj.menu();
            switch(opc){
                case 1-> obj.insertar();
                case 2-> obj.listar();
            }
        } while (opc != 0);
    }
}
