package questao2;

abstract class Projeto {
    protected String nomeProjeto;
    protected String descricao;
    protected String endereco;
    protected String dataInicio;
    protected String dataFim;

    public Projeto(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim) {
        this.nomeProjeto = nomeProjeto;
        this.descricao = descricao;
        this.endereco = endereco;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }


    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public abstract String imprimeProjeto();
}


