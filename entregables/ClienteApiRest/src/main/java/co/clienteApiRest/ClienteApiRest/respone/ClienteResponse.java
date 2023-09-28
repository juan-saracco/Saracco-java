package co.clienteApiRest.ClienteApiRest.respone;

public class ClienteResponse {
    private String nombre;
    private String apellido;
    private int anios;

    public ClienteResponse() {
        // Constructor vacío
    }

    public ClienteResponse(String nombre, String apellido, int anios) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.anios = anios;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }
}

