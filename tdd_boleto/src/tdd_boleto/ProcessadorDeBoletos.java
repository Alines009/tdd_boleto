package tdd_boleto;

public class ProcessadorDeBoletos {
	
		public boolean realizaPagamento(Boleto boleto, Fatura fatura) {
			double valorBoleto = boleto.getValorPago();
			double valorFatura = fatura.getValorFatura();
			if(valorBoleto == valorFatura) {
				return true;
			}
			return false;
		}
}
