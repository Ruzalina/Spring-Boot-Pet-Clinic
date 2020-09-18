package sfgpetclinic.demo.services;

import sfgpetclinic.demo.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long Id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
