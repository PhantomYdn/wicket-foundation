package com.iluwatar;

import java.util.ArrayList;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.iluwatar.foundation.button.FoundationButton;
import com.iluwatar.foundation.button.FoundationButtonOptions;
import com.iluwatar.foundation.buttongroup.ButtonGroupOptions;
import com.iluwatar.foundation.buttongroup.ButtonGroupPanel;

public class ButtonGroupPage extends BasePage {

	private static final long serialVersionUID = 1L;

	public ButtonGroupPage(PageParameters params) {
		super(params);
		
		ButtonGroupOptions groupOptions = new ButtonGroupOptions();
		ArrayList<FoundationButtonOptions> btnOptions = new ArrayList<>();
		btnOptions.add(new FoundationButtonOptions());
		btnOptions.add(new FoundationButtonOptions());
		btnOptions.add(new FoundationButtonOptions());
		ButtonGroupPanel btnGroup = new ButtonGroupPanel("basic", groupOptions, btnOptions) {

			private static final long serialVersionUID = 1L;

			@Override
			protected WebMarkupContainer createButton(int idx, String id,
					IModel<FoundationButtonOptions> optionsModel) {
				return new FoundationButton(id, Model.of(String.format("Button %d", idx+1)), optionsModel.getObject());
			}
		};
		add(btnGroup);
	}
}
