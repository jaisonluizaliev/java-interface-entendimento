package com.exemplo;

public interface Pagamento {

  void processarPagamento(double valor);

  boolean verificarStatus();
  
}
