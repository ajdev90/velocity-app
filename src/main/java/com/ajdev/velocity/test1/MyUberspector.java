package com.ajdev.velocity.test1;

import java.util.Iterator;

import org.apache.velocity.util.introspection.Info;
import org.apache.velocity.util.introspection.SecureUberspector;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;

/**
 * @author ajdev90
 *
 */
public class MyUberspector extends SecureUberspector {

	@Override
	public Iterator getIterator(Object object, Info info) throws Exception {

		if (object instanceof JSONArray) {
			return new VelJSONArrayIterator((JSONArray) object);
		} else if (object instanceof JSONObject) {
			return new VelJSONObjectIerator((JSONObject) (object));

		} else {
			return super.getIterator(object, info);
		}
	}

}
