package com.ysalama.sfgpetclinic.bootstrap;

import com.ysalama.sfgpetclinic.model.Owner;
import com.ysalama.sfgpetclinic.model.Vet;
import com.ysalama.sfgpetclinic.services.OwnerService;
import com.ysalama.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Scott");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Super");
        owner2.setLastName("Scott");

        ownerService.save(owner2);

        System.out.println("Loaded Owners");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Sam Sam");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("cqweqw");
        vet2.setLastName("cqwewqe Sam");

        vetService.save(vet2);
        System.out.println("Loaded Vets");

    }
}
