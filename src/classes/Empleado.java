package classes;

public class Empleado extends Persona{
    int numEmpleado;
    String cargo;
    Double sueldo;

    public Empleado() {
    }

    public Empleado(int id, String cedula, String nombre, String apellido, String direccion, String telefono, int numEmpleado, String cargo, Double sueldo) {
        super(id, cedula, nombre, apellido, direccion, telefono);
        this.numEmpleado = numEmpleado;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}
