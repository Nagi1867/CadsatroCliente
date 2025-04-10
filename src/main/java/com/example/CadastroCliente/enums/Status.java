package com.example.CadastroCliente.enums;

public enum Status {
    INATIVO(0),
    ATIVO(1);

    private Integer code;

    Status(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public static Status valueOf(Integer code) {
        for (Status value : Status.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid Status code");
    }
}
