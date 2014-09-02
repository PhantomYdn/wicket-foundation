package com.iluwatar;

import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.iluwatar.foundation.button.FoundationButton;
import com.iluwatar.foundation.button.FoundationButtonColor;
import com.iluwatar.foundation.button.FoundationButtonExpansion;
import com.iluwatar.foundation.button.ButtonOptions;
import com.iluwatar.foundation.button.FoundationButtonRadius;
import com.iluwatar.foundation.button.FoundationButtonSize;
import com.iluwatar.foundation.button.FoundationButtonState;

public class ButtonsPage extends BasePage {

	private static final long serialVersionUID = 1L;

	public ButtonsPage(PageParameters params) {
		super(params);
		add(new FoundationButton("btn", Model.of("Click")));
		add(new FoundationButton("tiny", Model.of("Tiny"), new ButtonOptions(FoundationButtonSize.TINY)));
		add(new FoundationButton("alert", Model.of("Alert"), new ButtonOptions(FoundationButtonColor.ALERT)));
		add(new FoundationButton("radius", Model.of("Radius"), new ButtonOptions(FoundationButtonRadius.RADIUS)));
		add(new FoundationButton("disabled", Model.of("Disabled"), new ButtonOptions(FoundationButtonState.DISABLED)));
		add(new FoundationButton("expand", Model.of("Expand"), new ButtonOptions(FoundationButtonExpansion.EXPAND)));
	}

}
