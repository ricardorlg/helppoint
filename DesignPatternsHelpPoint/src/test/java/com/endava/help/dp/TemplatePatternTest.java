package com.endava.help.dp;

import org.junit.Test;

import com.endava.help.dp.template.GlassHouse;
import com.endava.help.dp.template.HouseTemplate;
import com.endava.help.dp.template.WoodenHouse;

public class TemplatePatternTest {

	@Test
	public void test() {
		HouseTemplate houseType = new WoodenHouse();

		// using template method
		houseType.buildHouse();
		System.out.println("************");

		houseType = new GlassHouse();

		houseType.buildHouse();
	}

}
