package com.iluwatar.foundation.behavior;

import org.apache.wicket.Component;
import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.model.IModel;

import com.iluwatar.foundation.util.Attribute;
import com.iluwatar.foundation.util.StringUtil;

public class TouchDetectionBehavior extends FoundationBaseBehavior {

	private static final long serialVersionUID = 1L;
	
	public enum TouchDetectionType { 
		SHOW_FOR_TOUCH,
		HIDE_FOR_TOUCH };
	
	private IModel<TouchDetectionType> typeModel;

	public TouchDetectionBehavior(IModel<TouchDetectionType> typeModel) {
		this.typeModel = typeModel;
	}
	
	@Override
	public void onComponentTag(Component component, ComponentTag tag) {
		super.onComponentTag(component, tag);
		Attribute.addClass(tag, StringUtil.EnumNameToCssClassName(typeModel.getObject().name()));
	}

	@Override
	public void detach(Component component) {
		if (typeModel != null) {
			typeModel.detach();
		}
		super.detach(component);
	}
}
