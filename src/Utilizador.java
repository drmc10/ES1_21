public class Utilizador {
    private String nome;
    private String estado;
    private TipoUtilizador tipoUtilizador;
    private boolean isActive;

    public Utilizador(String nome, String estado) {
        this.nome = nome;
        this.estado = estado;
        this.isActive = true;
    }

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    public TipoUtilizador getTipoUtilizador() {
        return tipoUtilizador;
    }

    public boolean isActive() {
        return isActive;
    }

    public void blockUser() {
        this.isActive = false;
    }
}
