package com.iluwatar.foundation.border;

import org.apache.wicket.markup.html.border.Border;
import org.apache.wicket.model.IModel;

public class FoundationBorder extends Border {

	private static final long serialVersionUID = 1L;

	public FoundationBorder(String id) {
		super(id);
	}
	
	public FoundationBorder(String id, IModel<?> model) {
		super(id, model);
	}
	
}
