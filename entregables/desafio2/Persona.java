public class Persona implements Comparable<Persona> {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public int compareTo(Persona otraPersona) {
        // Comparar por apellido y luego por nombre
        int resultado = this.nombre.compareTo(otraPersona.nombre);
        if (resultado == 0) {
            resultado = this.apellido.compareTo(otraPersona.apellido);
        }
        return resultado;
    }
}

