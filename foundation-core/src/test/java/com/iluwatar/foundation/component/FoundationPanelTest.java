package com.iluwatar.foundation.component;

import static org.junit.Assert.assertEquals;

import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.util.tester.TagTester;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Test;

import com.iluwatar.foundation.foundationpanel.FoundationPanel;
import com.iluwatar.foundation.foundationpanel.FoundationPanelClassNames;
import com.iluwatar.foundation.foundationpanel.FoundationPanelType;

public class FoundationPanelTest {

	@Test
	public void renderTest() {
		WicketTester tester = new WicketTester();
		TestPanel panel = new TestPanel("panel", Model.of(FoundationPanelType.NORMAL));
		tester.startComponentInPage(panel);
		TagTester tagTester = tester.getTagByWicketId("panel");
		assertEquals(FoundationPanelClassNames.get(FoundationPanelType.NORMAL), tagTester.getAttribute("class"));
	}

	private static class TestPanel extends FoundationPanel {

		private static final long serialVersionUID = 1L;

		public TestPanel(String id, IModel<FoundationPanelType> type) {
			super(id, type);
		}
	}
}
