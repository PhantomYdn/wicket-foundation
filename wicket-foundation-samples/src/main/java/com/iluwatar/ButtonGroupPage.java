package com.iluwatar;

import java.util.Arrays;
import java.util.List;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.iluwatar.foundation.button.FoundationButtonColor;
import com.iluwatar.foundation.button.FoundationButtonOptions;
import com.iluwatar.foundation.button.FoundationButtonRadius;
import com.iluwatar.foundation.button.FoundationLink;
import com.iluwatar.foundation.buttongroup.ButtonGroupOptions;
import com.iluwatar.foundation.buttongroup.ButtonGroupPanel;

public class ButtonGroupPage extends BasePage {

	private static final long serialVersionUID = 1L;

	public ButtonGroupPage(PageParameters params) {
		super(params);
		createAndAddBasicButtonGroup();
		createAndAddAdvancedButtonGroup();
	}
	
	private void createAndAddBasicButtonGroup() {
		List<FoundationButtonOptions> btnOptions = Arrays.asList(
				new FoundationButtonOptions(), new FoundationButtonOptions(), new FoundationButtonOptions());
		add(new ButtonGroupPanel("basic", new ButtonGroupOptions(), btnOptions) {

			private static final long serialVersionUID = 1L;

			@Override
			protected WebMarkupContainer createButton(int idx, String id,
					IModel<FoundationButtonOptions> optionsModel) {
				return new FoundationLink<String>(id, Model.of(String.format("Button %d", idx+1)), optionsModel.getObject()) {

					private static final long serialVersionUID = 1L;

					@Override
					public void onClick() {
						// NOP
					}
				};
			}
		});
	}
	
	private void createAndAddAdvancedButtonGroup() {
		List<FoundationButtonOptions> btnOptions = Arrays.asList(
				new FoundationButtonOptions(FoundationButtonColor.ALERT), 
				new FoundationButtonOptions(FoundationButtonColor.ALERT), 
				new FoundationButtonOptions(FoundationButtonColor.ALERT));
		add(new ButtonGroupPanel("advanced", new ButtonGroupOptions(FoundationButtonRadius.ROUND), btnOptions) {

			private static final long serialVersionUID = 1L;

			@Override
			protected WebMarkupContainer createButton(int idx, String id,
					IModel<FoundationButtonOptions> optionsModel) {
				return new FoundationLink<String>(id, Model.of(String.format("Button %d", idx+1)), optionsModel.getObject()) {

					private static final long serialVersionUID = 1L;

					@Override
					public void onClick() {
						// NOP
					}
				};
			}
		});
	}
}
