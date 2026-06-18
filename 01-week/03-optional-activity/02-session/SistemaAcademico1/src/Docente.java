public class Docente {
    private String idDocente;
    private String nombre;
    private String correo;
    private String especialidad;

    public Docente(String idDocente, String nombre, String correo, String especialidad) {
        this.idDocente = idDocente;
        this.nombre = nombre;
        this.correo = correo;
        this.especialidad = especialidad;
    }

    public String getIdDocente() {
        return idDocente;
    }

    @Override
    public String toString() {
        return "ID: " + idDocente + ", Nombre: " + nombre + ", Correo: " + correo + ", Especialidad: " + especialidad;
    }
}