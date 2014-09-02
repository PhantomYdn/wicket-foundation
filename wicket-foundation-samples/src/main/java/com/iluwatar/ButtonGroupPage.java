package com.iluwatar;

import java.util.Arrays;
import java.util.List;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.iluwatar.foundation.button.ButtonOptions;
import com.iluwatar.foundation.button.FoundationButtonColor;
import com.iluwatar.foundation.button.FoundationButtonRadius;
import com.iluwatar.foundation.button.FoundationLink;
import com.iluwatar.foundation.buttongroup.ButtonBarBorder;
import com.iluwatar.foundation.buttongroup.ButtonGroupOptions;
import com.iluwatar.foundation.buttongroup.ButtonGroupPanel;
import com.iluwatar.foundation.buttongroup.ButtonGroupStacking;

public class ButtonGroupPage extends BasePage {

	private static final long serialVersionUID = 1L;

	public ButtonGroupPage(PageParameters params) {
		super(params);
		createAndAddBasicButtonGroup();
		createAndAddAdvancedButtonGroup();
		createAndAddStackButtonGroup();
		createAndAddButtonBar();
	}
	
	private void createAndAddBasicButtonGroup() {
		List<ButtonOptions> btnOptions = Arrays.asList(
				new ButtonOptions(), new ButtonOptions(), new ButtonOptions());
		add(new ButtonGroupPanel("basic", new ButtonGroupOptions(), btnOptions) {

			private static final long serialVersionUID = 1L;

			@Override
			protected WebMarkupContainer createButton(int idx, String id,
					IModel<ButtonOptions> optionsModel) {
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
		List<ButtonOptions> btnOptions = Arrays.asList(
				new ButtonOptions(FoundationButtonColor.ALERT), 
				new ButtonOptions(FoundationButtonColor.ALERT), 
				new ButtonOptions(FoundationButtonColor.ALERT));
		add(new ButtonGroupPanel("advanced", new ButtonGroupOptions(FoundationButtonRadius.ROUND), btnOptions) {

			private static final long serialVersionUID = 1L;

			@Override
			protected WebMarkupContainer createButton(int idx, String id,
					IModel<ButtonOptions> optionsModel) {
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
	
	private void createAndAddStackButtonGroup() {
		List<ButtonOptions> btnOptions = Arrays.asList(new ButtonOptions(), 
				new ButtonOptions(), new ButtonOptions());
		add(new ButtonGroupPanel("stack", new ButtonGroupOptions(ButtonGroupStacking.STACK), btnOptions) {

			private static final long serialVersionUID = 1L;

			@Override
			protected WebMarkupContainer createButton(int idx, String id,
					IModel<ButtonOptions> optionsModel) {
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
	
	private void createAndAddButtonBar() {
		ButtonBarBorder buttonbar = new ButtonBarBorder("buttonbar");
		add(buttonbar);
		buttonbar.add(createButtonGroup("first"));
		buttonbar.add(createButtonGroup("second"));
	}
	
	private ButtonGroupPanel createButtonGroup(String id) {
		List<ButtonOptions> btnOptions = Arrays.asList(
				new ButtonOptions(), new ButtonOptions(), new ButtonOptions());
		return new ButtonGroupPanel(id, new ButtonGroupOptions(), btnOptions) {

			private static final long serialVersionUID = 1L;

			@Override
			protected WebMarkupContainer createButton(int idx, String id,
					IModel<ButtonOptions> optionsModel) {
				return new FoundationLink<String>(id, Model.of(String.format("Button %d", idx+1)), optionsModel.getObject()) {

					private static final long serialVersionUID = 1L;

					@Override
					public void onClick() {
						// NOP
					}
				};
			}
		};
	}	
}
