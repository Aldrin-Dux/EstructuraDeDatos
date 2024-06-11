package proyecto2b;

import java.util.Scanner;

public class Metodos {

    Scanner sc;
    Nodo head;
    Nodo tail;

    public Metodos() {
        this.sc = new Scanner(System.in);
        this.head = null;
        this.tail = null;

    }

    public int menu() {
        System.out.println("[1] Insertar Estudiante:");
        System.out.println("[2] Listar Estudiantes:");
        System.out.println("[3] Reporte Mujeres:");
        System.out.println("[4] Reporte Varones:");
        System.out.println("[5] Eliminar Estudiante:");
        System.out.println("[0] Salir:");
        return sc.nextInt();
    }

    public boolean listaVacia() {
        return (head == null);
    }

    public Nodo leerEstudiante() {
        Nodo nuevo;
        String nombre;
        float[] notas = new float[3];
        System.out.println("Ingrese el nombre:");
        nombre = sc.nextLine();
        System.out.println("Ingrese sexo: ");
        char sexo = sc.nextLine().charAt(0);
        System.out.println("Ingrese el Id: ");
        int id = sc.nextInt();
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese la nota " + (i + 1) + ":");
            notas[i] = sc.nextFloat();

        }
        sc.nextLine();
        nuevo = new Nodo(id, nombre, sexo, notas);
        return nuevo;

    }

    public void insertar() {
        Nodo nuevo = leerEstudiante();
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;

        } else {
            tail.sig = nuevo;
            tail = nuevo;
        }

    }

    public void listar() {

        Nodo actual = head;
        while (actual != null) {
            System.out.print(actual.estudiante + "   ");
            actual = actual.sig;
        }
    }

    public void reporte(char x) {
        Nodo actual = head;
        while (actual != null) {
            if (actual.estudiante.sexo == x) {
                if (actual.estudiante.getPromedio() >= 7) {
                    System.out.println(actual.estudiante.nombre + "esta APROBADO...");
                }
                actual = actual.sig;
            }
        }
    }

    public void eliminar(int num) {
        if (listaVacia()) {
            System.out.println("No hay elementos...");
        } else {
            Nodo actual = head;
            if (num == actual.estudiante.id) {
                head = head.sig;
                if (listaVacia()) {
                    tail = null;
                }
            } else {
                while ((actual.sig != null) && (actual.sig.estudiante.id != num)) {
                    actual = actual.sig;
                }
                if (actual.sig == null) {
                    System.out.println("No esta...");
                } else {
                    actual.sig = actual.sig.sig;
                }if(actual.sig==null)
                    tail=actual;
            }
        }
    }

}
