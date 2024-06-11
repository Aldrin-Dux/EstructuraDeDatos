package proyecto2b;
public class Alumnos extends Persona {

    float[] notas;

    public Alumnos(int id, String nombre, char sexo, float[] notas) {
        super(id, nombre, sexo);
        this.notas = notas;
    }

    public float getPromedio() {
        float sum = 0;
        for (float nota : notas) {
            sum += nota;

        }
        return (sum / 3);

    }

}
