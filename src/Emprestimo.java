import java.time.LocalDate;
import java.time.Period;

public class Emprestimo {
    private LocalDate data;
    private LocalDate dataOriginal;
    private Requisicao requisicao;
    private int prolongamentos;

    public Emprestimo(LocalDate data, Requisicao requisicao) {
        this.data = data;
        this.dataOriginal = LocalDate.now();
        this.requisicao = requisicao;
        this.prolongamentos = 0;
    }

    public LocalDate getData() {
        return data;
    }

    public Requisicao getRequisicao() {
        return requisicao;
    }

    public void prolongarEmprestimo() {
        if(prolongamentos < 2) {
            this.prolongamentos++;

            Period diferencaTemporal = Period.between(dataOriginal, data);
            this.data.plus(diferencaTemporal);
        }
    }
}
