package com.iluwatar.foundation.breadcrumbs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.wicket.util.tester.TagTester;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Test;

public class BreadcrumbsPanelTest {

	@Test
	public void renderTest() {
		WicketTester tester = new WicketTester();
		tester.startPage(BreadcrumbsTestPage.class);
		tester.assertRenderedPage(BreadcrumbsTestPage.class);
		tester.dumpPage();
		List<TagTester> tags = tester.getTagsByWicketId("items");
		assertEquals(3, tags.size());
		TagTester tag1 = tags.get(0);
		assertTrue(tag1.getAttributeIs("class", null));
		TagTester tag2 = tags.get(1);
		assertTrue(tag2.getAttributeIs("class", BreadcrumbsClassNames.UNAVAILABLE));
		TagTester tag3 = tags.get(2);
		assertTrue(tag3.getAttributeIs("class", BreadcrumbsClassNames.CURRENT));
	}
}
