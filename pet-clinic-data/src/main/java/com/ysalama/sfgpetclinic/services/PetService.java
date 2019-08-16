package com.ysalama.sfgpetclinic.services;

import com.ysalama.sfgpetclinic.model.Pet;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
