import java.util.ArrayList;

public class Repositorio {
    private ArrayList<Coima> coimaArrayList = new ArrayList<>();
    private ArrayList<Copia> copiaArrayList = new ArrayList<>();
    private ArrayList<Devolucao> devolucaoArrayList = new ArrayList<>();
    private ArrayList<Emprestimo> emprestimoArrayList = new ArrayList<>();
    private ArrayList<Encomenda> encomendaArrayList = new ArrayList<>();
    private ArrayList<EntradaNovoLivro> entradaNovoLivroArrayList = new ArrayList<>();
    private ArrayList<Livro> livroArrayList = new ArrayList<>();
    private ArrayList<Notificacao> notificacaoArrayList = new ArrayList<>();
    private ArrayList<PropostaAquisicao> propostaAquisicaoArrayList = new ArrayList<>();
    private ArrayList<Requisicao> requisicaoArrayList = new ArrayList<>();
    private ArrayList<RequisicaoCompra> requisicaoCompraArrayList = new ArrayList<>();
    private ArrayList<TipoUtilizador> tipoUtilizadorArrayList = new ArrayList<>();
    private ArrayList<Utilizador> utilizadorArrayList = new ArrayList<>();

    public void adicionaCoima(Coima coima) {
        coimaArrayList.add(coima);
    }

    public void adicionaCopia(Copia copia) {
        copiaArrayList.add(copia);
    }

    public void adicionaDevolucao(Devolucao devolucao) {
        devolucaoArrayList.add(devolucao);
    }

    public void adicionaEmprestimo(Emprestimo emprestimo) {
        emprestimoArrayList.add(emprestimo);
    }

    public void adicionarEncomenda(Encomenda encomenda) {
        encomendaArrayList.add(encomenda);
    }

    public void adicionarEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro) { entradaNovoLivroArrayList.add(entradaNovoLivro); }

    public void adicionaLivro(Livro livro) {
        livroArrayList.add(livro);
    }

    public void adicionaNotificacao(Notificacao notificacao) {
        notificacaoArrayList.add(notificacao);
    }

    public void adicionaPropostaAquisicao(PropostaAquisicao propostaAquisicao) { propostaAquisicaoArrayList.add(propostaAquisicao); }

    public void adicionaRequisicao(Requisicao requisicao) {
        requisicaoArrayList.add(requisicao);
    }

    public void adiconaRequisicaoCompra(RequisicaoCompra requisicaoCompra) { requisicaoCompraArrayList.add(requisicaoCompra); }

    public void adicionaTipoUtilizador(TipoUtilizador tipoUtilizador) {
        tipoUtilizadorArrayList.add(tipoUtilizador);
    }

    public void adicionaUtilizador(Utilizador utilizador) {
        utilizadorArrayList.add(utilizador);
    }

    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r) {
        for (Emprestimo emprestimo : emprestimoArrayList) {
            if(emprestimo.getRequisicao() == r)
                return emprestimo;
        }

        return null;
    }
}
