package com.iluwatar.foundation.buttongroup;

import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.repeater.RepeatingView;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

import com.iluwatar.foundation.component.FoundationBasePanel;
import com.iluwatar.foundation.util.Attribute;

public abstract class ButtonGroupPanel extends FoundationBasePanel {

	private static final long serialVersionUID = 1L;

	public ButtonGroupPanel(String id) {
		this(id, new ButtonGroupOptions());
	}
	
	public ButtonGroupPanel(String id, ButtonGroupOptions groupOptions) {
		this(id, Model.of(groupOptions));
	}
	
	public ButtonGroupPanel(String id, IModel<ButtonGroupOptions> groupOptions) {
		super(id);
		WebMarkupContainer container = createContainer("group", groupOptions);
		add(container);
		RepeatingView rv = new RepeatingView("btn");
		container.add(rv);
		createAndAddButtons(rv);
	}
	
	protected WebMarkupContainer createContainer(String id, IModel<ButtonGroupOptions> groupOptions) {
		return new ButtonGroupContainer(id, groupOptions);
	}
	
	protected abstract void createAndAddButtons(RepeatingView rv);

	private static class ButtonGroupContainer extends WebMarkupContainer {

		private static final long serialVersionUID = 1L;

		public ButtonGroupContainer(String id, IModel<ButtonGroupOptions> model) {
			super(id, model);
		}
	
		@Override
		protected void onComponentTag(ComponentTag tag) {
			Attribute.setClass(tag, ButtonGroupClassNames.BUTTON_GROUP);
			super.onComponentTag(tag);
		}
	}
}
