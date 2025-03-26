package br.edu.fatecpg.model;

public class Produto {
    //Crie uma classe Produto (nome, categoria, e preço) e filtre os produtos de categoria "Eletronica"
    //Aplique 10% de desconto em produtos em preços maior que 100
    //Apresentar a soma do preço de todos os produtos

    public Produto(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }

    public String nome;
    public String categoria;
    public double preco;

    @Override
    public String toString() {
        return nome + " - " + categoria + String.format("%.2f", preco);
    }

    public void aplicarDesconto() {
        if (preco > 100) {
            preco *= 0.9;
        }
    }
}
