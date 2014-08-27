package com.iluwatar.foundation.foundationpanel;

import static org.junit.Assert.assertEquals;

import org.apache.wicket.model.Model;
import org.apache.wicket.util.tester.TagTester;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Test;

public class FoundationBorderTest {
	
	@Test
	public void renderNormalTest() {
		WicketTester tester = new WicketTester();
		FoundationPanelBorder border = new FoundationPanelBorder("foo", Model.of(FoundationPanelType.NORMAL));
		tester.startComponentInPage(border);
		TagTester tagTester = tester.getTagByWicketId("wrapper");
		assertEquals(FoundationPanelClassNames.get(FoundationPanelType.NORMAL), tagTester.getAttribute("class"));
	}
	
	@Test
	public void renderCalloutTest() {
		WicketTester tester = new WicketTester();
		FoundationPanelBorder border = new FoundationPanelBorder("foo", Model.of(FoundationPanelType.CALLOUT));
		tester.startComponentInPage(border);
		TagTester tagTester = tester.getTagByWicketId("wrapper");
		assertEquals(FoundationPanelClassNames.get(FoundationPanelType.CALLOUT), tagTester.getAttribute("class"));
	}
}
