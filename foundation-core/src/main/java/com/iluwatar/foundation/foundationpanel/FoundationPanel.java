package com.iluwatar.foundation.foundationpanel;

import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.panel.Panel;

import com.iluwatar.foundation.Foundation;
import com.iluwatar.foundation.util.Attribute;

public class FoundationPanel extends Panel {

	private static final long serialVersionUID = 1L;
	public static final String FOUNDATION_PANEL_CLASS_NAME = "panel";

	public FoundationPanel(String id) {
		super(id);
	}
	
	@Override
	protected void onComponentTag(ComponentTag tag) {
		Attribute.addClass(tag, FOUNDATION_PANEL_CLASS_NAME);
		super.onComponentTag(tag);
	}
	
	@Override
	public void renderHead(IHeaderResponse response) {
		super.renderHead(response);
		response.render(CssHeaderItem.forReference(Foundation.getFoundationCssReference()));
	}
	
}
