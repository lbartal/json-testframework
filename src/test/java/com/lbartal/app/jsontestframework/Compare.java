package com.lbartal.app.jsontestframework;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class Compare {

	@Test
	public void testCompare() throws IOException {
		MenuBuilder menuBuilder = new MenuBuilder();
		assertEquals(menuBuilder.menujson.replaceAll("\\s+",""), menuBuilder.build());
	}

}
