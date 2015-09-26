package com.lbartal.app.jsontestframework.restassured;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

import org.junit.Test;

public class testStaticGetters {

	
	@Test
	public void test() throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get("src/test/data/menusample.json"));
		String jsonString = new String(encoded, StandardCharsets.UTF_8);
		System.out.println(jsonString);
		String getStringValue = StaticGetters.getStringValue(jsonString, "menu.popup.menuitem[0].value");
		assertEquals("New", getStringValue);
		Number getNumberValue = StaticGetters.getNumberValue(jsonString, "menu.popup.menuitem[1].value");
		assertEquals(1.12f, getNumberValue);
		boolean getBooleanValue = StaticGetters.getBooleanValue(jsonString, "menu.popup.menuitem[2].value");
		assertEquals(false, getBooleanValue);
		HashMap<String,Object> builtMap = new HashMap(); 
		builtMap.put("value", false);
		builtMap.put("onclick", "CloseDoc()");
		
		HashMap<String,?> getPairs = StaticGetters.getPairs(jsonString, "menu.popup.menuitem[2]");
		assertEquals(builtMap, getPairs);

	}

}
