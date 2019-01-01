package guru.springframework.sfgpetclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;

	@Autowired
	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("JJ1_FirstName");
		owner1.setLastName("JJ1_LastName");
		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("JJ2_FirstName");
		owner2.setLastName("JJ2_LastName");
		ownerService.save(owner2);

		System.out.println("Loaded owners...");

		Vet vet1 = new Vet();
		vet1.setId(1L);
		vet1.setFirstName("Vet1_FirstName");
		vet1.setLastName("Vet1_LastName");
		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setId(3L);
		vet2.setFirstName("Vet2_FirstName");
		vet2.setLastName("Vet2_LastName");
		vetService.save(vet2);

		System.out.println("Loaded vets...");
	}

}
