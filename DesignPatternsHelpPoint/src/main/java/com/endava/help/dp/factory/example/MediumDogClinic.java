package com.endava.help.dp.factory.example;

import com.endava.help.dp.DogBreedSizes;
import com.endava.help.dp.builder.example.Dog;
import com.endava.help.dp.template.example.MediumDogsVeterinarian;

public class MediumDogClinic extends DogClinic {
	public MediumDogClinic(Dog dog) {
		super(dog);
	}

	static {
		DogClinicFactory.getInstance().registerProduct(DogBreedSizes.MEDIUM, MediumDogClinic.class);
	}

	@Override
	void getCorrectDoctorForDog() {
		veterinarian = new MediumDogsVeterinarian(theDog);
	}

}
