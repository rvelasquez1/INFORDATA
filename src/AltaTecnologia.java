import java.util.Date;

public class AltaTecnologia extends Producto{
    String paisOrigen;
    Date fechaFabricacion;
    Empresa empresa;

    public AltaTecnologia(String codigo, String modelo, String paisOrigen) {
        super(codigo, modelo);
        this.paisOrigen = paisOrigen;
    }
}
