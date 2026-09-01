package com.github.chamagalhaes.petshop.repository;

import com.github.chamagalhaes.petshop.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {

}
