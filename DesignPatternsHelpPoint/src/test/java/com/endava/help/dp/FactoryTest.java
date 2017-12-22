package com.endava.help.dp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.endava.help.dp.factory.Factory;
import com.endava.help.dp.factory.Product;

public class FactoryTest {

	@Test
	public void test() {
		Product sut= Factory.getInstance().createProduct("A");
		assertEquals("Product A", sut.Operation());
	}

}
