package com.iluwatar.foundation.foundationpanel;

import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.model.IModel;
import org.apache.wicket.util.lang.Args;

import com.iluwatar.foundation.component.FoundationBasePanel;
import com.iluwatar.foundation.util.Attribute;

public abstract class FoundationPanel extends FoundationBasePanel {

	private static final long serialVersionUID = 1L;
	private IModel<FoundationPanelType> type;

	public FoundationPanel(String id, IModel<FoundationPanelType> type) {
		super(id);
		this.type = type;
		Args.notNull(type, "type");
	}
	
	public FoundationPanel(final String id, final IModel<?> model, IModel<FoundationPanelType> type) {
		super(id, model);
		this.type = type;
		Args.notNull(type, "type");
	}
	
	@Override
	protected void onComponentTag(ComponentTag tag) {
		Attribute.addClass(tag, FoundationPanelClassNames.get(this.type.getObject()));
		super.onComponentTag(tag);
	}
	
	@Override
	protected void onDetach() {
		this.type.detach();
		super.onDetach();
	}
}
