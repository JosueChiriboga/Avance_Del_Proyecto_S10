public class Recepcionista {

    private int idRecepcionista;
    private String nombre;
    private String apellido;

    public Recepcionista(int idRecepcionista, String nombre, String apellido) {
        this.idRecepcionista = idRecepcionista;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getters
    public int getIdRecepcionista() {
        return idRecepcionista;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return idRecepcionista + " " + nombre + " " + apellido;
    }
}
