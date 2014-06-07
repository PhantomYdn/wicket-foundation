package com.iluwatar.foundation.behavior;

import static org.junit.Assert.assertEquals;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.Model;
import org.apache.wicket.util.tester.TagTester;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;

import com.iluwatar.foundation.behavior.HideByScreenSizeBehavior.HideByScreenSizeType;

public class HideByScreenSizeBehaviorTest {

	private WebMarkupContainer container;
	
	private WicketTester tester;
	
	@Before
	public void setup() {
		tester = new WicketTester();
		container = new WebMarkupContainer("id");
		container.add(new HideByScreenSizeBehavior(Model.of(HideByScreenSizeType.HIDE_FOR_MEDIUM_UP)));
	}
	
	@Test
	public void test() {
		tester.startComponentInPage(container);
		TagTester tagTester = tester.getTagByWicketId("id");
		assertEquals("hide-for-medium-up", tagTester.getAttribute("class"));
	}

}
