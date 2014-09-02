package com.iluwatar.foundation.buttongroup;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.util.tester.TagTester;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Test;

import com.iluwatar.foundation.button.ButtonOptions;
import com.iluwatar.foundation.button.FoundationButtonClassNames;
import com.iluwatar.foundation.button.FoundationButtonColor;
import com.iluwatar.foundation.button.FoundationButtonRadius;
import com.iluwatar.foundation.util.StringUtil;

public class ButtonGroupPanelTest {

	@Test
	public void renderBasicTest() { 
		WicketTester tester = new WicketTester();
		tester.startComponentInPage(createBasicButtonGroup("buttons"));
		TagTester tag = tester.getTagByWicketId("buttons");
		tag.getAttributeContains("class", ButtonGroupClassNames.BUTTON_GROUP);
	}

	@Test
	public void renderAdvancedTest() { 
		WicketTester tester = new WicketTester();
		tester.startComponentInPage(createAdvancedButtonGroup("buttons"));
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

	@Test
	public void renderButtonBarTest() { 
		WicketTester tester = new WicketTester();
		tester.startPage(ButtonBarTestPage.class);
		tester.dumpPage();
		TagTester tag = tester.getTagByWicketId("border");
		tag.getAttributeContains("class", ButtonGroupClassNames.BUTTON_BAR);
	}
	
	private TestButtonGroupPanel createBasicButtonGroup(String id) {
		ArrayList<ButtonOptions> btnOptions = new ArrayList<>();
		btnOptions.add(new ButtonOptions());
		ButtonGroupOptions groupOptions = new ButtonGroupOptions();
		TestButtonGroupPanel group = new TestButtonGroupPanel(id, groupOptions, btnOptions);
		return group;
	}

	private TestButtonGroupPanel createAdvancedButtonGroup(String id) {
		ArrayList<ButtonOptions> btnOptions = new ArrayList<>();
		btnOptions.add(new ButtonOptions(FoundationButtonColor.ALERT));
		btnOptions.add(new ButtonOptions(FoundationButtonColor.SECONDARY));
		btnOptions.add(new ButtonOptions(FoundationButtonColor.SUCCESS));
		ButtonGroupOptions groupOptions = new ButtonGroupOptions(FoundationButtonRadius.ROUND);
		TestButtonGroupPanel group = new TestButtonGroupPanel(id, groupOptions, btnOptions);
		return group;
	}
}
