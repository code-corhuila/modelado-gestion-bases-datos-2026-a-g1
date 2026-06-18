
public class Estudiante {
    private String idEstudiante;
    private String nombre;
    private String correo;
    private int semestre;

    public Estudiante(String idEstudiante, String nombre, String correo, int semestre) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.correo = correo;
        this.semestre = semestre;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    @Override
    public String toString() {
        return "ID: " + idEstudiante + ", Nombre: " + nombre + ", Correo: " + correo + ", Semestre: " + semestre;
    }
}
