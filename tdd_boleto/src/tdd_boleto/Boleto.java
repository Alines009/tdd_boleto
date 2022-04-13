package tdd_boleto;

import java.util.Date;

public class Boleto {
	
	private int codigo;
	private Date data;
	private double valorPago;
	
	public Boleto(int codigo, Date data, double valorPago){
		this.codigo = codigo;
		this.data = data; 
		this.valorPago = valorPago;
	}
	

	public int getCodigo(){
		return this.codigo;
	}

	public void setCodigo(int codigo){
		this.codigo = codigo;
	}

	public Date getDataBoleto(){
		return this.data;
	}

	public void setDataBoleto(Date data){
		this.data = data;
	}

	public double getValorPago(){
		return this.valorPago;
	}

	public void setValorPago(double valorpago){
		this.valorPago = valorpago;
	}
	
}
