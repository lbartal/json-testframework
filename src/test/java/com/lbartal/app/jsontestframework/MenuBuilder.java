package com.lbartal.app.jsontestframework;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class MenuBuilder {

	String menujson;
	String generatedJson;

	MenuBuilder() throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get("src/test/data/menusample.json"));
		menujson = new String(encoded, StandardCharsets.UTF_8);
		System.out.println(menujson);
	}

	void build() throws JsonSyntaxException{
		Gson gson = new Gson() ;
		MenuRoot menu = gson.fromJson(menujson, MenuRoot.class);
		generatedJson = buildJson(menu);
		System.out.println(generatedJson);
	}

	static String buildJson(Object o) throws JsonSyntaxException{
		Gson gson = new Gson() ;
		return gson.toJson(o);
	}

}
