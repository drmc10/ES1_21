import java.time.LocalDate;

public class RequisicaoCompraCopia extends RequisicaoCompra {
    private String estado;
    private LocalDate data;
    private String oficio;

    public RequisicaoCompraCopia(String estado, LocalDate data, String oficio) {
        super(estado, data, oficio);
    }
}
