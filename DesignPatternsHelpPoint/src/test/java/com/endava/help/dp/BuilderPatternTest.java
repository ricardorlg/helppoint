package com.endava.help.dp;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

import com.endava.help.dp.builder.DataClass;
import com.endava.help.dp.builder.example.Dog;

public class BuilderPatternTest {

	private final static LocalDate THE_FOURTH_OF_JULY = LocalDate.of(2016, 07, 04);

	@Test
	public void a_new_dog_should_have_a_name_a_breed_a_colour_and_a_date_of_birth() {
		Dog fido = Dog.called("Fido").ofSize(DogBreedSizes.LARGE).ofBreed("Labrador").ofColour("black")
				.bornOn(THE_FOURTH_OF_JULY);

		Assert.assertEquals("Fido", fido.getName());
		Assert.assertEquals(DogBreedSizes.LARGE, fido.getBreedSize());
		Assert.assertEquals("Labrador", fido.getBreed());
		Assert.assertEquals("black", fido.getColour());
		Assert.assertEquals(THE_FOURTH_OF_JULY, fido.getDateOfBirth());
	}

	@Test
	public void a_dog_can_have_an_optional_favourite_food() {
		Dog fido = Dog.called("Fido").ofSize(DogBreedSizes.SMALL).ofBreed("Poodle").ofColour("black")
				.withFavouriteFood("pizza").bornOn(THE_FOURTH_OF_JULY);

		Assert.assertEquals("Fido", fido.getName());
		Assert.assertEquals(DogBreedSizes.SMALL, fido.getBreedSize());
		Assert.assertEquals("Poodle", fido.getBreed());
		Assert.assertEquals("black", fido.getColour());
		Assert.assertEquals("pizza", fido.getFavouriteFood());
		Assert.assertEquals(THE_FOURTH_OF_JULY, fido.getDateOfBirth());
	}

	@Test
	public void a_dog_can_have_an_optional_favourite_toy() {
		Dog fido = Dog.called("Fido").ofSize(DogBreedSizes.MEDIUM).ofBreed("Schnauzer").ofColour("black")
				.withFavouriteToy("bone").bornOn(THE_FOURTH_OF_JULY);

		Assert.assertEquals("Fido", fido.getName());
		Assert.assertEquals(DogBreedSizes.MEDIUM, fido.getBreedSize());
		Assert.assertEquals("Schnauzer", fido.getBreed());
		Assert.assertEquals("black", fido.getColour());
		Assert.assertEquals("bone", fido.getFavouriteToy());
		Assert.assertEquals(THE_FOURTH_OF_JULY, fido.getDateOfBirth());
	}

	@Test
	public void testFedaultBuilder() {
		DataClass sut = DataClass.with("First Mandatory Field").withField("Second MandatoryField")
				.withOptionalField("First Optional Field").withOtherOptionalField("Other Optional Field").build();
		Assert.assertEquals("Other Optional Field", sut.getOtherOptionalField());
	}

}
