package jsfempresas2024.erp.model;

public enum EstadoBrasil {
    AC("Acre"),
    AL("Alagoas"),
    AM("Amazonas"),
    AP("Amapá"),
    BA("Bahia"),
    CE("Ceará"),
    DF("Distrito Federal"),
    ES("Espírito Santo"),
    GO("Goiás"),
    MA("Maranhão"),
    MT("Mato Grosso"),
    MS("Mato Grosso do Sul"),
    MG("Minas Gerais"),
    PA("Pará"),
    PB("Paraíba"),
    PR("Paraná"),
    PE("Pernambuco"),
    PI("Piauí"),
    RJ("Rio de Janeiro"),
    RN("Rio Grande do Norte"),
    RS("Rio Grande do Sul"),
    RO("Rondônia"),
    RR("Roraima"),
    SC("Santa Catarina"),
    SP("São Paulo"),
    SE("Sergipe"),
    TO("Tocantins");

    private final String nome;

    EstadoBrasil(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return nome;
    }

    @Override
    public String toString() {
        return name() + " (" + nome + ")";
    }

    public static EstadoBrasil fromSigla(String sigla) {
        for (EstadoBrasil estado : EstadoBrasil.values()) {
            if (estado.name().equalsIgnoreCase(sigla)) {
                return estado;
            }
        }
        throw new IllegalArgumentException("Sigla inválida: " + sigla);
    }
}
