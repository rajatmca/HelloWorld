package com.hydes.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SyncronizedMap {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		//populate the map
		map.put("1", "Rajat");
		map.put("2", "Ajit");
		map.put("3", "Jam");
		//create synchronized map
		Map<String, String> sysmap = Collections.synchronizedMap(map);
		System.out.println("synchronized map is"+sysmap.get("1"));

	}

}
