package com.dw.notification;

import java.util.List;
import java.util.Map;

public class Metadata {
	Map<String, String> metadataMap;
	List<String> definedProps;

	Metadata() {
	}

	public void put(String key, Object o) {
		metadataMap.put(key, o.toString());
	}

	public String get(String key) {
		String string = metadataMap.get(key);
		return string;
	}

}
