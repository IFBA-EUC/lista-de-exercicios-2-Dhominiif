package Quest_19;

/*
Identifique as classes e implemente um programa para a seguinte especificação: “O
supermercado vende diferentes tipos de produtos. Cada produto tem um preço e uma
quantidade em estoque. Um pedido de um cliente é composto de itens, onde cada
item especifica o produto que o cliente deseja e a respectiva quantidade. Esse
pedido pode ser pago em dinheiro, cheque ou cartão.”
*/

public class Itens {
	
	private int id;
    private Produto produto;
    private int quantidade;


	public Itens(int id, Produto produto, int quantidade) {
		
		this.id = id;
    	this.produto = produto;
    	if (quantidade > 0 && quantidade <= produto.getQuantidade()) {
           	this.quantidade = quantidade;
            produto.setquant(quantidade);
    	} else {
    		this.quantidade = 0;
    	}
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return produto.getNome();
    }

    public double getPreco() {
        return produto.getPreco();
    }

    public int getQuantidade() {
        return quantidade;
    }
}