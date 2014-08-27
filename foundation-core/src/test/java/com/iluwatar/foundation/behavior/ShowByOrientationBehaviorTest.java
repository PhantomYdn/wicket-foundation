package com.iluwatar.foundation.behavior;

import static org.junit.Assert.assertEquals;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.Model;
import org.apache.wicket.util.tester.TagTester;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;

import com.iluwatar.foundation.visibility.ShowByOrientationBehavior;
import com.iluwatar.foundation.visibility.ShowByOrientationBehavior.ShowByOrientationType;

public class ShowByOrientationBehaviorTest {

	private WebMarkupContainer container;
	
	private WicketTester tester;
	
	@Before
	public void setup() {
		tester = new WicketTester();
		container = new WebMarkupContainer("id");
		container.add(new ShowByOrientationBehavior(Model.of(ShowByOrientationType.SHOW_FOR_LANDSCAPE)));
	}
	
	@Test
	public void test() {
		tester.startComponentInPage(container);
		TagTester tagTester = tester.getTagByWicketId("id");
		assertEquals("show-for-landscape", tagTester.getAttribute("class"));
	}

}
