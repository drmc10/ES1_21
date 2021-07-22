import java.time.LocalDate;

public class PropostaAquisicao {
    private LocalDate data;
    private Utilizador utilizador;

    public PropostaAquisicao(LocalDate data, Utilizador utilizador) {
        this.data = data;
        this.utilizador = utilizador;
    }

    public LocalDate getData() {
        return data;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }
}
