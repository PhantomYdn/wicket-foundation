package com.iluwatar.foundation.alert;

import static com.iluwatar.foundation.button.FoundationButtonColor.SECONDARY;
import static com.iluwatar.foundation.button.FoundationButtonRadius.ROUND;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AlertOptionsTest {

	@Test
	public void testBasic() {
		AlertOptions options = new AlertOptions();
		AlertOptions options2 = new AlertOptions(options);
		options2 = options2.setColor(SECONDARY).setRadius(ROUND);
		AlertOptions options3 = new AlertOptions(SECONDARY);
		AlertOptions options4 = new AlertOptions(ROUND);
		assertEquals(SECONDARY, options3.getColor());
		assertEquals(ROUND, options4.getRadius());
	}
}
