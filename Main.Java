package Ver_6;

public class Main {
	public static void main (String args[]){
		Utilizador Pessoa;
		double saldo;
		
		System.out.println("Bem Vindo ao gestor orçamental");
		System.out.println("Escolha a opção que deseja");
		System.out.println("1 - Criar novo Utilizador.");
		System.out.println("2 - Utilizar um Utilizador já existente");
		while(true){
			
			
			
			
			
			
			int escolha = Le.umInt();
			if(escolha==1){
				System.out.println("Escreva o nome que deseja dar ao utilizador?");
				String nome =Le.umaString();
				System.out.println("Escreva o valor inicial do saldo deste utilizador");
				do{
					saldo = Le.umDouble();
				}while(saldo<=0);
				Pessoa= new Utilizador(saldo,nome);
				break;
			}
			else if(escolha==2){
				System.out.println("Escolha ainda não implementada");
			}
			else{
				System.out.println("Escolha uma opção Válida");
			}
		}
		System.out.println("Insira o numero da opção que deseja");
		
		while (true){

			System.out.println(Pessoa.getNome()+" tem um saldo de "+Pessoa.getSaldo()+" euros.");
			System.out.println("1 - Fazer Compras");
			System.out.println("2 - Eliminar a última compra");
			System.out.println("3 - Ver Compras efetuadas");
			System.out.println("4 - Ver a média Semanal");
			System.out.println("5 - Sair");
			
			int escolha = Le.umInt();
			if(escolha==1){
				Pessoa.fazerCompra();
			}
			else if (escolha==2){
				Pessoa.removerCompra();
			}
			else if (escolha==3){
				Pessoa.imprimirRegisto();
			}
			else if (escolha==4){
				Pessoa.imprimirMédia();
			}
			else if (escolha==5){
				break;
			}
			else {
				System.out.println("Numero inválido");
			}
		}
		
	}
}
