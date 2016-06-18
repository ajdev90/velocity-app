package com.ajdev.velocity.test1;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.resource.loader.FileResourceLoader;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;

public class VelocityHelper {

	public static String getTemplate(JSONArray jsonArray, JSONObject jsonObject) {

		VelocityEngine velocityEngine = new VelocityEngine();
		velocityEngine.setProperty(Velocity.RESOURCE_LOADER, "file");
		velocityEngine.setProperty("file.resource.loader.class", FileResourceLoader.class.getName());
		velocityEngine.setProperty(Velocity.FILE_RESOURCE_LOADER_PATH, "/home/joshi/workspace/templates");
		velocityEngine.setProperty("runtime.introspector.uberspect", "com.ajdev.velocity.test1.MyUberspector");
		velocityEngine.init();
		Template template = velocityEngine.getTemplate("testTemplate.vm");
		VelocityContext context = new VelocityContext();
		context.put("jsonArray", jsonArray);
		context.put("jsonObject", jsonObject);

		System.out.println("jsonObject  " + jsonObject);
		StringWriter writer = new StringWriter();
		template.merge(context, writer);
		String templateOp = writer.toString();
		System.out.println(templateOp);
		return templateOp;

	}

}
