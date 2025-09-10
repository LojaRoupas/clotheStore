package com.farmacia.elessandro.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Entity
    @Table(name = "TBCARGO")
    @NoArgsConstructor
    @AllArgsConstructor
    @Data

public class CargoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "cdCargo")
    private Integer cdCargo;

    @Column(name = "nmCargo")
    private String nmCargo;

}

