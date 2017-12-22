package com.endava.help.dp;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;

import com.endava.help.dp.builder.example.Dog;
import com.endava.help.dp.factory.example.DogClinic;
import com.endava.help.dp.factory.example.DogClinicFactory;

public class VetClinicSimulation {
	private final static LocalDate THE_FOURTH_OF_JULY = LocalDate.of(2016, 07, 04);
	private final static LocalDate THE_ONE_OF_JUNE = LocalDate.of(2012, 06, 01);
	private final static LocalDate THE_TWO_OF_FEBRUARY = LocalDate.of(2010, 02, 02);
	private Thread lucasThread;
	private Thread mateoThread;
	private Thread sashaThread;

	public void simulate() {
		setupEnviroment();
		lucasThread.start();
		mateoThread.start();
		sashaThread.start();
	}

	private void setupEnviroment() {

		lucasThread = new Thread(() -> {
			Dog lucas = Dog.called("lucas").ofSize(DogBreedSizes.LARGE).ofBreed("Labrador").ofColour("coffee")
					.bornOn(THE_FOURTH_OF_JULY);
			try {
				DogClinic clinicForLucas = DogClinicFactory.getInstance().getDogClinicForDog(lucas);
				Thread.sleep(2000);
				System.out.println(clinicForLucas.getStatusOfDog());
			} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException
					| IllegalArgumentException | InvocationTargetException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});
		mateoThread = new Thread(() -> {
			Dog mateo = Dog.called("mateo").ofSize(DogBreedSizes.SMALL).ofBreed("poodle").ofColour("white")
					.bornOn(THE_ONE_OF_JUNE);
			try {
				DogClinic clinicForMateo = DogClinicFactory.getInstance().getDogClinicForDog(mateo);
				Thread.sleep(3000);
				System.out.println(clinicForMateo.getStatusOfDog());
			} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException
					| IllegalArgumentException | InvocationTargetException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});
		sashaThread = new Thread(() -> {
			Dog sasha = Dog.called("sasha").ofSize(DogBreedSizes.MEDIUM).ofBreed("Schnauzer").ofColour("gray")
					.bornOn(THE_TWO_OF_FEBRUARY);
			try {
				DogClinic clinicForSasha = DogClinicFactory.getInstance().getDogClinicForDog(sasha);
				Thread.sleep(1500);
				System.out.println(clinicForSasha.getStatusOfDog());
			} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException
					| IllegalArgumentException | InvocationTargetException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});

	}

}
