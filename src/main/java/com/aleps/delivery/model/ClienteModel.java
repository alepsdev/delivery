package com.aleps.delivery.model;


import lombok.Data;

@Data
public class ClienteModel {

    private Long id;
    private String nome;
    private String email;
    private String telefone;
}
