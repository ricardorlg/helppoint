package com.endava.help.dp.factory.reflection;

public class ConcreteProductA implements Product {

	static {
		Factory.getInstance().registerProduct("A", ConcreteProductA.class);
	}

	@Override
	public String Operation() {
		return "Product A";
	}

}
