package tdd_boleto;

import java.util.ArrayList;

public class ProcessadorDeBoletos {
	
		public boolean realizaPagamento(ArrayList<Boleto> boletosFatura, Fatura fatura) {
			double valorPago = 0.0;
			for(int i = 0; i < boletosFatura.size(); i++) {
				valorPago += boletosFatura.get(i).getValorPago();
			}
			
			double valorFatura = fatura.getValorFatura();
			if(valorPago == valorFatura) {
				return true;
			}
			return false;
		}
}
