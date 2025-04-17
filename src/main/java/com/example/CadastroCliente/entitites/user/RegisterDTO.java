package com.example.CadastroCliente.entitites.user;

import com.example.CadastroCliente.entitites.enums.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
