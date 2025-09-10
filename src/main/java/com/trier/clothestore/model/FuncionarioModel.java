package com.farmacia.elessandro.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "TBFUNCIONARIO")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class FuncionarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "cdFuncionario")
    private Integer cdFuncionario;

    @Column(name = "nmFuncionario")
    private String nmFuncionario;

    @Column(name = "cpfFuncionario")
    private String cpfFuncionario;

    @Column(name = "telefoneFuncionario")
    private String telefoneFuncionario;

    @Column(name = "emailFuncionario")
    private String emailFuncionario;

    @Column(name = "salarioFuncionario")
    private Double salarioFuncionario;

    @Column(name = "cargoFuncionario")
    private String cargoFuncionario;

    @Column(name = "cdCargoFuncionario")
    private Integer cdCargoFuncionario;


}
