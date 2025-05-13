package br.com.LocadoraVeiculo.tipos;

public enum Pagamento {

    CREDITO("credito"),
    DEBITO("debito"),
    PIX("pix"),
    BOLETO("boleto"),
    DINHEIRO("dinheiro"),
    TRANSFERENCIA_BANCARIA("transferência bancária");

    private String pagamento;

    Pagamento(String valor) {
        this.pagamento = valor;
    }

    public static Pagamento fromString(String text) {
        for (Pagamento pagamento : Pagamento.values()) {
            if (pagamento.pagamento.equalsIgnoreCase(text)) {
                return pagamento;
            }
        }
        throw new IllegalArgumentException("Nenhum pagamento encontrado");
    }
}
