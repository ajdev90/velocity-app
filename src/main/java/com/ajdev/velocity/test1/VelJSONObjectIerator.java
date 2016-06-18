package com.ajdev.velocity.test1;

import java.nio.channels.UnsupportedAddressTypeException;
import java.util.Iterator;
import org.codehaus.jettison.json.JSONObject;

/**
 * @author ajdev90
 *
 */
public class VelJSONObjectIerator implements Iterator<Object> {

	private final JSONObject jsonObject;

	private Iterator<String> iterator;

	public VelJSONObjectIerator(JSONObject jsonObject) {
		this.jsonObject = jsonObject;
		iterator = jsonObject.keys();
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
