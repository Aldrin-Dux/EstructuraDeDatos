package ProyectoParte2;
public class NodoA extends Persona{
    float prom;
    NodoL izq;
    NodoL der;

    public NodoA(int id,String nombre,char sexo, float prom) {
        super(id, nombre, sexo);
        this.prom = prom;
        this.izq=null;
        this.der=null;
    }
}
