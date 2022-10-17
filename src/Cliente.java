public class Cliente {
    String nombre;
    String DNI;
    int telefono;
    String domicilio;

    public Cliente(String nombre, String DNI, int telefono, String domicilio) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", telefono=" + telefono +
                ", domicilio='" + domicilio + '\'' +
                '}';
    }
}
