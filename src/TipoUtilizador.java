public class TipoUtilizador {
    private String descricao;
    private int prazoEmprestimos;

    public TipoUtilizador(String descricao, int prazoEmprestimos) {
        this.descricao = descricao;
        this.prazoEmprestimos = prazoEmprestimos;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getPrazoEmprestimos() {
        return prazoEmprestimos;
    }
}
