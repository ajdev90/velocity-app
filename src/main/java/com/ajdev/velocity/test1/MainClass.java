package com.ajdev.velocity.test1;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("inside mainclass");

		JSONArray theArray = new JSONArray();
		JSONObject theObject1 = new JSONObject();

		try {
			theObject1.put("1", "one");
			theObject1.put("2", "two");
			theObject1.put("3", "three");
			theArray.put(theObject1);
			JSONObject theObject2 = new JSONObject();
			theObject2.put("1", "first");
			theObject2.put("2", "second");
			theObject2.put("3", "third");
			theArray.put(theObject2);
			JSONObject theObject3 = new JSONObject();
			theObject3.put("1", "un");
			theObject3.put("2", "deux");
			theObject3.put("3", "trois");
			theArray.put(theObject3);
			theArray.put(new JSONObject());
			for (int i = 0; i < theArray.length(); i++) {

				JSONObject obj = (JSONObject) theArray.get(i);

			}

			VelocityHelper.getTemplate(theArray, theObject1);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
