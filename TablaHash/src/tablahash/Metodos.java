package tablahash;

import java.util.Scanner;

public class Metodos {

    Scanner entrada;
    Nodo[] claves;
    int tamanio;

    public Metodos(int num) {
        this.entrada = new Scanner(System.in);
        this.tamanio = num;
        this.claves = new Nodo[tamanio];
        for (int i = 0; i < tamanio; i++) {
            claves[i] = null;
        }
    }

    public int menu() {
        System.out.println("[1] Insertar");
        System.out.println("[2] Listar");
        System.out.println("[0] Salir");
        return entrada.nextInt();
    }

    public boolean nodoVacio(Nodo actual) {
        return actual == null;
    }

    public int getNumero(String cadena) {
        int sum = 0;
        for (int i = 0; i < cadena.length(); i++) {
            sum += (int) cadena.charAt(i);

        }
        return sum;
    }

    public int getHash(int num) {
        return num % tamanio;
    }

    public void insertHash(int key, int id, String nombre) {
        Nodo nuevo = new Nodo(id, nombre);
        if (nodoVacio(claves[key])) {
            claves[key] = nuevo;
        } else {
            Nodo actual = claves[key];
            while (!nodoVacio(actual.sig)) {
                actual = actual.sig;
            }
            actual.sig = nuevo;
        }
    }

    public void insertar() {
        int id;
        String nombre;
        System.out.println("Digite el Id:");
        id = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Digite el nombre:");
        nombre = entrada.nextLine();
        insertHash(getHash(getNumero(nombre)), id, nombre);
    }
    public void listar(){
        for(int i=0;i<tamanio;i++){
            if(!nodoVacio(claves[i])){
                Nodo actual=claves[i];
                System.out.print(i+":: ");
                while(!nodoVacio(actual)){
                    System.out.print(actual.id+" "+actual.nombre+" -> ");
                    actual=actual.sig;
                }
                System.out.println("null");
            }
        }
    }
}
