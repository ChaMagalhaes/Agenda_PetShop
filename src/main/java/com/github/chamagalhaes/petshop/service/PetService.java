package com.github.chamagalhaes.petshop.service;


import com.github.chamagalhaes.petshop.model.Pet;

import java.util.List;

public interface PetService {
    List<Pet> getAllPets();
    void savePet(Pet pet);
    Pet getPetById(Long id);
    void deletePetById(Long id);
}
