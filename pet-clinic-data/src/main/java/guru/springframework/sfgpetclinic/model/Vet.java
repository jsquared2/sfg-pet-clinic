package guru.springframework.sfgpetclinic.model;

import java.util.Set;

public class Vet extends Person {

	private static final long serialVersionUID = 2949144664188938902L;

	private Set<Specialty> specialties;

	public Set<Specialty> getSpecialties() {
		return specialties;
	}

	public void setSpecialties(Set<Specialty> specialties) {
		this.specialties = specialties;
	}

}
