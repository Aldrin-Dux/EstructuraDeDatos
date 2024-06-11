package enlazadas;

public class Enlazada {

    public static void main(String[] args) {
        int opc, num;
        Metodos obj = new Metodos();

        do {
            opc = obj.menu();
            switch (opc) {
                case 1:
                    System.out.println("Elemento a insertar: ");
                    num = obj.sc.nextInt();
                    obj.insertarFinal(num);
                    break;
                case 2:
                    System.out.println("Elemento a insertar: ");
                    num = obj.sc.nextInt();
                    obj.insertaOrdenado(num);
                    break;
                case 3:
                    obj.recorrer();
                    break;
                case 4:
                    System.out.println("Elemento a eliminar: ");
                    num = obj.menu();
                    obj.eliminar(num);
            }
        } while (opc != 0);
    }
}
