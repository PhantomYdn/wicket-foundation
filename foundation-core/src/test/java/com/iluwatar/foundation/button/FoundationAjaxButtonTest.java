package com.iluwatar.foundation.button;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.wicket.markup.Markup;
import org.apache.wicket.util.tester.TagTester;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Test;

import com.iluwatar.foundation.button.FoundationButtonOptions.FoundationButtonColor;
import com.iluwatar.foundation.button.FoundationButtonOptions.FoundationButtonExpansion;
import com.iluwatar.foundation.button.FoundationButtonOptions.FoundationButtonRadius;
import com.iluwatar.foundation.button.FoundationButtonOptions.FoundationButtonSize;
import com.iluwatar.foundation.button.FoundationButtonOptions.FoundationButtonState;
import com.iluwatar.foundation.util.StringUtil;

public class FoundationAjaxButtonTest {
	
	@Test
	public void testBasic() {
		WicketTester tester = new WicketTester();
		FoundationAjaxButton btn = new FoundationAjaxButton("btn");
		tester.startComponentInPage(btn, Markup.of("<html><head></head><body><form><a wicket:id=\"btn\"></a></form></body></html>"));
		TagTester tagTester = tester.getTagByWicketId("btn");
		assertEquals(FoundationButtonBehavior.FOUNDATION_BUTTON_CSS_CLASS, tagTester.getAttribute("class"));		
	}

	@Test
	public void testAdvancedSize() {
		WicketTester tester = new WicketTester();
		FoundationAjaxButton btn = new FoundationAjaxButton("btn", new FoundationButtonOptions(FoundationButtonSize.TINY));
		tester.startComponentInPage(btn, Markup.of("<html><head></head><body><form><a wicket:id=\"btn\"></a></form></body></html>"));
		tester.dumpPage();
		TagTester tagTester = tester.getTagByWicketId("btn");
		assertTrue(tagTester.getAttributeContains("class", FoundationButtonBehavior.FOUNDATION_BUTTON_CSS_CLASS));
		assertTrue(tagTester.getAttributeContains("class", StringUtil.EnumNameToCssClassName(FoundationButtonSize.TINY.name())));
	}

	@Test
	public void testAdvancedColor() {
		WicketTester tester = new WicketTester();
		FoundationAjaxButton btn = new FoundationAjaxButton("btn", new FoundationButtonOptions(FoundationButtonColor.SUCCESS));
		tester.startComponentInPage(btn, Markup.of("<html><head></head><body><form><a wicket:id=\"btn\"></a></form></body></html>"));
		tester.dumpPage();
		TagTester tagTester = tester.getTagByWicketId("btn");
		assertTrue(tagTester.getAttributeContains("class", FoundationButtonBehavior.FOUNDATION_BUTTON_CSS_CLASS));
		assertTrue(tagTester.getAttributeContains("class", StringUtil.EnumNameToCssClassName(FoundationButtonColor.SUCCESS.name())));
	}

	@Test
	public void testAdvancedRadius() {
		WicketTester tester = new WicketTester();
		FoundationAjaxButton btn = new FoundationAjaxButton("btn", new FoundationButtonOptions(FoundationButtonRadius.RADIUS));
		tester.startComponentInPage(btn, Markup.of("<html><head></head><body><form><a wicket:id=\"btn\"></a></form></body></html>"));
		tester.dumpPage();
		TagTester tagTester = tester.getTagByWicketId("btn");
		assertTrue(tagTester.getAttributeContains("class", FoundationButtonBehavior.FOUNDATION_BUTTON_CSS_CLASS));
		assertTrue(tagTester.getAttributeContains("class", StringUtil.EnumNameToCssClassName(FoundationButtonRadius.RADIUS.name())));
	}

	@Test
	public void testAdvancedState() {
		WicketTester tester = new WicketTester();
		FoundationAjaxButton btn = new FoundationAjaxButton("btn", new FoundationButtonOptions(FoundationButtonState.DISABLED));
		tester.startComponentInPage(btn, Markup.of("<html><head></head><body><form><a wicket:id=\"btn\"></a></form></body></html>"));
		tester.dumpPage();
		TagTester tagTester = tester.getTagByWicketId("btn");
		assertTrue(tagTester.getAttributeContains("class", FoundationButtonBehavior.FOUNDATION_BUTTON_CSS_CLASS));
		assertTrue(tagTester.getAttributeContains("class", StringUtil.EnumNameToCssClassName(FoundationButtonState.DISABLED.name())));
	}

	@Test
	public void testAdvancedExpansion() {
		WicketTester tester = new WicketTester();
		FoundationAjaxButton btn = new FoundationAjaxButton("btn", new FoundationButtonOptions(FoundationButtonExpansion.EXPAND));
		tester.startComponentInPage(btn, Markup.of("<html><head></head><body><form><a wicket:id=\"btn\"></a></form></body></html>"));
		tester.dumpPage();
		TagTester tagTester = tester.getTagByWicketId("btn");
		assertTrue(tagTester.getAttributeContains("class", FoundationButtonBehavior.FOUNDATION_BUTTON_CSS_CLASS));
		assertTrue(tagTester.getAttributeContains("class", StringUtil.EnumNameToCssClassName(FoundationButtonExpansion.EXPAND.name())));
	}
}
