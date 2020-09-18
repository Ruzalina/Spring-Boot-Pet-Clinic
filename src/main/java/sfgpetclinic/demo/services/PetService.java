package sfgpetclinic.demo.services;

import sfgpetclinic.demo.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long Id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
