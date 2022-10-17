public class Impresora extends Producto{
    int velocidad;

    public Impresora(String codigo, String modelo, int velocidad) {
        super(codigo, modelo);
        this.velocidad = velocidad;
    }
}
