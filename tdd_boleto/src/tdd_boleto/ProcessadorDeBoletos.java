package tdd_boleto;

import java.util.ArrayList;

public class ProcessadorDeBoletos {
	
		public boolean realizaPagamento(ArrayList<Boleto> boletosFatura, Fatura fatura) {
			for(int i = 0; i < boletosFatura.size(); i++) {
				double valorBoleto = boletosFatura.get(i).getValorPago();
				fatura.setValorFatura(fatura.getValorFatura() - valorBoleto);
			}
			
			fatura.verificaDivida();
			
			if(fatura.pagamentoEfetuado == true) {
				System.out.println("A fatura está paga");
				return true;
			}
			System.out.println("A fatura não está paga");
			return false;
		}
}
