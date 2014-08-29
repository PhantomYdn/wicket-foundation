package com.iluwatar;

import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.iluwatar.foundation.button.FoundationButton;
import com.iluwatar.foundation.button.FoundationButtonOptions;
import com.iluwatar.foundation.button.FoundationButtonOptions.FoundationButtonColor;
import com.iluwatar.foundation.button.FoundationButtonOptions.FoundationButtonExpansion;
import com.iluwatar.foundation.button.FoundationButtonOptions.FoundationButtonRadius;
import com.iluwatar.foundation.button.FoundationButtonOptions.FoundationButtonSize;
import com.iluwatar.foundation.button.FoundationButtonOptions.FoundationButtonState;

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
