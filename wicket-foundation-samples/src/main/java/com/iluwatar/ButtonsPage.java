package com.iluwatar;

import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.iluwatar.foundation.button.FoundationButton;
import com.iluwatar.foundation.button.FoundationButtonColor;
import com.iluwatar.foundation.button.FoundationButtonExpansion;
import com.iluwatar.foundation.button.FoundationButtonOptions;
import com.iluwatar.foundation.button.FoundationButtonRadius;
import com.iluwatar.foundation.button.FoundationButtonSize;
import com.iluwatar.foundation.button.FoundationButtonState;

public class ButtonsPage extends BasePage {

	private static final long serialVersionUID = 1L;

	public ButtonsPage(PageParameters params) {
		super(params);
		add(new FoundationButton("btn", Model.of("Click")));
		add(new FoundationButton("tiny", Model.of("Tiny"), new FoundationButtonOptions(FoundationButtonSize.TINY)));
		add(new FoundationButton("alert", Model.of("Alert"), new FoundationButtonOptions(FoundationButtonColor.ALERT)));
		add(new FoundationButton("radius", Model.of("Radius"), new FoundationButtonOptions(FoundationButtonRadius.RADIUS)));
		add(new FoundationButton("disabled", Model.of("Disabled"), new FoundationButtonOptions(FoundationButtonState.DISABLED)));
		add(new FoundationButton("expand", Model.of("Expand"), new FoundationButtonOptions(FoundationButtonExpansion.EXPAND)));
	}

}
