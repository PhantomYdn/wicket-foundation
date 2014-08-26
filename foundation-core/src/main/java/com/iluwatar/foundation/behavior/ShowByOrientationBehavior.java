package com.iluwatar.foundation.behavior;

import org.apache.wicket.Component;
import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.model.IModel;

import com.iluwatar.foundation.util.Attribute;
import com.iluwatar.foundation.util.StringUtil;

public class ShowByOrientationBehavior extends FoundationBaseBehavior {

	private static final long serialVersionUID = 1L;
	
	public enum ShowByOrientationType { 
		SHOW_FOR_LANDSCAPE,
		SHOW_FOR_PORTRAIT };
	
	private IModel<ShowByOrientationType> showTypeModel;

	public ShowByOrientationBehavior(IModel<ShowByOrientationType> showTypeModel) {
		this.showTypeModel = showTypeModel;
	}
	
	@Override
	public void onComponentTag(Component component, ComponentTag tag) {
		super.onComponentTag(component, tag);
		Attribute.addClass(tag, StringUtil.EnumNameToCssClassName(showTypeModel.getObject().name()));
	}

	@Override
	public void detach(Component component) {
		if (showTypeModel != null) {
			showTypeModel.detach();
		}
		super.detach(component);
	}
}
