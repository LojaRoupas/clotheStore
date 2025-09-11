package com.trier.clothestore.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TBUSUARIO")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "idUsuario")
    private Integer idUsuario;

//    @Column(name = "nomeUsuario")
//    private String nomeUsuario;

    @Column(name = "emailUsuario")
    private String emailUsuario;

    @Column(name = "senhaUsuario")
    private String senhaUsuario;

    //papel usuario
}
