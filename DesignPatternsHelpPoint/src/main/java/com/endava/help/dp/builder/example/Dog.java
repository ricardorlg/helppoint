package com.endava.help.dp.builder.example;

import java.time.LocalDate;

import com.endava.help.dp.DogBreedSizes;

public class Dog {
	private final LocalDate dateOfBirth;
	private final String name;
	private final String breed;
	private final DogBreedSizes breedSize;
	private final String colour;
	private final String favouriteFood;
	private final String favouriteToy;

	public Dog(String name, String breed, DogBreedSizes breedSize, String colour, String favouriteFood,
			String favouriteToy, LocalDate dateOfBirth) {
		this.name = name;
		this.breed = breed;
		this.breedSize = breedSize;
		this.dateOfBirth = dateOfBirth;
		this.favouriteFood = favouriteFood;
		this.favouriteToy = favouriteToy;
		this.colour = colour;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public static WithBreed called(String name) {
		return new DogBreeder(name);
	}

	public String getBreed() {
		return breed;
	}

	public DogBreedSizes getBreedSize() {
		return breedSize;
	}

	public String getColour() {
		return colour;
	}

	public String getFavouriteFood() {
		return favouriteFood;
	}

	public String getFavouriteToy() {
		return favouriteToy;
	}

	public interface WithBreed {
		WithBreedSize ofSize(DogBreedSizes breedSize);

	}

	public interface WithBreedSize {
		WithColour ofBreed(String breed);
	}

	public interface WithColour {
		DogBreeder ofColour(String colour);
	}

	public static class DogBreeder implements WithBreed, WithColour, WithBreedSize {
		private String name;
		private String breed;
		private String colour;
		private String favouriteFood;
		private String favouriteToy;
		private DogBreedSizes breedSize;

		public DogBreeder(String name) {
			this.name = name;
		}

		@Override
		public WithBreedSize ofSize(DogBreedSizes breedSize) {
			this.breedSize = breedSize;
			return this;
		}

		public WithColour ofBreed(String breed) {
			this.breed = breed;
			return this;
		}

		public DogBreeder ofColour(String colour) {
			this.colour = colour;
			return this;
		}

		public Dog bornOn(LocalDate dateOfBirth) {
			return new Dog(name, breed, breedSize, colour, favouriteFood, favouriteToy, dateOfBirth);
		}

		public DogBreeder withFavouriteFood(String favouriteFood) {
			this.favouriteFood = favouriteFood;
			return this;
		}

		public DogBreeder withFavouriteToy(String favouriteToy) {
			this.favouriteToy = favouriteToy;
			return this;
		}

	}
}