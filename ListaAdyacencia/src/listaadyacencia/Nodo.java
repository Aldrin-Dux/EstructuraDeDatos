package listaadyacencia;
public class Nodo {
    String vecino;
    Nodo sig;
    public Nodo(String vecino){
        this.vecino=vecino;
        this.sig=null;
    }
}
