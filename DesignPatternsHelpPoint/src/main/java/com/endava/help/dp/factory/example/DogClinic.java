package com.endava.help.dp.factory.example;

import com.endava.help.dp.builder.example.Dog;
import com.endava.help.dp.template.example.GeneralDogVeterinarian;

public abstract class DogClinic {

	protected Dog theDog;
	protected GeneralDogVeterinarian veterinarian;

	public DogClinic(Dog dog) {
		this.theDog = dog;
		receiveDog();
	}

	public void receiveDog() {
		System.out.println(theDog.getName() + " is going to be checked by our doctor");
		getCorrectDoctorForDog();
		veterinarian.analyzeDog();
	}

	abstract void getCorrectDoctorForDog();

	public String getStatusOfDog() {
		return veterinarian.getResults();
	}
}
