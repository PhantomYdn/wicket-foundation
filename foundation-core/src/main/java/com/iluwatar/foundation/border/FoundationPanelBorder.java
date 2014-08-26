package com.iluwatar.foundation.border;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.IModel;

public class FoundationPanelBorder extends FoundationBaseBorder {

	private static final long serialVersionUID = 1L;

	public FoundationPanelBorder(String id) {
		super(id);
		initComponents();
	}
	
	public FoundationPanelBorder(String id, IModel<?> model) {
		super(id, model);
		initComponents();
	}
	
	private void initComponents() {
		WebMarkupContainer wrapper = new WebMarkupContainer("wrapper");
		wrapper.add(new AttributeModifier("class", "panel"));
		this.addToBorder(wrapper);
	}	
}
