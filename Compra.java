package Ver_6;

import java.text.DateFormat;
import java.util.Date;

public class Compra {

	private double Valor;
	private Date Data;
	
	public Compra(double valor) {
		Valor = valor;
		Data = new Date();
	}
	public void printCompra(){
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		String data =df.format(Data);
		System.out.println("Valor: "+Valor+" euros" );
		System.out.println("Data: "+data);
	
	}
	
	public double getValor() {
		return Valor;
	}
	public void setValor(double valor) {
		Valor = valor;
	}
	public Date getData() {
		return Data;
	}
	public void setData(Date data) {
		Data = data;
	}
}
