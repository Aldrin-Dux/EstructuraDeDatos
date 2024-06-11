package proyecto2b;
public class Nodo {
    Alumnos estudiante;
    Nodo sig;

    public Nodo(int id, String nombre, char sexo, float[] notas) {
        this.estudiante  = new Alumnos(id,nombre,sexo,notas);
        this.sig = null;
    }
}
