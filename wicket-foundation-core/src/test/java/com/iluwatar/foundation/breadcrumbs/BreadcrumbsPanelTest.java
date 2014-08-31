package com.iluwatar.foundation.breadcrumbs;

import java.util.ArrayList;

import org.apache.wicket.model.util.ListModel;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Test;

public class BreadcrumbsPanelTest {

	@Test
	public void renderNormalTest() {
		
		WicketTester wicketTester = new WicketTester();
		ArrayList<BreadcrumbsItem> items = new ArrayList<>();
		items.add(new BreadcrumbsItem(BreadcrumbsTestPage.class, "foobar"));
		items.add(new BreadcrumbsItem(BreadcrumbsTestPage.class, "baz"));
		items.add(new BreadcrumbsItem(BreadcrumbsTestPage.class, "hooray123"));
		BreadcrumbsPanel breadcrumbsPanel = new BreadcrumbsPanel("id", new ListModel<>(items));
		wicketTester.startComponentInPage(breadcrumbsPanel);
		wicketTester.dumpPage();
		
	}
}
