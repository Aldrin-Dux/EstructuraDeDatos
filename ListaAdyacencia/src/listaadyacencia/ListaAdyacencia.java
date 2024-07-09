package listaadyacencia;
public class ListaAdyacencia {
    public static void main(String[] args) {
        int opc;
        Metodos obj= new Metodos(6);
        obj.insertarCiudades();
        obj.insertarVecinos();
        obj.listar();
    }
}
