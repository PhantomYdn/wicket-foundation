package com.iluwatar.foundation.border;

import org.apache.wicket.model.Model;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Test;

import com.iluwatar.foundation.foundationpanel.FoundationPanelBorder;
import com.iluwatar.foundation.foundationpanel.FoundationPanelType;

public class FoundationBorderTest {
	
	@Test
	public void renderTest() {
		WicketTester tester = new WicketTester();
		FoundationPanelBorder border = new FoundationPanelBorder("foo", Model.of(FoundationPanelType.NORMAL));
		tester.startComponentInPage(border);
		tester.dumpPage();
	}
}
