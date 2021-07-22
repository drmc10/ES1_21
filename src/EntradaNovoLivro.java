import java.time.LocalDate;

public class EntradaNovoLivro {
    private LocalDate data;
    private Encomenda encomenda;

    public EntradaNovoLivro(LocalDate data, Encomenda encomenda) {
        this.data = data;
        this.encomenda = encomenda;
    }

    public LocalDate getData() {
        return data;
    }

    public Encomenda getEncomenda() {
        return encomenda;
    }
}
