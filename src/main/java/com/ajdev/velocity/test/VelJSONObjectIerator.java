package com.ajdev.velocity.test;

import java.nio.channels.UnsupportedAddressTypeException;
import java.util.Iterator;
import java.util.Map.Entry;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * @author ajdev90
 *
 */
public class VelJSONObjectIerator implements Iterator<Object> {
	private Iterator<Entry<String, JsonElement>> iterator;

	public VelJSONObjectIerator(JsonObject object) {
		
		this.iterator = object.entrySet().iterator();
	}

	public boolean hasNext() {
		return iterator.hasNext();
	}

	public Object next() {
		return iterator.next();
	}

	public void remove() {
		throw new UnsupportedAddressTypeException();
	}
}
