//package com.exavalu.jsonClass;
//
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.json.JSONObject;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//public class JSONObjectTesting {
//	private static final Logger log = LoggerFactory.getLogger(JSONObjectTesting.class);
//	public static void main(String[] args) {
//		
//		JSONObject jo = new JSONObject();
//		jo.put("name", "jon doe");
//		jo.put("age", "22");
//		jo.put("city", "chicago");
//		log.info(jo.toString());
//		
//		Map<String, String> map = new HashMap<>();
//		map.put("name", "Raja Babu");
//		map.put("age", "22");
//		map.put("city", "chicago");
//		String name = jo.getString("name");
//		log.info(name);
//		JSONObject jo1 = new JSONObject(map);
//		log.info(jo1.toString());
//		
//		
//	}
//}
