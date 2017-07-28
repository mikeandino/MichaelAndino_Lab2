package laboratorio.pkg2;

public class Solicitudes {
    String receptor;
    String emisor;
    String estado;

    public Solicitudes(String receptor, String emisor, String estado) {
        this.receptor = receptor;
        this.emisor = emisor;
        this.estado = estado;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Solicitudes{" + "receptor=" + receptor + ", emisor=" + emisor + ", estado=" + estado + '}';
    }
    
}
