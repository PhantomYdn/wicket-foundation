package com.iluwatar.foundation.buttongroup;

import java.util.List;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.IModel;

import com.iluwatar.foundation.button.ButtonOptions;
import com.iluwatar.foundation.button.FoundationLink;

class TestButtonGroupPanel extends ButtonGroupPanel {

	private static final long serialVersionUID = 1L;
	
	public TestButtonGroupPanel(String id, ButtonGroupOptions groupOptions,
			List<ButtonOptions> btnOptions) {
		super(id, groupOptions, btnOptions);
	}

	@Override
	protected WebMarkupContainer createButton(int idx, String id, IModel<ButtonOptions> optionsModel) {
		return new FoundationLink<Void>(id, optionsModel.getObject()) {

			private static final long serialVersionUID = 1L;

			@Override
			public void onClick() {
				setResponsePage(ButtonGroupTestPage.class);
			}
			
		};
	}
}