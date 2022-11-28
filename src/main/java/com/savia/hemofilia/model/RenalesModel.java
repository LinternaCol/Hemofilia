package com.savia.hemofilia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_renales_paso")
public class RenalesModel {
    @Id
    @Column(name = "id_enfermedades_renales", nullable = false)
    private Long id_enfermedades_renales;

    public Long getId_enfermedades_renales() {
        return id_enfermedades_renales;
    }

    public void setId_enfermedades_renales(Long id_enfermedades_renales) {
        this.id_enfermedades_renales = id_enfermedades_renales;
    }
}
