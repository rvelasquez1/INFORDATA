public class Proveedor {
    int NIF;
    String direccion;

    public Proveedor(int NIF, String direccion) {
        this.NIF = NIF;
        this.direccion = direccion;
    }

    public int getNIF() {
        return NIF;
    }

    public void setNIF(int NIF) {
        this.NIF = NIF;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "NIF=" + NIF +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
