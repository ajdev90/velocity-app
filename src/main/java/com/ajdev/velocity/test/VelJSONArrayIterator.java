package com.ajdev.velocity.test;

import java.nio.channels.UnsupportedAddressTypeException;
import java.util.Iterator;

import com.google.gson.JsonArray;

/**
 * @author ajdev90
 *
 */
public class VelJSONArrayIterator implements Iterator<Object> {

	private final JsonArray jsonArray;
	private int nextVal;
	private final int arrayLen;

	public VelJSONArrayIterator(JsonArray array) {
		this.jsonArray = array;
		nextVal = 0;
		arrayLen = array.size();
	}

	public boolean hasNext() {
		return nextVal < arrayLen;
	}

	public Object next() {
		nextVal++;

		return jsonArray.get(nextVal - 1);

	}

	public void remove() {
		throw new UnsupportedAddressTypeException();
	}

}
