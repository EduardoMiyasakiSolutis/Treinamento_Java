package br.com.GerenciadorTarefas.entity;

public enum Status {

    PENDENTE("pendente"),
    EM_ANDAMENTO("em andamento"),
    CONCLUIDA("concluida");

    private String status;

     Status(String valor) {
        this.status = valor;
    }

    public static Status fromString(String text) {
        for (Status status : Status.values()) {
            if (status.status.equalsIgnoreCase(text)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada");
    }
}

