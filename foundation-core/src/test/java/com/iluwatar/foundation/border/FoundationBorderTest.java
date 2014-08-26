package com.iluwatar.foundation.border;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.Test;

public class FoundationBorderTest {
	
	@Test
	public void renderTest() {
		WicketTester tester = new WicketTester();
		tester.startComponentInPage(FoundationPanelBorder.class);
		tester.dumpPage();
	}

}
