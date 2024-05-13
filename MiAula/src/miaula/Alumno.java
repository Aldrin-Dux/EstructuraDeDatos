package miaula;
public class Alumno extends Persona{
    float[] calif;

    public Alumno(int _Id, String _nombre, char _sexo, float[] notas) {
        super(_Id, _nombre, _sexo);
        this.calif = notas;
    }
}
