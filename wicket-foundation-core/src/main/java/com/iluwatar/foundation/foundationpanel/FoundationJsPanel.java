package com.iluwatar.foundation.foundationpanel;

import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.model.IModel;

import com.iluwatar.foundation.Foundation;
import com.iluwatar.foundation.component.FoundationBasePanel;

public abstract class FoundationJsPanel extends FoundationBasePanel {

	private static final long serialVersionUID = 1L;

	public FoundationJsPanel(String id) {
		super(id);
	}
	
	public FoundationJsPanel(String id, IModel<?> model) {
		super(id, model);
	}

	@Override
	public void renderHead(IHeaderResponse response) {
		super.renderHead(response);
		response.render(JavaScriptHeaderItem.forReference(Foundation.getFoundationJsReference()));
	}
}
