package com.iluwatar.foundation.buttongroup;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.IModel;
import org.apache.wicket.util.tester.TagTester;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Test;

import com.iluwatar.foundation.button.FoundationButtonOptions;
import com.iluwatar.foundation.button.FoundationLink;

public class ButtonGroupPanelTest {

	@Test
	public void renderTest() { 
		WicketTester tester = new WicketTester();
		tester.startComponentInPage(createButtonGroup());
		tester.dumpPage();
		TagTester tag = tester.getTagByWicketId("buttons");
		tag.getAttributeContains("class", ButtonGroupClassNames.BUTTON_GROUP);
	}
	
	private TestButtonGroupPanel createButtonGroup() {
		ArrayList<FoundationButtonOptions> btnOptions = new ArrayList<>();
		btnOptions.add(new FoundationButtonOptions());
		ButtonGroupOptions groupOptions = new ButtonGroupOptions();
		TestButtonGroupPanel group = new TestButtonGroupPanel("buttons", groupOptions, btnOptions);
		return group;
	}
	
	private static class TestButtonGroupPanel extends ButtonGroupPanel {

		private static final long serialVersionUID = 1L;
		
		public TestButtonGroupPanel(String id, ButtonGroupOptions groupOptions,
				List<FoundationButtonOptions> btnOptions) {
			super(id, groupOptions, btnOptions);
		}

		@Override
		protected WebMarkupContainer createButton(int idx, String id, IModel<FoundationButtonOptions> optionsModel) {
			return new FoundationLink<Void>(id, optionsModel.getObject()) {

				private static final long serialVersionUID = 1L;

				@Override
				public void onClick() {
					setResponsePage(ButtonGroupTestPage.class);
				}
				
			};
		}
	}
}
