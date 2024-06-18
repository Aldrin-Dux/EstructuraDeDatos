package practicas;

import java.util.Scanner;

public class Metodos {

    Nodo raiz;
    Scanner entrada;

    public Metodos() {
        this.raiz = null;
        this.entrada = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("[1] Insertar:");
        System.out.println("[2] Listar:");
        System.out.println("[3] Eliminar:");
        System.out.println("[0] Salir:");
        return entrada.nextInt();
    }

    public Nodo insertar(int num, Nodo actual) {
        if (actual == null) {
            Nodo nuevo = new Nodo(num);
            return nuevo;
        } else {
            if (num < actual.valor) {
                actual.izq = insertar(num, actual.izq);
            } else {
                actual.der = insertar(num, actual.der);
            }
        }
        return actual;
    }

    public void preOrden(Nodo actual) {
        if (actual != null) {
            System.out.print(actual.valor+"  ");
            preOrden(actual.izq);
            preOrden(actual.der);
        }
    }
    public void inOrden(Nodo actual) {
        if (actual != null) {
            inOrden(actual.izq);
            System.out.print(actual.valor+"  ");
            inOrden(actual.der);
        }
    }
    public void posOrden(Nodo actual) {
        if (actual != null) {
            posOrden(actual.izq);
            posOrden(actual.der);
            System.out.print(actual.valor+"  ");
        }
    }
}
