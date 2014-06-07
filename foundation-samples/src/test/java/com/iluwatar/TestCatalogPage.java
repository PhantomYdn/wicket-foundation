package com.iluwatar;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;

public class TestCatalogPage
{
	private WicketTester tester;

	@Before
	public void setUp()
	{
		tester = new WicketTester(new WicketApplication());
	}

	@Test
	public void homepageRendersSuccessfully()
	{
		//start and render the test page
		tester.startPage(CatalogPage.class);

		//assert rendered page class
		tester.assertRenderedPage(CatalogPage.class);
	}
	
}
