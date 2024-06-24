package ProyectoParte2;
public class NodoL extends Persona{
    float[] notas;
    NodoL sig;

    public NodoL(int id,String nombre,char sexo, float[] notas) {
        super(id, nombre, sexo);
        this.notas = notas;
        this.sig=null;
    }
    public float getPromedio(){
        float acum=0;
        for(float nota: notas)
            acum+=nota;
        return acum/notas.length;
    }
}
