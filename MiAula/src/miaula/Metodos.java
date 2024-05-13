package miaula;

import java.util.Scanner;

public class Metodos {

    Scanner entrada;
    Alumno[] miAula;
    int ev;

    public Metodos(int lim) {
        this.entrada = new Scanner(System.in);
        this.miAula = new Alumno[lim];
        this.ev = 0;
    }

    public int menu() {
        System.out.println("Insertar lleno                 [1]");
        System.out.println("Insertar en espacio libre      [2]");
        System.out.println("Presentar                      [3]");
        System.out.println("Buscar numero                  [4]");
        System.out.println("Eliminar numero                [5]");
        System.out.println("Agregar numero                 [6]");
        System.out.println("Insertar en orden              [7]");
        System.out.println("Buscar por busqueda secuencial [8]");
        System.out.println("Ordenar de forma burbuja       [9]");
        System.out.println("Salir                          [0]");
        return entrada.nextInt();
    }

    public boolean aulaVacia() {
        return (ev == 0);
    }

    public boolean aulaLlena() {
        return (ev == miAula.length);
    }

    public Alumno LeeDatos() {
        int id;
        String nombre;
        char sexo;
        float[] notas = new float[3];
        System.out.println("Ingrese id:");
        id = entrada.nextInt();
        entrada.nextLine();
        nombre = entrada.nextLine();
        sexo = entrada.next().charAt(0);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese calificacion" + (i + 1));
            notas[i] = entrada.nextFloat();
        }
        Alumno nuevo = new Alumno(id, nombre, sexo, notas);
        return nuevo;
    }

    public void insertar() {
        int num;
        if (!aulaLlena()) {
            miAula[ev] = LeeDatos();
            ev++;
        } else {
            System.out.println("No hay espacio...");
        }
    }
    public void presentar(){
        if(!aulaLlena()){
            for(int i=0;i<ev;i++){
                System.out.println("Id: "+miAula[i].Id);
                System.out.println("Nombre: "+miAula[i].nombre);
                System.out.println("Sexo: "+miAula[i].sexo);
                System.out.println("Nota 1: "+miAula[i].calif[0]);
                System.out.println("Nota 1: "+miAula[i].calif[1]);
                System.out.println("Nota 1: "+miAula[i].calif[2]);
                System.out.println("===============================");
            }
        }else
            System.out.println("Aula vacia...");
    }
}
