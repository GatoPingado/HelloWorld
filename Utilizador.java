package Ver_6;

import java.util.ArrayList;

public class Utilizador {

	private double Saldo;
	private String Nome;
	private ArrayList<Compra> Registo;
	
	public Utilizador() {
		System.out.println("Acabou de criar um Utilizador ");
	}
	
	public Utilizador(double saldo, String nome) {
		Saldo = saldo;
		Nome = nome;
		Registo = new ArrayList<Compra>();
	}

	public double getSaldo() {
		return Saldo;
	}
	
	public void fazerCompra(){
		double Despesa = 0;
		do{
			System.out.println("Valor da Compra ?");
			Despesa=Le.umDouble();
			if(Despesa<=0){
				System.out.println("Valor Inválido");
			}
		}while(Despesa<=0);
		if(Despesa>Saldo){
			System.out.println("Saldo insuficiente para realizar a compra");
		}
		else{
		Compra compra = new Compra(Despesa);
		Registo.add(compra);
		Saldo-=Despesa;
		}
	}
	
	public void removerCompra(){
		
		if(Registo.size()>0){
			Compra compra=Registo.get(Registo.size()-1);
			Saldo+=compra.getValor();
			System.out.println("Acabou de cancelar a compra nº"+Registo.size());
			System.out.println("Foram lhe devolvidos "+compra.getValor()+" euros");
			Registo.remove(Registo.size()-1);
			
			}
		else{
			System.out.println("Não efectuou nenhuma compra pelo que é impossivel concluir esta tarefa");
		}
	}
	
	public void imprimirRegisto(){
		Compra compra = null;
		for (int i = 0; i < Registo.size(); i++) {
			compra =Registo.get(i);
			System.out.println("Compra nº"+i);
			compra.printCompra();
			
		}
	}
	
	public void imprimirMédia(){
		if(Registo.size()>0){
			Compra compra = null;
			int cont =0;
			double valortotal = 0;
			double média = 0;
			for (int i = 0; i < Registo.size(); i++) {
				compra=Registo.get(i);
				valortotal+=compra.getValor();
				cont++;
			}
		
		média=valortotal/cont;
		System.out.println("A média das suas compras é de: "+média);
		}
		else{
			System.out.println("Faça compras antes de calcular a média");
		}
	}
	
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

}
