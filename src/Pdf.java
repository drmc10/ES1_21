public class Pdf extends Ebook {
    private String extensao;

    public Pdf(String titulo, String editora, int tamanho) {
        super(titulo, editora, tamanho);
        this.extensao = ".pdf";
    }

    public String getExtensao() {
        return extensao;
    }
}
