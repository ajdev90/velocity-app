package com.ajdev.velocity.test1;

import java.nio.channels.UnsupportedAddressTypeException;
import java.util.Iterator;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;

public class VelJSONArrayIterator implements Iterator<Object> {

	private final JSONArray jsonArray;
	private int nextVal;
	private final int arrayLen;

	public VelJSONArrayIterator(JSONArray jsonArray) {
		this.jsonArray = jsonArray;
		nextVal = 0;
		arrayLen = jsonArray.length();
	}

	public boolean hasNext() {
		return nextVal < arrayLen;
	}

	public Object next() {
		nextVal++;
		try {
			return jsonArray.get(nextVal - 1);
		} catch (JSONException e) {
			return null;
		}

	}

	public void remove() {
		throw new UnsupportedAddressTypeException();
	}

}
