package com.iluwatar;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.model.util.ListModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.iluwatar.foundation.breadcrumbs.BreadcrumbsItem;
import com.iluwatar.foundation.breadcrumbs.BreadcrumbsPanel;

public class BreadcrumbsPage extends BasePage {

	private static final long serialVersionUID = 1L;

	public BreadcrumbsPage(PageParameters params) {
		super(params);
		
		List<BreadcrumbsItem> basicItems = new ArrayList<>();
		basicItems.add(new BreadcrumbsItem(CatalogPage.class, "First", false));
		basicItems.add(new BreadcrumbsItem(ButtonsPage.class, "Second", false));
		basicItems.add(new BreadcrumbsItem(VisibilityPage.class, "Third", false));
		basicItems.add(new BreadcrumbsItem(BreadcrumbsPage.class, "Fourth", false));
		add(new BreadcrumbsPanel("basic", new ListModel<>(basicItems)));
		
		List<BreadcrumbsItem> advancedItems = new ArrayList<>();
		advancedItems.add(new BreadcrumbsItem(CatalogPage.class, "First", false));
		advancedItems.add(new BreadcrumbsItem(ButtonsPage.class, "Second", false));
		advancedItems.add(new BreadcrumbsItem(VisibilityPage.class, "Third", false));
		advancedItems.add(new BreadcrumbsItem(GridPage.class, "Fourth", true));
		advancedItems.add(new BreadcrumbsItem(BlockGridPage.class, "Fifth", true));
		advancedItems.add(new BreadcrumbsItem(BreadcrumbsPage.class, "Sixth", false));
		add(new BreadcrumbsPanel("advanced", new ListModel<>(advancedItems)));
	}

}
