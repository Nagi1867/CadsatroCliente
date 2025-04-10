package com.example.CadastroCliente.service;

import com.example.CadastroCliente.entitites.Cliente;
import com.example.CadastroCliente.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    public List<Cliente> findAll() {
        return repository.findAll();
    }

    public Cliente findById(Long id) {
        Optional<Cliente> obj = repository.findById(id);
        return obj.get();
    }

    public Cliente insert(Cliente obj) {
        return repository.save(obj);
    }
}
