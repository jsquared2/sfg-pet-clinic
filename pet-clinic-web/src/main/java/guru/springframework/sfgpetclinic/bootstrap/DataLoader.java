package guru.springframework.sfgpetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import guru.springframework.sfgpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;

	@Autowired
	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}

	@Override
	public void run(String... args) throws Exception {

		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogType = petTypeService.save(dog);

		PetType cat = new PetType();
		cat.setName("Cat");
		PetType savedCatType = petTypeService.save(cat);

		Owner owner1 = new Owner();
		owner1.setFirstName("JJ1_FirstName");
		owner1.setLastName("JJ1_LastName");
		owner1.setAddress("100 Consilium Pl.");
		owner1.setCity("Scarborough");
		owner1.setTelephone("416-123-4567");

		Pet pet1 = new Pet();
		pet1.setName("Pet1");
		pet1.setPetType(savedDogType);
		pet1.setOwner(owner1);
		pet1.setBirthDate(LocalDate.now());
		pet1.setOwner(owner1);
		owner1.getPets().add(pet1);

		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("JJ2_FirstName");
		owner2.setLastName("JJ2_LastName");
		owner2.setAddress("222 Bay St.");
		owner2.setCity("Toronto");
		owner2.setTelephone("647-321-7654");

		Pet pet2 = new Pet();
		pet2.setName("Pet2");
		pet2.setPetType(savedCatType);
		pet2.setOwner(owner2);
		pet2.setBirthDate(LocalDate.now());
		pet2.setOwner(owner2);
		owner2.getPets().add(pet2);

		ownerService.save(owner2);

		System.out.println("Loaded owners...");

		Vet vet1 = new Vet();
		vet1.setFirstName("Vet1_FirstName");
		vet1.setLastName("Vet1_LastName");
		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("Vet2_FirstName");
		vet2.setLastName("Vet2_LastName");
		vetService.save(vet2);

		System.out.println("Loaded vets...");
	}

}
