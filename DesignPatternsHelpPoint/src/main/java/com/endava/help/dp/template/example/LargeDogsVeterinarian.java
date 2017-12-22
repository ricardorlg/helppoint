package com.endava.help.dp.template.example;

import com.endava.help.dp.builder.example.Dog;

public class LargeDogsVeterinarian extends GeneralDogVeterinarian {

	public LargeDogsVeterinarian(Dog dog) {
		super(dog);
	}

	@Override
	public void analyzeSicksByBreedSize() {
		System.out.println("Checking any sick related to large breed size");
	}

}
