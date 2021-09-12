package Quest_19;

/*
Identifique as classes e implemente um programa para a seguinte especificação: “O
supermercado vende diferentes tipos de produtos. Cada produto tem um preço e uma
quantidade em estoque. Um pedido de um cliente é composto de itens, onde cada
item especifica o produto que o cliente deseja e a respectiva quantidade. Esse
pedido pode ser pago em dinheiro, cheque ou cartão.”
*/

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private int idEscolha;
	
    public Produto(int id, String nome, double preco, int quantidade) {
        this.idEscolha = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidade;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }
    public void setquant(int t) {
        this.quantidadeEstoque = this.quantidadeEstoque - t;
    }

    public int getQuantidade() {
        return this.quantidadeEstoque;
    }
    
    public void getProduto(){

        if(this.quantidadeEstoque > 0){
		    System.out.printf("\n\n\tNome: "+this.nome+"\n\tNúmero para pedido: "+this.idEscolha+"\n\tPreço: "+this.preco+"\n\tQuantidade em estoque: "+this.quantidadeEstoque);
        }else{
            System.out.printf("\n\n\tNome: "+this.nome+"\n\tNúmero para pedido: "+this.idEscolha+"\n\tPreço: "+this.preco+"\n\tSem estoque");
        }
    }
}