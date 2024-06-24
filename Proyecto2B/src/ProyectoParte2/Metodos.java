package ProyectoParte2;

import java.util.Scanner;

public class Metodos {

    Scanner sc;
    NodoL head;
    NodoL tall;
    NodoA raizM;
    NodoA raizH;

    public Metodos() {
        this.sc = new Scanner(System.in);
        this.head = null;
        this.tall = null;
        this.raizH = null;
        this.raizM = null;
    }

    public int menu() {
        System.out.println("[1] Ingresar Estudiante:");
        System.out.println("[2] Reporte Arboles:");
        System.out.println("[3] Reporte Varones:");
        System.out.println("[4] Reporte Chicas:");
        System.out.println("[0] Salir:");
        return sc.nextInt();
    }

    public NodoL leerDatos() {
        int id;
        String nombre;
        char sexo;
        float[] notas = new float[3];
        System.out.println("Insertar id: ");
        id = sc.nextInt();
        System.out.println("Insertar Nombre:");
        nombre = sc.nextLine();
        System.out.println("Ingresar sexo:");
        sexo = sc.next().charAt(0);
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Insetar nota" + (i + 1) + ": ");
            notas[i] = sc.nextFloat();
        }
        NodoL nuevo = new NodoL(id, nombre, sexo, notas);
        return nuevo;
    }

    public void insertar() {
        NodoL nuevo = leerDatos();
        if (head == null) {
            head = nuevo;
            tall = nuevo;
        } else {
            tall.sig = nuevo;
            tall = nuevo;
        }
    }

    public NodoA insertarArbol(NodoL info, NodoA actual) {
        if (actual == null) {
            NodoA nuevo = new NodoA(info.id, info.nombre, info.sexo, info.getPromedio());
            return nuevo;
        } else {
            if (info.id < actual.id) {
                actual.izq = insertarArbol(info, actual.izq);
            } else {
                actual.izq = insertarArbol(info, actual.der);
            }
        }
        return actual;
    }
    public void reporte(NodoA actual){
        if(actual!=null){
            reporte(actual.izq);
            if(actual.prom>=7)
                System.out.println(actual.nombre+"esta aprobada...");
            reporte(actual.der);
        }
    }

    public void recorrer() {
        NodoL actual = head;
        while (actual != null) {
            System.out.print(actual.nombre + " :: ");
            if (actual.sexo == 'M') {
                insertarArbol(actual, raizM);
            } else {
                insertarArbol(actual, raizH);
            }
            actual = actual.sig;
        }
        System.out.println("");
    }

    public void llenarLista() {
        int op;
        do {
            System.out.println("[1] Insertar");
            System.out.println("[2] Salir...");
            op = sc.nextInt();
            if (op == 1) {
                insertar();
            }
        } while (op != 0);
        recorrer();
        System.out.println("");
        generar();
    }
}
