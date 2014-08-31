package com.iluwatar.foundation.util;

import org.apache.wicket.util.lang.Args;

public class StringUtil {

	public static String EnumNameToCssClassName(String name) {
		Args.notNull(name, "name");
		return name.replace("_", "-").toLowerCase();
	}
	
}
