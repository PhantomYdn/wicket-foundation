package com.iluwatar.foundation.behavior;

import org.apache.wicket.Component;
import org.apache.wicket.behavior.Behavior;
import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.model.IModel;

import com.iluwatar.foundation.Foundation;
import com.iluwatar.foundation.util.Attribute;
import com.iluwatar.foundation.util.StringUtil;

public class HiddenByScreenSizeBehavior extends Behavior {

	private static final long serialVersionUID = 1L;
	
	public enum HiddenByScreenSizeType { 
		HIDDEN_FOR_SMALL_ONLY,
		HIDDEN_FOR_MEDIUM_UP,
		HIDDEN_FOR_MEDIUM_ONLY,
		HIDDEN_FOR_LARGE_UP,
		HIDDEN_FOR_LARGE_ONLY,
		HIDDEN_FOR_XLARGE_UP,
		HIDDEN_FOR_XLARGE_ONLY,
		HIDDEN_FOR_XXLARGE_UP };
	
	private IModel<HiddenByScreenSizeType> hideTypeModel;

	public HiddenByScreenSizeBehavior(IModel<HiddenByScreenSizeType> hideTypeModel) {
		this.hideTypeModel = hideTypeModel;
	}
	
	@Override
	public void onComponentTag(Component component, ComponentTag tag) {
		super.onComponentTag(component, tag);
		Attribute.addClass(tag, StringUtil.EnumNameToCssClassName(hideTypeModel.getObject().name()));
	}

	@Override
	public void renderHead(Component component, IHeaderResponse response) {
		super.renderHead(component, response);
		response.render(CssHeaderItem.forReference(Foundation.getFoundationCssReference()));
	}

	@Override
	public void detach(Component component) {
		if (hideTypeModel != null) {
			hideTypeModel.detach();
		}
		super.detach(component);
	}
	
}
