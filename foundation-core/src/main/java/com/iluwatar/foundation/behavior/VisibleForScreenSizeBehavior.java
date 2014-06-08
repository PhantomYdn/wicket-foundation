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

public class VisibleForScreenSizeBehavior extends Behavior {

	private static final long serialVersionUID = 1L;
	
	public enum VisibleForScreenSizeType { 
		VISIBLE_FOR_SMALL_ONLY,
		VISIBLE_FOR_MEDIUM_UP,
		VISIBLE_FOR_MEDIUM_ONLY,
		VISIBLE_FOR_LARGE_UP,
		VISIBLE_FOR_LARGE_ONLY,
		VISIBLE_FOR_XLARGE_UP,
		VISIBLE_FOR_XLARGE_ONLY,
		VISIBLE_FOR_XXLARGE_UP };
	
	private IModel<VisibleForScreenSizeType> showTypeModel;

	public VisibleForScreenSizeBehavior(IModel<VisibleForScreenSizeType> showTypeModel) {
		this.showTypeModel = showTypeModel;
	}
	
	@Override
	public void onComponentTag(Component component, ComponentTag tag) {
		super.onComponentTag(component, tag);
		Attribute.addClass(tag, StringUtil.EnumNameToCssClassName(showTypeModel.getObject().name()));
	}

	@Override
	public void renderHead(Component component, IHeaderResponse response) {
		super.renderHead(component, response);
		response.render(CssHeaderItem.forReference(Foundation.getFoundationCssReference()));
	}

	@Override
	public void detach(Component component) {
		if (showTypeModel != null) {
			showTypeModel.detach();
		}
		super.detach(component);
	}
	
	
}
