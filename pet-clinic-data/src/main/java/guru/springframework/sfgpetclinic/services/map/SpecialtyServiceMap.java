package guru.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Specialty;
import guru.springframework.sfgpetclinic.services.SpecialtyService;

@Service
public class SpecialtyServiceMap extends AbstractMapService<Specialty, Long> implements SpecialtyService{

	public Specialty save(Specialty object) {
		return super.save(object);
	}

	public Set<Specialty> findAll() {
		return super.findAll();
	}

	public Specialty findById(Long id) {
		return super.findById(id);
	}

	public void delete(Specialty object) {
		super.delete(object);
	}

	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
