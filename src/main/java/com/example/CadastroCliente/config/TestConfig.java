package com.example.CadastroCliente.config;

import com.example.CadastroCliente.entitites.Cliente;
import com.example.CadastroCliente.entitites.enums.Status;
import com.example.CadastroCliente.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private ClienteRepository repository;

    @Override
    public void run(String... args) throws Exception {
        Cliente cliente = new Cliente(null, "Giuseppi", "40028922232", "inicial", Status.ATIVO);

        repository.save(cliente);
    }
}
