package com.iluwatar.foundation.visibility;

import static org.junit.Assert.*;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.Model;
import org.apache.wicket.util.tester.TagTester;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;

import com.iluwatar.foundation.visibility.ShowByScreenSizeBehavior;
import com.iluwatar.foundation.visibility.ShowByScreenSizeBehavior.ShowByScreenSizeType;

public class ShowByScreenSizeBehaviorTest {

	private WebMarkupContainer container;
	
	private WicketTester tester;
	
	@Before
	public void setup() {
		tester = new WicketTester();
		container = new WebMarkupContainer("id");
		container.add(new ShowByScreenSizeBehavior(Model.of(ShowByScreenSizeType.SHOW_FOR_MEDIUM_UP)));
	}
	
	@Test
	public void test() {
		tester.startComponentInPage(container);
		TagTester tagTester = tester.getTagByWicketId("id");
		assertEquals("show-for-medium-up", tagTester.getAttribute("class"));
	}

}
