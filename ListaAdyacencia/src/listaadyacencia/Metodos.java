package listaadyacencia;

import java.util.Scanner;

public class Metodos {

    Scanner sc;
    String[] ciudades;
    Nodo[] vecinos;
    int tamanio;

    public Metodos(int lim) {
        this.sc = new Scanner(System.in);
        this.tamanio = lim;
        this.ciudades = new String[tamanio];
        this.vecinos = new Nodo[tamanio];
        for (int i = 0; i < tamanio; i++) {
            vecinos[i] = null;
        }
    }

    public void insertarCiudades() {
        ciudades[0] = "GUA";
        ciudades[1] = "GUE";
        ciudades[2] = "MEX";
        ciudades[3] = "VER";
        ciudades[4] = "OAX";
        ciudades[5] = "MER";
        //esta forma es quemada para mostrar solo el ejemplo, el de abajo es para
        //uno mas interactivo
        /*for(int i=0;i<tamanio;i++){
            System.out.println("Inserte ciudad "+i+":");
            ciudades[i]=sc.nextLine();
        }*/
    }

    public void insertarLista(int num, int ind) {
        Nodo nuevo = new Nodo(ciudades[num]);
        if(vecinos[ind]==null){
            vecinos[ind]=nuevo;
        }else{
            Nodo actual= vecinos[ind];
            while(actual.sig!=null){
                actual=actual.sig;
            }
            actual.sig=nuevo;
        }
    }

    public void insertarVecinos() {
        int opc, num;
        for (int i = 0; i < tamanio; i++) {
            System.out.println("Insertar vecinos para " + ciudades[i]);
            do {
                for (int j = 0; j < tamanio; j++) {
                    if (j != i) {
                        System.out.println(ciudades[j] + "[" + j + "]: ");
                    }
                }
                num = sc.nextInt();
                insertarLista(num, i);
                System.out.println("Otra? si[1] no[0]");
                opc = sc.nextInt();
            } while (opc != 0);
        }
    }
    public void listar(){
        for(int i=0;i<tamanio;i++){
            System.out.print(ciudades[i]+" limita con: ");
            Nodo actual=vecinos[i];
            while(actual!=null){
                System.out.print(actual.vecino+" -> ");
                actual=actual.sig;
            }
            System.out.println("Null");
        }
    }
}
