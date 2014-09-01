package com.iluwatar.foundation.button;

import org.apache.wicket.Component;
import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.model.IModel;

import com.iluwatar.foundation.behavior.FoundationBaseBehavior;
import com.iluwatar.foundation.util.Attribute;
import com.iluwatar.foundation.util.StringUtil;

public class FoundationButtonBehavior extends FoundationBaseBehavior {

	private static final long serialVersionUID = 1L;
	
	private IModel<FoundationButtonOptions> optionsModel;

	public FoundationButtonBehavior(IModel<FoundationButtonOptions> optionsModel) {
		this.optionsModel = optionsModel;
	}
	
	@Override
	public void onComponentTag(Component component, ComponentTag tag) {

		Attribute.setClass(tag, FoundationButtonClassNames.BUTTON);
		FoundationButtonOptions options = optionsModel.getObject();
		if (options.getFoundationButtonSize() != null) {
			Attribute.addClass(tag, StringUtil.EnumNameToCssClassName(options
					.getFoundationButtonSize().name()));
		}
		if (options.getFoundationButtonColor() != null) {
			Attribute.addClass(tag, StringUtil.EnumNameToCssClassName(options
					.getFoundationButtonColor().name()));
		}
		if (options.getFoundationButtonRadius() != null) {
			Attribute.addClass(tag, StringUtil.EnumNameToCssClassName(options
					.getFoundationButtonRadius().name()));
		}
		if (options.getFoundationButtonState() != null) {
			Attribute.addClass(tag, StringUtil.EnumNameToCssClassName(options
					.getFoundationButtonState().name()));
		}
		if (options.getFoundationButtonExpansion() != null) {
			Attribute.addClass(tag, StringUtil.EnumNameToCssClassName(options
					.getFoundationButtonExpansion().name()));
		}
		super.onComponentTag(component, tag);
	}
	
	@Override
	public void detach(Component component) {
		optionsModel.detach();
		super.detach(component);
	}
}
