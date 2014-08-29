package com.iluwatar.foundation.button;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.wicket.util.tester.TagTester;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Test;

import com.iluwatar.foundation.button.FoundationButtonOptions.FoundationButtonColor;
import com.iluwatar.foundation.button.FoundationButtonOptions.FoundationButtonExpansion;
import com.iluwatar.foundation.button.FoundationButtonOptions.FoundationButtonRadius;
import com.iluwatar.foundation.button.FoundationButtonOptions.FoundationButtonSize;
import com.iluwatar.foundation.button.FoundationButtonOptions.FoundationButtonState;
import com.iluwatar.foundation.util.StringUtil;

public class FoundationButtonTest {

	@Test
	public void testBasic() {
		WicketTester tester = new WicketTester();
		FoundationButton btn = new FoundationButton("btn");
		tester.startComponentInPage(btn);
		TagTester tagTester = tester.getTagByWicketId("btn");
		assertEquals(FoundationButton.FOUNDATION_BUTTON_CSS_CLASS, tagTester.getAttribute("class"));		
	}

	@Test
	public void testAdvancedSize() {
		WicketTester tester = new WicketTester();
		FoundationButton tiny = new FoundationButton("tiny", new FoundationButtonOptions(FoundationButtonSize.TINY));
		tester.startComponentInPage(tiny);
		tester.dumpPage();
		TagTester tagTester = tester.getTagByWicketId("tiny");
		assertTrue(tagTester.getAttributeContains("class", FoundationButton.FOUNDATION_BUTTON_CSS_CLASS));
		assertTrue(tagTester.getAttributeContains("class", StringUtil.EnumNameToCssClassName(FoundationButtonSize.TINY.name())));
	}

	@Test
	public void testAdvancedColor() {
		WicketTester tester = new WicketTester();
		FoundationButton success = new FoundationButton("success", new FoundationButtonOptions(FoundationButtonColor.SUCCESS));
		tester.startComponentInPage(success);
		tester.dumpPage();
		TagTester tagTester = tester.getTagByWicketId("success");
		assertTrue(tagTester.getAttributeContains("class", FoundationButton.FOUNDATION_BUTTON_CSS_CLASS));
		assertTrue(tagTester.getAttributeContains("class", StringUtil.EnumNameToCssClassName(FoundationButtonColor.SUCCESS.name())));
	}

	@Test
	public void testAdvancedRadius() {
		WicketTester tester = new WicketTester();
		FoundationButton radius = new FoundationButton("radius", new FoundationButtonOptions(FoundationButtonRadius.RADIUS));
		tester.startComponentInPage(radius);
		tester.dumpPage();
		TagTester tagTester = tester.getTagByWicketId("radius");
		assertTrue(tagTester.getAttributeContains("class", FoundationButton.FOUNDATION_BUTTON_CSS_CLASS));
		assertTrue(tagTester.getAttributeContains("class", StringUtil.EnumNameToCssClassName(FoundationButtonRadius.RADIUS.name())));
	}

	@Test
	public void testAdvancedState() {
		WicketTester tester = new WicketTester();
		FoundationButton state = new FoundationButton("state", new FoundationButtonOptions(FoundationButtonState.DISABLED));
		tester.startComponentInPage(state);
		tester.dumpPage();
		TagTester tagTester = tester.getTagByWicketId("state");
		assertTrue(tagTester.getAttributeContains("class", FoundationButton.FOUNDATION_BUTTON_CSS_CLASS));
		assertTrue(tagTester.getAttributeContains("class", StringUtil.EnumNameToCssClassName(FoundationButtonState.DISABLED.name())));
	}

	@Test
	public void testAdvancedExpansion() {
		WicketTester tester = new WicketTester();
		FoundationButton expansion = new FoundationButton("expansion", new FoundationButtonOptions(FoundationButtonExpansion.EXPAND));
		tester.startComponentInPage(expansion);
		tester.dumpPage();
		TagTester tagTester = tester.getTagByWicketId("expansion");
		assertTrue(tagTester.getAttributeContains("class", FoundationButton.FOUNDATION_BUTTON_CSS_CLASS));
		assertTrue(tagTester.getAttributeContains("class", StringUtil.EnumNameToCssClassName(FoundationButtonExpansion.EXPAND.name())));
	}
}
