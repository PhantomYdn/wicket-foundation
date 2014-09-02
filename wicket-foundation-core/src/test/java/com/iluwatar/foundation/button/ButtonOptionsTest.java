package com.iluwatar.foundation.button;

import org.junit.Test;

public class ButtonOptionsTest {

	@Test
	public void test() {
		ButtonOptions options = new ButtonOptions();
		ButtonOptions options2 = new ButtonOptions(options);
		options2.setFoundationButtonColor(FoundationButtonColor.ALERT);
		options2.setFoundationButtonExpansion(FoundationButtonExpansion.EXPAND);
		options2.setFoundationButtonRadius(FoundationButtonRadius.ROUND);
		options2.setFoundationButtonSize(FoundationButtonSize.TINY);
		options2.setFoundationButtonState(FoundationButtonState.DISABLED);
		options2.reset();
	}

}
