package com.example.CadastroCliente.repositories;

import com.example.CadastroCliente.entitites.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
