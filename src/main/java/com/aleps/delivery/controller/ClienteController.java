package com.aleps.delivery.controller;


import com.aleps.delivery.model.ClienteModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<ClienteModel> listar() {
        var cliente1 = new ClienteModel();
        var cliente2 = new ClienteModel();

        cliente1.setId(1L);
        cliente1.setEmail("teste@teste.com");
        cliente1.setNome("Joao");
        cliente1.setTelefone("(51) 1 2345-6789");

        cliente2.setId(1L);
        cliente2.setEmail("teste1@teste.com");
        cliente2.setNome("Joao2");
        cliente2.setTelefone("(48) 1 2345-6789");


        return Arrays.asList(cliente1, cliente2);
    }
}
