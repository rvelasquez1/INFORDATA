import java.util.Date;

public class Venta {
    Cliente cliente;
    Impresora impresora;
    Date fecha;

    public Venta(Cliente cliente, Impresora impresora, Date fecha) {
        this.cliente = cliente;
        this.impresora = impresora;
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Impresora getImpresora() {
        return impresora;
    }

    public void setImpresora(Impresora impresora) {
        this.impresora = impresora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "cliente=" + cliente +
                ", impresora=" + impresora +
                ", fecha=" + fecha +
                '}';
    }
}
