public class Asignatura {
    private String idAsignatura;
    private String nombre;
    private int creditos;
    private String idDocente;

    public Asignatura(String idAsignatura, String nombre, int creditos, String idDocente) {
        this.idAsignatura = idAsignatura;
        this.nombre = nombre;
        this.creditos = creditos;
        this.idDocente = idDocente;
    }

    public String getIdAsignatura() {
        return idAsignatura;
    }

    @Override
    public String toString() {
        return "ID: " + idAsignatura + ", Nombre: " + nombre + ", Créditos: " + creditos + ", ID Docente: " + idDocente;
    }
}