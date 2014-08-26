package com.iluwatar.foundation.foundationpanel;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.IModel;
import org.apache.wicket.util.lang.Args;

import com.iluwatar.foundation.border.FoundationBaseBorder;

public class FoundationPanelBorder extends FoundationBaseBorder {

	private static final long serialVersionUID = 1L;
	private IModel<FoundationPanelType> type;

	public FoundationPanelBorder(String id, IModel<FoundationPanelType> type) {
		super(id);
		this.type = type;
		Args.notNull(type, "type");
		initComponents();
	}
	
	public FoundationPanelBorder(String id, IModel<?> model, IModel<FoundationPanelType> type) {
		super(id, model);
		this.type = type;
		Args.notNull(type, "type");
		initComponents();
	}
	
	private void initComponents() {
		WebMarkupContainer wrapper = new WebMarkupContainer("wrapper");
		wrapper.add(new AttributeModifier("class", FoundationPanelClassNames.get(this.type.getObject())));
		this.addToBorder(wrapper);
	}
	
	@Override
	protected void onDetach() {
		this.type.detach();
		super.onDetach();
	}
}
