package tdd_boleto;

import java.util.Date;

public class Fatura {
	
	private String nomeCliente;
	private Date dataFatura;
	private double valorFatura;
	public boolean pagamentoEfetuado;


	public Fatura(Date dataFatura, double valorFatura, String nomeCliente){
		this.dataFatura = dataFatura;
		this.nomeCliente = nomeCliente;
		this.valorFatura = valorFatura;
	}

	public Date getDataFatura(){
		return this.dataFatura;
	}

	public void setDataFatura(Date dataFatura){
		this.dataFatura = dataFatura;
	}

	public String getNomeCliente(){
		return this.nomeCliente;
	}

	public void setNomeCliente(String nomeCliente){
		this.nomeCliente= nomeCliente;
	}

	public double getValorFatura(){
		return this.valorFatura;
	}

	public void setValorFatura(double valorFatura){
		this.valorFatura = valorFatura;
	}
	
	public boolean getPagamentoEfetuado() {
		return pagamentoEfetuado;
	}

	public void setPagamentoEfetuado(boolean pagamentoEfetuado) {
		this.pagamentoEfetuado = pagamentoEfetuado;
	}
	
	public void verificaDivida() {
		if(getValorFatura() <= 0)
			this.setPagamentoEfetuado(true);
	}


}
