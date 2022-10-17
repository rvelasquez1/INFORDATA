public class DiscoDuro extends Alquilable{
    int capacidad;

    public DiscoDuro(String codigo, String modelo, double precioHora, int capacidad) {
        super(codigo, modelo, precioHora);
        this.capacidad = capacidad;
    }
}
