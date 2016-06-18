package com.ajdev.velocity.test;

import java.util.Iterator;

import org.apache.velocity.util.introspection.Info;
import org.apache.velocity.util.introspection.SecureUberspector;

import com.google.gson.JsonObject;

/**
 * @author ajdev90
 *
 */
public class MyUberspector extends SecureUberspector {

	@Override
	public Iterator getIterator(Object object, Info info) throws Exception {
		if (object instanceof JsonObject) {
			return new VelJSONObjectIerator((JsonObject) object);
		} else {
			return super.getIterator(object, info);
		}
	}
}
