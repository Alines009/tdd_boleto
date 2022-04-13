package tdd_boleto;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProcessadorTest {

	@DisplayName("Testar pagamento da fatura com apenas 1 boleto")
	@Test
	public void testPagamentoFaturaComUmBoleto() {
		Boleto boleto = new Boleto(123456, new Date(), 500.00);
		Fatura fatura = new Fatura(new Date(), 500.00, "Maria de Fátima Amaral");
		ProcessadorDeBoletos processador = new ProcessadorDeBoletos();
		Assertions.assertEquals(true, processador.realizaPagamento(boleto,fatura));
	}
}
