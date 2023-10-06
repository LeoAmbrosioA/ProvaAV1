
package questao1;
import javax.swing.JOptionPane;
public class  AcharPedido {
    private String titulo;
    private String descricao;
    private String foto;
    private String tipo;
    private String localAchado;
    private String dtaHr;
    private String status;

    public AcharPedido(String chave, String image, String salaDeEstar, String objetoPessoal, String encontrado) {
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getFoto() {
        return foto;
    }

    public String getTipo() {
        return tipo;
    }

    public String getLocalAchado() {
        return localAchado;
    }

    public String getDtaHr() {
        return dtaHr;
    }

    public String getStatus() {
        return status;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setLocalAchado(String localAchado) {
        this.localAchado = localAchado;
    }

    public void setDtaHr(String dtaHr) {
        this.dtaHr = dtaHr;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AcharPedido(String titulo, String descricao, String foto, String tipo, String localAchado, String dtaHr, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.foto = foto;
        this.tipo = tipo;
        this.localAchado = localAchado;
        this.dtaHr = dtaHr;
        this.status = status;



    }

    public String buscarTitulo(String titulo) {
        if (this.titulo.equals(titulo)) {
            
            return "Título: " + this.titulo + "\nDescrição: " + this.descricao + "\nLocal Achado: " + this.localAchado;
        } else
            return "Título não encontrado.";
        }
    public void visualizaDetalhes() {
        String mensagem = "Título: " + titulo + "\nFoto: " + foto + "\nLocal Achado: " + localAchado + "\nTipo: " + tipo + "\nStatus: " + status;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}

