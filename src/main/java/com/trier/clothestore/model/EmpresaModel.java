package com.farmacia.elessandro.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "TBEMPRESA")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class EmpresaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "cdEmpresa")
    private Integer cdEmpresa;

    @Column(name = "nmEmpresa")
    private String nmEmpresa;

    @Column(name = "cnpjEmpresa")
    private String cnpjEmpresa;

    @Column(name = "telefoneEmpresa")
    private String telefoneEmpresa;

    @Column(name = "enderecoEmpresa")
    private String enderecoEmpresa;

    @Column(name = "emailCliente")
    private String emailEmpresa;

}
