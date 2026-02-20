import java.util.ArrayList;

public class Main {
    private static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private static ArrayList<Docente> docentes = new ArrayList<>();
    private static ArrayList<Asignatura> asignaturas = new ArrayList<>();
    private static ArrayList<Nota> notas = new ArrayList<>();

    public static void main(String[] args) {
        // Registrar algunos datos de ejemplo
        registrarEstudiante("E001", "Ana Gómez", "ana@mail.com", 5);
        registrarEstudiante("E002", "Luis Pérez", "luis@mail.com", 4);

        registrarDocente("D001", "Carlos Ruiz", "carlos@mail.com", "Bases de Datos");
        registrarDocente("D002", "María López", "maria@mail.com", "Programación");

        registrarAsignatura("A001", "Bases de Datos", 4, "D001");
        registrarAsignatura("A002", "Programación II", 3, "D002");

        registrarNota("N001", "E001", "A001", 4.5);
        registrarNota("N002", "E001", "A002", 3.8);
        registrarNota("N003", "E002", "A001", 4.0);

        // Mostrar historial de un estudiante
        System.out.println("=== Historial de notas de Ana Gómez (E001) ===");
        mostrarHistorial("E001");
    }

    // Funciones de registro
    public static void registrarEstudiante(String id, String nombre, String correo, int semestre) {
        if (buscarEstudiantePorId(id) == null) {
            estudiantes.add(new Estudiante(id, nombre, correo, semestre));
            System.out.println("Estudiante registrado: " + nombre);
        } else {
            System.out.println("Error: Ya existe un estudiante con ID " + id);
        }
    }

    public static void registrarDocente(String id, String nombre, String correo, String especialidad) {
        if (buscarDocentePorId(id) == null) {
            docentes.add(new Docente(id, nombre, correo, especialidad));
            System.out.println("Docente registrado: " + nombre);
        } else {
            System.out.println("Error: Ya existe un docente con ID " + id);
        }
    }

    public static void registrarAsignatura(String id, String nombre, int creditos, String idDocente) {
        if (buscarAsignaturaPorId(id) == null && buscarDocentePorId(idDocente) != null) {
            asignaturas.add(new Asignatura(id, nombre, creditos, idDocente));
            System.out.println("Asignatura registrada: " + nombre);
        } else {
            System.out.println("Error: ID de asignatura duplicado o docente no existe.");
        }
    }

    public static void registrarNota(String idRegistro, String idEstudiante, String idAsignatura, double notaFinal) {
        if (buscarEstudiantePorId(idEstudiante) != null && buscarAsignaturaPorId(idAsignatura) != null) {
            notas.add(new Nota(idRegistro, idEstudiante, idAsignatura, notaFinal));
            System.out.println("Nota registrada para estudiante " + idEstudiante + " en asignatura " + idAsignatura);
        } else {
            System.out.println("Error: Estudiante o asignatura no existen.");
        }
    }

    // Funciones de búsqueda
    public static Estudiante buscarEstudiantePorId(String id) {
        for (Estudiante e : estudiantes) {
            if (e.getIdEstudiante().equals(id)) {
                return e;
            }
        }
        return null;
    }

    public static Docente buscarDocentePorId(String id) {
        for (Docente d : docentes) {
            if (d.getIdDocente().equals(id)) {
                return d;
            }
        }
        return null;
    }

    public static Asignatura buscarAsignaturaPorId(String id) {
        for (Asignatura a : asignaturas) {
            if (a.getIdAsignatura().equals(id)) {
                return a;
            }
        }
        return null;
    }

    // Mostrar historial de notas de un estudiante
    public static void mostrarHistorial(String idEstudiante) {
        Estudiante est = buscarEstudiantePorId(idEstudiante);
        if (est == null) {
            System.out.println("Estudiante no encontrado.");
            return;
        }

        System.out.println("Estudiante: " + est.toString());
        System.out.println("Notas:");
        for (Nota n : notas) {
            if (n.getIdEstudiante().equals(idEstudiante)) {
                Asignatura a = buscarAsignaturaPorId(n.getIdAsignatura());
                System.out.println("  - " + (a != null ? a.getNombre() : "Asignatura desconocida") + ": " + n.getNotaFinal());
            }
        }
    }
}