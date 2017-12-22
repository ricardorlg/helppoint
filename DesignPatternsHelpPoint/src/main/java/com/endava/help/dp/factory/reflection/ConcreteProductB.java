package com.endava.help.dp.factory.reflection;

public class ConcreteProductB implements Product {

	static {
		Factory.getInstance().registerProduct("B", ConcreteProductB.class);
	}

	@Override
	public String Operation() {
		return "Product B";
	}

}
