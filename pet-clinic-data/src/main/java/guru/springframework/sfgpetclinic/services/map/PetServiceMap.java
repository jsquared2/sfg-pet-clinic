package guru.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.PetService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

	public Pet save(Pet object) {
		return super.save(object);
	}

	public Set<Pet> findAll() {
		return super.findAll();
	}

	public Pet findById(Long id) {
		return super.findById(id);
	}

	public void delete(Pet object) {
		super.delete(object);
	}

	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
