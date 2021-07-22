import java.time.LocalDate;

public class RequisicaoCompra {
    private String estado;
    private LocalDate data;
    private String oficio;

    public RequisicaoCompra(String estado, LocalDate data, String oficio) {
        this.estado = estado;
        this.data = data;
        this.oficio = oficio;
    }

    public String getEstado() {
        return estado;
    }

    public LocalDate getData() {
        return data;
    }

    public String getOficio() {
        return oficio;
    }
}
