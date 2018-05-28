package beans.produto;
// @author 104936

import java.time.LocalDateTime;

public class Produto {
    private String nomeProduto;
    private double precoProduto;
    private int quantidadeProduto;
    private LocalDateTime dataCadastrada;

    public Produto(String nomeProduto, double precoProduto, int quantidadeProduto, LocalDateTime dataCadastrada) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.dataCadastrada = dataCadastrada;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public LocalDateTime getDataCadastrada() {
        return dataCadastrada;
    }

    public void setDataCadastrada(LocalDateTime dataCadastrada) {
        this.dataCadastrada = dataCadastrada;
    }
    
    
}
