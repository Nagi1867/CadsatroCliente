package com.example.CadastroCliente.resource;

import com.example.CadastroCliente.entitites.Cliente;
import com.example.CadastroCliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {
    @Autowired
    private ClienteService service;

    @GetMapping
    public ResponseEntity<List<Cliente>> findAll() {
        List<Cliente> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Cliente> findById(@PathVariable Long id) {
        Cliente obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
