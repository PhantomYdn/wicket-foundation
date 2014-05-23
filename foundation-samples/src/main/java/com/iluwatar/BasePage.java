package com.iluwatar;

import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.iluwatar.foundation.Foundation;

public abstract class BasePage extends WebPage {

	private static final long serialVersionUID = 1L;

	public BasePage(final PageParameters params) {
		super(params);
	}

	@Override
	public void renderHead(IHeaderResponse response) {
		super.renderHead(response);
		response.render(CssHeaderItem.forReference(Foundation.getNormalizeCssReference()));
		response.render(CssHeaderItem.forReference(Foundation.getFoundationCssReference()));
		response.render(JavaScriptHeaderItem.forReference(Foundation.getFoundationJsReference()));
	}
	
}
