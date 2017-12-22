package com.endava.help.dp.template.example;

import java.util.Random;

import com.endava.help.dp.builder.example.Dog;

public abstract class GeneralDogVeterinarian {
	private Dog dog;
	private String[] status = new String[] { "healthy", "sick", "Pending" };

	public GeneralDogVeterinarian(Dog dog) {
		this.dog = dog;
	}

	public abstract void analyzeSicksByBreedSize();

	public void analyzeDog() {
		System.out.println("Checking general things");
		System.out.println("Checking health");
		analyzeSicksByBreedSize();
		System.out.println("We will call you when I finish to review " + dog.getName() + ", bye :D");
	}

	public String getResults() {
		return dog.getName() + " is " + status[(new Random()).nextInt(status.length)];
	}

}
