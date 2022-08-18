package br.com.stefanini.developerup.dto;


public class ProdutoDto {

    private Long codigo;
    private String nome;
    private boolean comprado;

    public Long getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isComprado() {
        return this.comprado;
    }

    public void setComprado(boolean comprado) {
        this.comprado = comprado;
    }
}