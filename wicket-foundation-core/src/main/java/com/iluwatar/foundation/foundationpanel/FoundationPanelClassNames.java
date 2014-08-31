package com.iluwatar.foundation.foundationpanel;

public class FoundationPanelClassNames {

	public static String get(FoundationPanelType type) {

		String className = "";
		switch (type) {
		case CALLOUT:
			className = "panel callout radius";
			break;
		case NORMAL:
			className = "panel";
			break;
		default:
			break;
		}
		return className;
	}
	
}
