package Quest_19;

/*
Identifique as classes e implemente um programa para a seguinte especificação: “O
supermercado vende diferentes tipos de produtos. Cada produto tem um preço e uma
quantidade em estoque. Um pedido de um cliente é composto de itens, onde cada
item especifica o produto que o cliente deseja e a respectiva quantidade. Esse
pedido pode ser pago em dinheiro, cheque ou cartão.”
*/

public class Pedido {

    	private int id;
    	private Itens[] itens;
    	private String formaPagamento = "Dinheiro";

    	public Pedido(int id) {
        	this.id = id;
    	}

		public void setqtdItens(int qtd){
			this.itens = new Itens[qtd];
		}

		public void setFormapagar(int n){
			if(n == 0){
				this.formaPagamento = "Dinheiro";
			}else{
				this.formaPagamento = "Cartão";
			}
		}

    	public void adicionarItem(Itens item) {
        	this.itens[item.getId()] = item;
    	}

		public void retirarItem(int r) {
			this.itens[r] = null;
		}

    	public int getId() {
        	return id;
    	}

    	public String getFormaPagamento() {
        	return formaPagamento;
    	}

    	public double getValorTotal() {
        	double valorTotal = 0;
        	for (int i = 0; i < itens.length; i++) {
				if(this.itens[i] != null){
					// valorTotal = valorTotal + itens[i].getPreco();
					valorTotal += itens[i].getPreco()*itens[i].getQuantidade();
				}
        	}
        	return valorTotal;
    	}

    	public void imprimir() {
			System.out.println(" ");
			System.out.println("--------------------------------------------");
        	System.out.println("Pedido: " + this.id);
        	System.out.println("Itens: ");
        	for (int i = 0; i < this.itens.length; i++) {
				if(this.itens[i] != null){
					if(this.itens[i].getQuantidade() > 0){
            			System.out.println("\t Número do item: " + this.itens[i].getId() + " - Nome do produto: " + this.itens[i].getNome() + " - Preço por unidade: " + this.itens[i].getPreco());
					}else{
						System.out.println("\t Pedido do produto '"+this.itens[i].getNome()+"' não realizado por falta de estoque");
						break;
					}
				}
        	}
			System.out.println(" ");
        	System.out.println("Total: " + this.getValorTotal());
			System.out.println(" ");
			System.out.println("--------------------------------------------");
	}
}