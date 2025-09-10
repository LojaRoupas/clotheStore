package com.farmacia.elessandro.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TBCLIENTE")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "cdCliente")
    private Integer cdCliente;

    @Column(name = "nmCliente")
    private String nmCliente;

    @Column(name = "cpfCliente")
    private String cpfCliente;

    @Column(name = "telefoneCliente")
    private String telefoneCliente;

    @Column(name = "emailCliente")
    private String emailCliente;

}
