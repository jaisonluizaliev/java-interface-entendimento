package com.exemplo;

public class PayPal implements Pagamento {

  @Override
  public void processarPagamento(double valor) {
    // Lógica específica para processar pagamento com PayPal
    System.out.println("Processando pagamento de R$" + valor + " com PayPal.");
  }

  @Override
  public boolean verificarStatus() {
    // Lógica específica para verificar o status do pagamento com PayPal
    System.out.println("Verificando status do pagamento com PayPal.");
    return true;
  }
}
