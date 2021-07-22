public class Epub extends Ebook {
    private String extensao;

    public Epub(String titulo, String editora, int tamanho) {
        super(titulo, editora, tamanho);
        this.extensao = ".epub";
    }

    public String getExtensao() {
        return extensao;
    }
}
