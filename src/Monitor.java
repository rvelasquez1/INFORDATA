public class Monitor extends Alquilable{
    String resolucionMaxima;

    public Monitor(String codigo, String modelo, double precioHora, String resolucionMaxima) {
        super(codigo, modelo, precioHora);
        this.resolucionMaxima = resolucionMaxima;
    }
}
