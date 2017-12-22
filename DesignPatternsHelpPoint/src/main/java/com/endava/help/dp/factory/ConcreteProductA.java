package com.endava.help.dp.factory;

public class ConcreteProductA implements Product {

	@Override
	public String Operation() {
		return "Product A";
	}

	public String other() {
		return "A";
	}
}
