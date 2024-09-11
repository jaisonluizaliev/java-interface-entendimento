package com.exemplo;

public class CartaoCredito implements Pagamento {

  @Override
  public void processarPagamento(double valor) {
    // Lógica específica para processar pagamento com cartão de crédito
    System.out.println("Processando pagamento de R$" + valor + " com cartão de crédito.");
  }

  @Override
  public boolean verificarStatus() {
    // Lógica específica para verificar o status do pagamento com cartão de crédito
    System.out.println("Verificando status do pagamento com cartão de crédito.");
    return true;
  }
}
