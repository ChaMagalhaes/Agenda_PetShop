package com.github.chamagalhaes.petshop.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "PET")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 3, max = 50, message= "Nome deve conter pelo menos 3 caracteres")
    @NotBlank(message = "Nome é um campo obrigatório")
    @Column(name = "name", nullable = false)
    private String name;

    @Size(min = 3, max = 50, message = "Raça deve conter pelo menos 3 caracteres")
    @NotBlank(message = "Raça é um campo obrigatório")
    @Column(name = "raca")
    private String raca;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
