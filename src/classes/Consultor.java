package classes;

public class Consultor extends Persona{
    String nombre_consultor;
    String num_consultor;

    public Consultor() {
    }

    public Consultor(int id, String cedula, String nombre, String apellido, String direccion, String telefono, String nombre_consultor, String num_consultor) {
        super(id, cedula, nombre, apellido, direccion, telefono);
        this.nombre_consultor = nombre_consultor;
        this.num_consultor = num_consultor;
    }

    public String getNombre_consultor() {
        return nombre_consultor;
    }

    public void setNombre_consultor(String nombre_consultor) {
        this.nombre_consultor = nombre_consultor;
    }

    public String getNum_consultor() {
        return num_consultor;
    }

    public void setNum_consultor(String num_consultor) {
        this.num_consultor = num_consultor;
    }
}
