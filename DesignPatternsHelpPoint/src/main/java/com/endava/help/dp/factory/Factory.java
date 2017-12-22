package com.endava.help.dp.factory;

public class Factory {

	private static Factory instance;

	private Factory() {

	}

	public synchronized static Factory getInstance() {
		if (instance == null) {
			instance = new Factory();
		}
		return instance;
	}

	public Product createProduct(String key) {
		switch (key) {
		case "A":
			return new ConcreteProductA();
		case "B":
			return new ConcreteProductB();
		default:
			return null;
		}
	}

}
