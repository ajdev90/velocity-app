package com.ajdev.velocity.test;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Inside main");

		JsonArray theArray = new JsonArray();
		JsonObject theObject1 = new JsonObject();

		// theObject1.put("1", "one");
		theObject1.addProperty("1", "one");
		theObject1.addProperty("2", "two");
		theObject1.addProperty("3", "three");
		theArray.add(theObject1);
		JsonObject theObject2 = new JsonObject();
		theObject2.addProperty("1", "first");
		theObject2.addProperty("2", "second");
		theObject2.addProperty("3", "third");
		theArray.add(theObject2);
		JsonObject theObject3 = new JsonObject();
		theObject3.addProperty("1", "un");
		theObject3.addProperty("2", "deux");
		theObject3.addProperty("3", "trois");
		theObject3.addProperty("4", "quatre");
		theArray.add(theObject3);
		theArray.add(new JsonObject());

		System.out.println("object " + theObject1);
		for (int i = 0; i < theArray.size(); i++) {

			JsonObject obj = (JsonObject) theArray.get(i);

		}

		VelocityHelper.getTemplate(theArray, theObject3);

	}
}
