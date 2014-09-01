package com.iluwatar.foundation.breadcrumbs;

import java.util.ArrayList;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.util.ListModel;

public class BreadcrumbsTestPage extends WebPage {

	private static final long serialVersionUID = 1L;

	public BreadcrumbsTestPage() {
		ArrayList<BreadcrumbsItem> items = new ArrayList<>();
		items.add(new BreadcrumbsItem(BreadcrumbsOtherTestPage.class, "111", false));
		items.add(new BreadcrumbsItem(BreadcrumbsOtherTestPage.class, "222", true));
		items.add(new BreadcrumbsItem(BreadcrumbsTestPage.class, "333", false));
		BreadcrumbsPanel breadcrumbsPanel = new BreadcrumbsPanel("breadcrumbs", new ListModel<>(items));
		add(breadcrumbsPanel);
	}
}
