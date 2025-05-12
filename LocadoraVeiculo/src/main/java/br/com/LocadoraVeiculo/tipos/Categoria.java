package br.com.LocadoraVeiculo.tipos;



public enum Categoria {

    HATCH_COMPLETO("hatch completo"),

    HATCH_MEDIO("hatch medio"),

    SEDAN_COMPACTO("sedan compacto"),

    SEDAN_MEDIO("sedan medio"),

    SEDAN_GRANDE("sedan grande"),

    MINIVAN("minivan"),

    ESPORTIVO("esportivo"),

    UTILITARIO_COMERCIAL("utilitario comercial");

    private String categoria;

    Categoria(String valor) {
        this.categoria = valor;
    }

    public static Categoria fromString(String valor) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoria.equalsIgnoreCase(valor)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhum categoria encontrado");
    }
}