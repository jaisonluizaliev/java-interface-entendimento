package com.exemplo;


public class ProcessadorDePagamentos {

    public void processar(Pagamento pagamento, double valor) {
        pagamento.processarPagamento(valor);
        boolean status = pagamento.verificarStatus();
        if (status) {
            System.out.println("Pagamento realizado com sucesso.");
        } else {
            System.out.println("Falha no pagamento.");
        }
    }

    public static void main(String[] args) {
        ProcessadorDePagamentos processador = new ProcessadorDePagamentos();

        Pagamento pagamentoCartao = new CartaoCredito();
        Pagamento pagamentoTransferencia = new TransferenciaBancaria();
        Pagamento pagamentoPayPal = new PayPal();

        processador.processar(pagamentoCartao, 100.00);
        processador.processar(pagamentoTransferencia, 200.00);
        processador.processar(pagamentoPayPal, 300.00);
    }
}
