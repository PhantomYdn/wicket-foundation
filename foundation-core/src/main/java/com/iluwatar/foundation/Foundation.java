package com.iluwatar.foundation;

import org.apache.wicket.request.resource.CssResourceReference;
import org.apache.wicket.request.resource.JavaScriptResourceReference;
import org.apache.wicket.request.resource.ResourceReference;

public class Foundation {

	private static ResourceReference foundationCssReference;
	
	private static ResourceReference foundationJsReference;
	
	public static ResourceReference getFoundationCssReference() {
		if (foundationCssReference == null) {
			foundationCssReference = new CssResourceReference(Foundation.class, "foundation.css");
		}
		return foundationCssReference;
	}

	public static ResourceReference getFoundationJsReference() {
		if (foundationJsReference == null) {
			foundationJsReference = new JavaScriptResourceReference(Foundation.class, "foundation.js");
		}
		return foundationJsReference;
	}
	
}
