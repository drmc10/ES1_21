public class Ebook extends Livro {
    private int tamanho;
    private int assinatura;

    public Ebook(String titulo, String editora, int tamanho) {
        super(titulo, editora);
        this.tamanho = tamanho;
        this.assinatura = this.getTitulo().hashCode();
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getAssinatura() {
        return assinatura;
    }
}
