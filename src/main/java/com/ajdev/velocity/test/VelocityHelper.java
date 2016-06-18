package com.ajdev.velocity.test;

import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.resource.loader.FileResourceLoader;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * @author ajdev90
 *
 */
public class VelocityHelper {

	public static String getTemplate(JsonArray jsonArray, JsonObject jsonObject) {

		VelocityEngine velocityEngine = new VelocityEngine();
		velocityEngine.setProperty(Velocity.RESOURCE_LOADER, "file");
		velocityEngine.setProperty("file.resource.loader.class", FileResourceLoader.class.getName());
		velocityEngine.setProperty(Velocity.FILE_RESOURCE_LOADER_PATH, "/home/joshi/workspace/templates");
		// velocityEngine.setProperty("runtime.introspector.uberspect",
		// "com.joshi.velocity.test.MyUberspector");
		velocityEngine.init();
		Template template = velocityEngine.getTemplate("testTemplate1.vm");
		VelocityContext context = new VelocityContext();

		context.put("jsonArray", jsonArray);
		context.put("jsonObject", jsonObject);

		StringWriter writer = new StringWriter();
		template.merge(context, writer);
		String templateOp = writer.toString();
		System.out.println("op  " + templateOp);
		return templateOp;

	}

}
