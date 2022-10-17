public class Alquilable extends Producto{
    double precioHora;

    public Alquilable(String codigo, String modelo, double precioHora) {
        super(codigo, modelo);
        this.precioHora = precioHora;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    @Override
    public String toString() {
        return "Alquilable{" +
                "precioHora=" + precioHora +
                '}';
    }
}
