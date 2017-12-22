package com.endava.help.dp.factory.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import com.endava.help.dp.DogBreedSizes;
import com.endava.help.dp.builder.example.Dog;

public class DogClinicFactory {
	private HashMap<DogBreedSizes, Class<?>> m_RegisteredProducts = new HashMap<>();
	private static DogClinicFactory instance;

	private DogClinicFactory() {
	}

	public synchronized static DogClinicFactory getInstance() {
		if (instance == null) {
			instance = new DogClinicFactory();
		}
		return instance;
	}

	public void registerProduct(DogBreedSizes size, Class<?> dogClinicClass) {
		m_RegisteredProducts.put(size, dogClinicClass);
	}

	public DogClinic getDogClinicForDog(Dog theDog) throws NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> dogClinicClass = m_RegisteredProducts.get(theDog.getBreedSize());
		Constructor<?> dogClinicClassConstructor = dogClinicClass.getDeclaredConstructor(new Class[] { Dog.class });
		return (DogClinic) dogClinicClassConstructor.newInstance(new Object[] { theDog });
	}

}
