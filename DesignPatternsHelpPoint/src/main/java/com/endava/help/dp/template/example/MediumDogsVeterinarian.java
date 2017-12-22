package com.endava.help.dp.template.example;

import com.endava.help.dp.builder.example.Dog;

public class MediumDogsVeterinarian extends GeneralDogVeterinarian {

	public MediumDogsVeterinarian(Dog dog) {
		super(dog);
	}

	@Override
	public void analyzeSicksByBreedSize() {
		System.out.println("Checking any sick related to Medium breed size");
	}

}
