package com.endava.help.dp.factory.example;

import com.endava.help.dp.DogBreedSizes;
import com.endava.help.dp.builder.example.Dog;
import com.endava.help.dp.template.example.LargeDogsVeterinarian;

public class LargeDogClinic extends DogClinic {
	public LargeDogClinic(Dog dog) {
		super(dog);
	}

	static {
		DogClinicFactory.getInstance().registerProduct(DogBreedSizes.LARGE, LargeDogClinic.class);
	}

	@Override
	void getCorrectDoctorForDog() {
		veterinarian = new LargeDogsVeterinarian(theDog);
	}
}
