package sfgpetclinic.demo.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sfgpetclinic.demo.model.Owner;
import sfgpetclinic.demo.model.Vet;
import sfgpetclinic.demo.services.OwnerService;
import sfgpetclinic.demo.services.VetService;
import sfgpetclinic.demo.services.map.OwnerServiceMap;
import sfgpetclinic.demo.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }


        @Override
        public void run (String...args) throws Exception {
            Owner owner1=new Owner();
            owner1.setId(1L);
            owner1.setFirsName("Michael");
            owner1.setLastName("Weston");

            ownerService.save(owner1);

            Owner owner2=new Owner();
            owner2.setId(2L);
            owner2.setFirsName("Fiona");
            owner2.setLastName("Glenanne");

            ownerService.save(owner2);

            System.out.println("Loaded Owners...");

            Vet vet1=new Vet();
            vet1.setId(1L);
            vet1.setFirsName("Sam");
            vet1.setLastName("Axe");

            vetService.save(vet1);

            Vet vet2=new Vet();
            vet2.setId(2L);
            vet2.setFirsName("Jessie");
            vet2.setLastName("Porter");

            vetService.save(vet2);

            System.out.println("Loaded Vets...");

        }
    }

