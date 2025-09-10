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

    @Column(name = "cdUsuario")
    private Integer cdUsuario;

    @Column(name = "nmUsuario")
    private String nmUsuario;

    @Column(name = "cpfUsuario")
    private String cpfUsuario;

    @Column(name = "telefoneUsuario")
    private String telefoneUsuario;

    @Column(name = "Usuario")
    private String emailUsuario;

}
