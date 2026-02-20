public class Nota {
    private String idRegistro;
    private String idEstudiante;
    private String idAsignatura;
    private double notaFinal;

    public Nota(String idRegistro, String idEstudiante, String idAsignatura, double notaFinal) {
        this.idRegistro = idRegistro;
        this.idEstudiante = idEstudiante;
        this.idAsignatura = idAsignatura;
        this.notaFinal = notaFinal;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public String getIdAsignatura() {
        return idAsignatura;
    }

    @Override
    public String toString() {
        return "ID Registro: " + idRegistro + ", ID Estudiante: " + idEstudiante + ", ID Asignatura: " + idAsignatura + ", Nota Final: " + notaFinal;
    }
}