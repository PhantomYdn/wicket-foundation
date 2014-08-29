package com.iluwatar.foundation.button;

import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.MarkupStream;
import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.util.lang.Args;

import com.iluwatar.foundation.Foundation;
import com.iluwatar.foundation.util.Attribute;
import com.iluwatar.foundation.util.StringUtil;

public class FoundationButton extends Button {

	private static final long serialVersionUID = 1L;

	public static final String FOUNDATION_BUTTON_CSS_CLASS = "button";
	
	private IModel<FoundationButtonOptions> optionsModel;

	public FoundationButton(String id) {
		super(id);
		optionsModel = Model.of(new FoundationButtonOptions());
	}

	public FoundationButton(String id, FoundationButtonOptions options) {
		super(id);
		optionsModel = Model.of(options);
	}
	
	public FoundationButton(String id, IModel<String> model) {
		super(id, model);
		optionsModel = Model.of(new FoundationButtonOptions());
	}

	public FoundationButton(String id, IModel<String> model, FoundationButtonOptions options) {
		super(id, model);
		Args.notNull(options, "options");
		this.optionsModel = Model.of(options);
	}
	
	public FoundationButton(String id, IModel<String> model, IModel<FoundationButtonOptions> optionsModel) {
		super(id, model);
		Args.notNull(optionsModel, "optionsModel");
		this.optionsModel = optionsModel;
	}
	
	@Override
	public void renderHead(IHeaderResponse response) {
		super.renderHead(response);
		response.render(CssHeaderItem.forReference(Foundation.getFoundationCssReference()));
	}
	
	@Override
	protected void onComponentTag(ComponentTag tag) {
		Attribute.setClass(tag, "button");
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
		super.onComponentTag(tag);
	}
	
	@Override
	public void onComponentTagBody(MarkupStream markupStream,
			ComponentTag openTag) {
		this.replaceComponentTagBody(markupStream, openTag, this.getDefaultModelObjectAsString());
		super.onComponentTagBody(markupStream, openTag);
	}
	
	@Override
	protected void onDetach() {
		this.optionsModel.detach();
		super.onDetach();
	}
}
