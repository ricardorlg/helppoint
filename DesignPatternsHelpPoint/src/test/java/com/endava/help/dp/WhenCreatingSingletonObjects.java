package com.endava.help.dp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.endava.help.dp.singleton.Singleton;

public class WhenCreatingSingletonObjects {

	@Test
	public void itShouldBeUnique() {
		Singleton sut = Singleton.getInstance();
		Singleton sut2 = Singleton.getInstance();
		assertEquals(sut.getId(), sut2.getId());
	}

}
