package tdd_boleto;

import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProcessadorTest {
	
	private ArrayList <Boleto> listaBoletos = new ArrayList();
	
	@BeforeEach
	public void inicializa() {
		listaBoletos.clear();
	}
	
	@DisplayName("Testar pagamento da fatura com apenas 1 boleto")
	@Test
	public void testPagamentoFaturaComUmBoleto() {
		Boleto boleto = new Boleto(123456, new Date(), 500.00);
		listaBoletos.add(boleto);
		
		Fatura fatura = new Fatura(new Date(), 500.00, "Maria de Fátima Amaral");
		ProcessadorDeBoletos processador = new ProcessadorDeBoletos();
		Assertions.assertEquals(true, processador.realizaPagamento(listaBoletos,fatura));
	}
	
	@DisplayName("Testar pagamento de fatura com mais de 1 boleto")
	@Test
	public void testPagamentoFaturaComMaisDeUmBoleto() {
		Boleto boleto1 = new Boleto(5555, new Date(), 500.00);
		Boleto boleto2 = new Boleto(81942, new Date(), 400.00);
		Boleto boleto3 = new Boleto(15684, new Date(), 600.00);
		
		listaBoletos.add(boleto1);
		listaBoletos.add(boleto2);
		listaBoletos.add(boleto3);
		
		Fatura fatura = new Fatura(new Date(), 1500.00, "José Ricardo dos Santos");
		ProcessadorDeBoletos processador = new ProcessadorDeBoletos();
		Assertions.assertEquals(true, processador.realizaPagamento(listaBoletos,fatura));
	}
	
	@DisplayName("Testar pagamento com valor acima do valor da fatura")
	@Test
	public void testPagamentoFaturaComValorSuperior() {
		Boleto boleto1 = new Boleto(5555, new Date(), 1000.00);
		Boleto boleto2 = new Boleto(81942, new Date(), 500.00);
		Boleto boleto3 = new Boleto(15684, new Date(), 250.00);
		
		listaBoletos.add(boleto1);
		listaBoletos.add(boleto2);
		listaBoletos.add(boleto3);
		
		Fatura fatura = new Fatura(new Date(), 1500.00, "Teresa Cristina Aguiar");
		ProcessadorDeBoletos processador = new ProcessadorDeBoletos();
		Assertions.assertEquals(true, processador.realizaPagamento(listaBoletos,fatura));
	}
	
	@DisplayName("Testar pagamento insuficiente da fatura")
	@Test
	public void testPagamentoDuasFaturas() {
		Fatura fatura1 = new Fatura(new Date(), 1000.00, "Aline Silva de Lima");
	
		Boleto boleto1 = new Boleto(5555, new Date(), 200.00);
		Boleto boleto2 = new Boleto(81942, new Date(), 300.00);
		
		listaBoletos.add(boleto1);
		listaBoletos.add(boleto2);

		ProcessadorDeBoletos processador = new ProcessadorDeBoletos();
		Assertions.assertEquals(false, processador.realizaPagamento(listaBoletos,fatura1));
	}
}
