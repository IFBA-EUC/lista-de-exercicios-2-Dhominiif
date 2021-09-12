package Quest_19;

import java.util.Scanner;
/*
Identifique as classes e implemente um programa para a seguinte especificação: “O
supermercado vende diferentes tipos de produtos. Cada produto tem um preço e uma
quantidade em estoque. Um pedido de um cliente é composto de itens, onde cada
item especifica o produto que o cliente deseja e a respectiva quantidade. Esse
pedido pode ser pago em dinheiro, cheque ou cartão.”

PROVA 3 - UNIDADE 1
Entrega até 14/09/2021 às 23:59
- Usuário que deve Adicionar itens ao pedido (Apresente a lista de produtos e
quantidade disponível)
- Editar o pedido (Apresente a lista de produtos e quantidade disponível)
- Usuário que deve remover itens do pedido
- Usuário que deve escolher a forma de pagamento do pedido após o pedido ser
finalizado (Dinheiro ou Cartão)
- Se dinheiro, o usuário deve informar o valor do pagamento e o troco deve ser apresentado
*/

public class Supermercado {

    public static void main(String[] args) {

		Scanner l = new Scanner(System.in);

        Produto arroz = new Produto(1, "Arroz", 5.00, 10);
        Produto feijao = new Produto(2, "Feijão", 8.00, 10);
        Produto macarrao = new Produto(3, "Macarrão", 4.00, 10);
		Produto cuzcuz = new Produto(4, "Cuzcuz", 10.00, 20);
		Produto biscoito = new Produto(5, "Onion", 2.50, 100);
		
		String sei = "N";
		do{
			String r; int id = 0, idProduto = 1, qtdItens, quantProd = 0, qualProd = 0; double troco;
			System.out.printf("\n\n\n\nProdutos disponíveis: ");

			arroz.getProduto();
			feijao.getProduto();
			macarrao.getProduto();
			cuzcuz.getProduto();
			biscoito.getProduto();

			System.out.println("\n\n--------------------------------------------\n\n");

			System.out.printf("Deseja comprar algo (S/N): ");
			r = l.nextLine().toUpperCase();
		
			if(r.equals("N")){

				System.out.printf("\n\n Tudo bem, volte quando precisar :)!!\n\n");

			}else{

				String retirar = "N";

				Pedido pedido = new Pedido(idProduto++);

				System.out.printf("Quantos itens terá o seu pedido: ");
				qtdItens = l.nextInt();

				pedido.setqtdItens(qtdItens);
				
				while(qtdItens != 0){

					System.out.printf("Qual o produto (digite o número para pedido): ");
					qualProd = l.nextInt();

					switch (qualProd) {
						case 1:
							System.out.printf("Qual a quantidade do produto: ");
							quantProd = l.nextInt();
							l.nextLine();
							Itens i1 = new Itens(id++, arroz, quantProd);
			
							pedido.adicionarItem(i1);
						break;
						
						case 2: 
							System.out.printf("Qual a quantidade do produto: ");
							quantProd = l.nextInt();
							l.nextLine();
							Itens i2 = new Itens(id++, feijao, quantProd);
			
							pedido.adicionarItem(i2);
						break;
						
						case 3: 
							System.out.printf("Qual a quantidade do produto: ");
							quantProd = l.nextInt();
							l.nextLine();
							Itens i3 = new Itens(id++, macarrao, quantProd);
		
							pedido.adicionarItem(i3);
						break;

						case 4: 
							System.out.printf("Qual a quantidade do produto: ");
							quantProd = l.nextInt();
							l.nextLine();
							Itens i4 = new Itens(id++, cuzcuz, quantProd);
		
							pedido.adicionarItem(i4);
						break;

						case 5: 
							System.out.printf("Qual a quantidade do produto: ");
							quantProd = l.nextInt();
							l.nextLine();
							Itens i5 = new Itens(id++, biscoito, quantProd);
		
							pedido.adicionarItem(i5);
						break;
					}

					qtdItens -= 1;
				}

				pedido.imprimir();

				System.out.printf("\n\nDeseja retirar itens (S/N): ");
				retirar = l.nextLine().toUpperCase();

				switch (retirar) {
					case "N":
						System.out.printf("\nQual a forma de pagamento (Dinheiro = 0 || Cartão = 1): ");
						pedido.setFormapagar(l.nextInt());

						if(pedido.getFormaPagamento().equals("Dinheiro")){
							System.out.println(" ");
							System.out.printf("Qual a quantia para o pagamento: ");
							troco = l.nextDouble();
							System.out.println("\n\n--------------------------------------------\n\n");

							if(troco > pedido.getValorTotal()){

								System.out.println("\nSeu troco = "+(troco-pedido.getValorTotal())+"\n");
								System.out.println("Volte sempre ;) \n\n");
								
							}else if(troco == pedido.getValorTotal()){

								System.out.println("Sem troco\n");
								System.out.println("Volte sempre ;) \n\n");

							}else{
								do{
									System.out.printf("\nQuantia é menor que o valor total!\n\n");
									System.out.println("\nO valor total é de: "+pedido.getValorTotal());
									System.out.println("\n\nPor favor, pague o valor correto!\n\n");
									System.out.printf("\nQual a quantia para o pagamento: ");
									troco = l.nextDouble();

								}while(troco < pedido.getValorTotal());

								if(troco > pedido.getValorTotal()){

									System.out.println("\nSeu troco = "+(troco-pedido.getValorTotal())+"\n");
									System.out.println("Volte sempre ;) \n\n");
									
								}else if(troco == pedido.getValorTotal()){
				
									System.out.println("\n\nSem troco\n");
									System.out.println("Volte sempre ;) \n\n");
				
								}
							}

							System.out.println("----------------Fim do pedido---------------\n\n");

						}else{
							System.out.println("\n\nPagamento realizado!\n");
							System.out.println("Volte sempre ;) \n\n");
							System.out.println("----------------Fim do pedido---------------\n\n");
						}
						break;
				
					default:
						do{
							System.out.printf("\n\nQual quer retirar (digite o número do produto): ");
							pedido.retirarItem(l.nextInt());
							pedido.imprimir();

							l.nextLine();
							System.out.printf("\n\nDeseja retirar itens (S/N): ");
							retirar = l.nextLine().toUpperCase();
							l.nextLine();

						}while(retirar.equals("S"));

						System.out.printf("Qual a forma de pagamento (Dinheiro = 0 || Cartão = 1): ");
						pedido.setFormapagar(l.nextInt());

						switch (pedido.getFormaPagamento()){

							case "Dinheiro":

								System.out.println(" ");
								System.out.printf("Qual a quantia para o pagamento: ");
								troco = l.nextDouble();
								System.out.println("\n\n--------------------------------------------\n\n");

								if(troco > pedido.getValorTotal()){

									System.out.println("\nSeu troco = "+(troco-pedido.getValorTotal())+"\n");
									System.out.println("Volte sempre ;) \n\n");
									
								}else if(troco == pedido.getValorTotal()){

									System.out.println("Sem troco\n");
									System.out.println("Volte sempre ;) \n\n");

								}else{
									do{
										System.out.printf("\nQuantia é menor que o valor total!\n\n");
										System.out.println("\nO valor total é de: "+pedido.getValorTotal());
										System.out.println("\n\nPor favor, pague o valor correto!\n\n");
										System.out.printf("\nQual a quantia para o pagamento: ");
										troco = l.nextDouble();

									}while(troco < pedido.getValorTotal());

									if(troco > pedido.getValorTotal()){

										System.out.println("\nSeu troco = "+(troco-pedido.getValorTotal())+"\n");
										System.out.println("Volte sempre ;) \n\n");
										
									}else if(troco == pedido.getValorTotal()){
					
										System.out.println("\n\nSem troco\n");
										System.out.println("Volte sempre ;) \n\n");
					
									}
								}

								System.out.println("----------------Fim do pedido---------------\n\n");
							break;

							default:
								System.out.println("\n\nPagamento realizado!\n");
								System.out.println("Volte sempre ;) \n\n");
								System.out.println("----------------Fim do pedido---------------\n\n");
							break;
						}

					break;
				}
			}
			
			l.nextLine();
			System.out.printf("Deseja fazer outro pedido (S/N): ");
			sei = l.nextLine().toUpperCase();

		}while(sei.equals("S"));
		l.close();
    }
}