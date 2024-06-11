package enlazadas;
import java.util.Scanner;
public class Metodos {

    Scanner sc;
    Nodo head;
    Nodo tail;
    Nodo head2;
    Nodo tail2;

    public Metodos() {
        this.sc = new Scanner(System.in);
        this.head = null;
        this.tail = null;
        this.head2=null;

    }

    public int menu() {
        System.out.println("       MENU PRINCIPAL");
        System.out.println("Insertar Final             [1]:");
        System.out.println("Insertar Ordenado          [2]:");
        System.out.println("Recorrer Lista             [3]:");
        System.out.println("Eliminar elemento          [4]:");
        System.out.println("Salir                      [0]:");
        return sc.nextInt();
    }

    public boolean listaVacia() {
        return (head == null);
    }

    public void insertarFinal(int num) {
        Nodo nuevo = new Nodo(num);
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
        } else {
            tail.sig = nuevo;
            tail = nuevo;
        }

    }

    public void insertarInicio(int num) {
        Nodo nuevo = new Nodo(num);
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
        } else {
            nuevo.sig = head;
            head = nuevo;
        }
    }

    public void recorrer() {
        if (!listaVacia()) {
            Nodo actual = head;
            while (actual != null) {
                System.out.print(actual.valor + "   ");
                actual = actual.sig;
            }
            System.out.println("");
        } else {
            System.out.println("La lista esta vacia");
        }
    }

    public void insertaOrdenado(int num) {
        Nodo nuevo = new Nodo(num);
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
        } else {
            if (num < head.valor) {
                nuevo.sig = head;
                head = nuevo;

            } else {
                Nodo actual = head;
                while ((actual.sig != null) && (num > actual.sig.valor)) {
                    actual = actual.sig;

                }
                nuevo.sig = actual.sig;
                actual.sig = nuevo;
                if (nuevo.sig == null) {
                    tail = nuevo;

                }

            }
        }
    }

    public void eliminar(int num) {
        if (listaVacia()) {
            System.out.println("No hay elementos a eliminar....");
        } else {
            if (num == head.valor) {
                head = head.sig;
                if (head == null) {
                    tail = null;
                }
            } else {
                Nodo actual = head;
                while ((actual.sig != null) && (num != actual.sig.valor)) {
                    actual = actual.sig;
                    if (actual.sig != null) {
                        actual.sig = actual.sig.sig;
                        if (actual.sig == null) {
                            tail = actual;
                        }
                    } else {
                        System.out.println("El numero no existe...");
                    }
                }
            }
        }
    }
    public void invertirL(Nodo actual){
        if(actual!=null){
            invertirL(actual.sig);
            Nodo nuevo=new Nodo(actual.valor);
            if(head2==null){
                head2=tail2=nuevo;
            }else{
                tail2.sig=nuevo;
                tail2=nuevo;
            }
        }
    }

}