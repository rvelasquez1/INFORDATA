public class CPU extends AltaTecnologia{
    double memoriaPrincipal;

    public CPU(String codigo, String modelo, String paisOrigen, double memoriaPrincipal) {
        super(codigo, modelo, paisOrigen);
        this.memoriaPrincipal = memoriaPrincipal;
    }
}
