package com.iluwatar.foundation.buttongroup;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.IModel;
import org.apache.wicket.util.tester.TagTester;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Test;

import com.iluwatar.foundation.button.FoundationButtonClassNames;
import com.iluwatar.foundation.button.FoundationButtonColor;
import com.iluwatar.foundation.button.FoundationButtonOptions;
import com.iluwatar.foundation.button.FoundationButtonRadius;
import com.iluwatar.foundation.button.FoundationLink;
import com.iluwatar.foundation.util.StringUtil;

public class ButtonGroupPanelTest {

	@Test
	public void renderBasicTest() { 
		WicketTester tester = new WicketTester();
		tester.startComponentInPage(createBasicButtonGroup());
		TagTester tag = tester.getTagByWicketId("buttons");
		tag.getAttributeContains("class", ButtonGroupClassNames.BUTTON_GROUP);
	}

	@Test
	public void renderAdvancedTest() { 
		WicketTester tester = new WicketTester();
		tester.startComponentInPage(createAdvancedButtonGroup());
		tester.dumpPage();
		TagTester group = tester.getTagByWicketId("group");
		assertTrue(group.getAttributeContains("class", ButtonGroupClassNames.BUTTON_GROUP));
		assertTrue(group.getAttributeContains("class", StringUtil.EnumNameToCssClassName(FoundationButtonRadius.ROUND.name())));
		List<TagTester> btnList = tester.getTagsByWicketId("btn");
		assertTrue(btnList.get(0).getAttributeContains("class", 
				FoundationButtonClassNames.BUTTON));
		assertTrue(btnList.get(0).getAttributeContains("class", 
				StringUtil.EnumNameToCssClassName(FoundationButtonColor.ALERT.name())));
		assertTrue(btnList.get(1).getAttributeContains("class", 
				FoundationButtonClassNames.BUTTON));
		assertTrue(btnList.get(1).getAttributeContains("class", 
				StringUtil.EnumNameToCssClassName(FoundationButtonColor.SECONDARY.name())));
		assertTrue(btnList.get(2).getAttributeContains("class", 
				FoundationButtonClassNames.BUTTON));
		assertTrue(btnList.get(2).getAttributeContains("class", 
				StringUtil.EnumNameToCssClassName(FoundationButtonColor.SUCCESS.name())));
	}
	
	private TestButtonGroupPanel createBasicButtonGroup() {
		ArrayList<FoundationButtonOptions> btnOptions = new ArrayList<>();
		btnOptions.add(new FoundationButtonOptions());
		ButtonGroupOptions groupOptions = new ButtonGroupOptions();
		TestButtonGroupPanel group = new TestButtonGroupPanel("buttons", groupOptions, btnOptions);
		return group;
	}

	private TestButtonGroupPanel createAdvancedButtonGroup() {
		ArrayList<FoundationButtonOptions> btnOptions = new ArrayList<>();
		btnOptions.add(new FoundationButtonOptions(FoundationButtonColor.ALERT));
		btnOptions.add(new FoundationButtonOptions(FoundationButtonColor.SECONDARY));
		btnOptions.add(new FoundationButtonOptions(FoundationButtonColor.SUCCESS));
		ButtonGroupOptions groupOptions = new ButtonGroupOptions(FoundationButtonRadius.ROUND);
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
