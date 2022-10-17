public class SoporteTecnico {
    Empresa empresa;
    AltaTecnologia altaTecnologia;
    double precio;

    public SoporteTecnico(Empresa empresa, AltaTecnologia altaTecnologia, double precio) {
        this.empresa = empresa;
        this.altaTecnologia = altaTecnologia;
        this.precio = precio;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public AltaTecnologia getAltaTecnologia() {
        return altaTecnologia;
    }

    public void setAltaTecnologia(AltaTecnologia altaTecnologia) {
        this.altaTecnologia = altaTecnologia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "SoporteTecnico{" +
                "empresa=" + empresa +
                ", altaTecnologia=" + altaTecnologia +
                ", precio=" + precio +
                '}';
    }
}
