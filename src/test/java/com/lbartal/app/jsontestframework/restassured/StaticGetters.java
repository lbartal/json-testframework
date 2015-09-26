package com.lbartal.app.jsontestframework.restassured;

import static com.jayway.restassured.path.json.JsonPath.*;

import java.util.HashMap;

public abstract class StaticGetters {
	
	static Number getNumberValue(String jsonString, String searchString){
		Number number = with(jsonString).get(searchString);
		return number;
	}

	static String getStringValue(String jsonString, String searchString){
		String string = with(jsonString).get(searchString);
		return string;
	}

	static boolean getBooleanValue(String jsonString, String searchString){
		boolean bool = with(jsonString).get(searchString);
		return bool;
	}

	static HashMap<String,?> getPairs(String jsonString, String searchString){
		HashMap<String,?> pairs = with(jsonString).get(searchString);
		return pairs;
	}

}
