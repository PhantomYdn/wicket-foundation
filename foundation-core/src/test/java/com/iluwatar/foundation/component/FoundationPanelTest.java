package com.iluwatar.foundation.component;

import static org.junit.Assert.assertEquals;

import org.apache.wicket.util.tester.TagTester;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Test;

public class FoundationPanelTest {

	@Test
	public void renderTest() {
		WicketTester tester = new WicketTester();
		FoundationPanel panel = new FoundationPanel("panel");
		tester.startComponentInPage(panel);
		TagTester tagTester = tester.getTagByWicketId("panel");
		assertEquals(FoundationPanel.FOUNDATION_PANEL_CLASS_NAME, tagTester.getAttribute("class"));
	}
	
}
