package com.iluwatar.foundation.buttongroup;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.IModel;

import com.iluwatar.foundation.border.FoundationBaseBorder;

public class ButtonBarBorder extends FoundationBaseBorder {

	private static final long serialVersionUID = 1L;

	public ButtonBarBorder(String id) {
		super(id);
		initComponents();
	}
	
	public ButtonBarBorder(String id, IModel<?> model) {
		super(id, model);
		initComponents();
	}
	
	private void initComponents() {
		WebMarkupContainer wrapper = new WebMarkupContainer("wrapper");
		wrapper.add(new AttributeModifier("class", ButtonGroupClassNames.BUTTON_BAR));
		this.addToBorder(wrapper);
	}
}
