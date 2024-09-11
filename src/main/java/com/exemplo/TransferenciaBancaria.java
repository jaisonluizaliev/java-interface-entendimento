package com.exemplo;

public class TransferenciaBancaria implements Pagamento {

  @Override
  public void processarPagamento(double valor) {
    // Lógica específica para processar pagamento por transferência bancária
    System.out.println("Processando pagamento de R$" + valor + " por transferência bancária.");
  }

  @Override
  public boolean verificarStatus() {
    // Lógica específica para verificar o status do pagamento por transferência
    // bancária
    System.out.println("Verificando status do pagamento por transferência bancária.");
    return true;
  }
}
