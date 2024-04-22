package model;

public class Produto {

    // atributos - tem
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    // construtor
    public Produto(String descricao, int quantidade, double precoUnitario) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    // metodos - faz
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override // estamos sobreescrevendo o funcionamento natural
    public String toString() {
        return "Descricao: " + descricao
                + ", Quantidade: " + quantidade
                + ", Preco Unitario: " + precoUnitario;
    }
}
