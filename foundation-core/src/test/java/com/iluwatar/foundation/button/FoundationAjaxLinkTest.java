package com.iluwatar.foundation.button;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.util.tester.TagTester;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Test;

import com.iluwatar.foundation.button.FoundationButtonOptions.FoundationButtonColor;
import com.iluwatar.foundation.button.FoundationButtonOptions.FoundationButtonExpansion;
import com.iluwatar.foundation.button.FoundationButtonOptions.FoundationButtonRadius;
import com.iluwatar.foundation.button.FoundationButtonOptions.FoundationButtonSize;
import com.iluwatar.foundation.button.FoundationButtonOptions.FoundationButtonState;
import com.iluwatar.foundation.util.StringUtil;

public class FoundationAjaxLinkTest {

	@Test
	public void testBasic() {
		testButton(new WicketTester(), new FoundationTestAjaxLink("btn"), new ArrayList<String>());
	}

	@Test
	public void testAdvancedSize() {
		testButton(new WicketTester(), new FoundationTestAjaxLink("btn", new FoundationButtonOptions(FoundationButtonSize.TINY)), 
				Arrays.asList(StringUtil.EnumNameToCssClassName(FoundationButtonSize.TINY.name())));
	}

	@Test
	public void testAdvancedColor() {
		testButton(new WicketTester(), new FoundationTestAjaxLink("btn", new FoundationButtonOptions(FoundationButtonColor.SUCCESS)), 
				Arrays.asList(StringUtil.EnumNameToCssClassName(FoundationButtonColor.SUCCESS.name())));
	}

	@Test
	public void testAdvancedRadius() {
		testButton(new WicketTester(), new FoundationTestAjaxLink("btn", new FoundationButtonOptions(FoundationButtonRadius.RADIUS)), 
				Arrays.asList(StringUtil.EnumNameToCssClassName(FoundationButtonRadius.RADIUS.name())));
	}

	@Test
	public void testAdvancedState() {
		testButton(new WicketTester(), new FoundationTestAjaxLink("btn", new FoundationButtonOptions(FoundationButtonState.DISABLED)), 
				Arrays.asList(StringUtil.EnumNameToCssClassName(FoundationButtonState.DISABLED.name())));
	}

	@Test
	public void testAdvancedExpansion() {
		testButton(new WicketTester(), new FoundationTestAjaxLink("btn", new FoundationButtonOptions(FoundationButtonExpansion.EXPAND)), 
				Arrays.asList(StringUtil.EnumNameToCssClassName(FoundationButtonExpansion.EXPAND.name())));
	}
	
	private void testButton(WicketTester tester, FoundationAjaxLink<?> btn, List<String> additionalCssClassesToVerify) {
		tester.startComponentInPage(btn);
		TagTester tagTester = tester.getTagByWicketId(btn.getId());
		assertTrue(tagTester.getAttributeContains("class", FoundationButtonBehavior.FOUNDATION_BUTTON_CSS_CLASS));
		for (String clazz: additionalCssClassesToVerify) {
			assertTrue(tagTester.getAttributeContains("class", clazz));
		}
	}
	
	private static class FoundationTestAjaxLink extends FoundationAjaxLink<Void> {

		private static final long serialVersionUID = 1L;

		public FoundationTestAjaxLink(String id) {
			super(id);
		}
		
		public FoundationTestAjaxLink(String id, FoundationButtonOptions options) {
			super(id, options);
		}

		@Override
		public void onClick(AjaxRequestTarget target) {
			// NOP
		}
	}
}
