package proyecto2b;
public class Taller2B {

    public static void main(String[] args) {
        Metodos obj = new Metodos();
        int opc, num;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1:
                    obj.insertar();
                    break;
                case 2:
                    obj.listar();
                    break;
                case 3:
                    obj.reporte('M');
                    break;
                case 4:
                    obj.reporte('H');
                    break;
                case 5:
                    System.out.println("Id de estudiante a eliminar: ");
                    num = obj.sc.nextInt();
                    obj.eliminar(num);
                    break;
            }

        } while (opc != 0);
    }
}
/*

*/