package com.endava.help.dp;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.endava.help.dp.factory.reflection.ConcreteProductA;
import com.endava.help.dp.factory.reflection.ConcreteProductB;
import com.endava.help.dp.factory.reflection.Factory;

public class FactoryReflectionTest {

	@BeforeClass
	public static void setUpClasses() throws ClassNotFoundException {
		Class.forName(ConcreteProductA.class.getName());
		Class.forName(ConcreteProductB.class.getName());
	}
	@Test
	public void test() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String actual=Factory.getInstance().createProduct("A").Operation();
	assertEquals("Product A", actual);
	}

}
