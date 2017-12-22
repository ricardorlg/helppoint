package com.endava.help.dp.factory.example;

import com.endava.help.dp.DogBreedSizes;
import com.endava.help.dp.builder.example.Dog;
import com.endava.help.dp.template.example.SmallDogsVeterinarian;

public class SmallDogClinic extends DogClinic {
	public SmallDogClinic(Dog dog) {
		super(dog);
	}

	static {
		DogClinicFactory.getInstance().registerProduct(DogBreedSizes.SMALL, SmallDogClinic.class);
	}

	@Override
	void getCorrectDoctorForDog() {
		veterinarian = new SmallDogsVeterinarian(theDog);
	}

}
