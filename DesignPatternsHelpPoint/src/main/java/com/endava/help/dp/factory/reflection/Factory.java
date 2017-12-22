package com.endava.help.dp.factory.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class Factory {
	private HashMap<String, Class<?>> m_RegisteredProducts = new HashMap<>();
	private static Factory instance;

	private Factory() {

	}

	public synchronized static Factory getInstance() {
		if (instance == null) {
			instance = new Factory();
		}
		return instance;
	}

	public void registerProduct(String productID, Class<?> productClass) {
		m_RegisteredProducts.put(productID, productClass);
	}

	public Product createProduct(String productID) throws NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> productClass = m_RegisteredProducts.get(productID);
		Constructor<?> productConstructor = productClass.getDeclaredConstructor(new Class[] {});
		return (Product) productConstructor.newInstance(new Object[] {});
	}
}
