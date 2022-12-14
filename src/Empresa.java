public class Empresa {
    String nombre;
    String direccion;
    int numeroEmpleados;

    public Empresa(String nombre, String direccion, int numeroEmpleados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroEmpleados = numeroEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", numeroEmpleados=" + numeroEmpleados +
                '}';
    }
}
