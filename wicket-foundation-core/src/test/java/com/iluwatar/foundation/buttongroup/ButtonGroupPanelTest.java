package com.iluwatar.foundation.buttongroup;

import org.apache.wicket.markup.repeater.RepeatingView;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Test;

import com.iluwatar.foundation.button.FoundationButton;

public class ButtonGroupPanelTest {

	@Test
	public void renderTest() { 
		WicketTester tester = new WicketTester();
		TestButtonGroupPanel group = new TestButtonGroupPanel("buttons");
		tester.startComponentInPage(group);
		tester.dumpPage();
	}
	
	private static class TestButtonGroupPanel extends ButtonGroupPanel {

		public TestButtonGroupPanel(String id) {
			super(id);
		}

		private static final long serialVersionUID = 1L;
		
		@Override
		protected void createAndAddButtons(RepeatingView rv) {
			rv.add(new FoundationButton(rv.newChildId()));
		}
		
	}
}
