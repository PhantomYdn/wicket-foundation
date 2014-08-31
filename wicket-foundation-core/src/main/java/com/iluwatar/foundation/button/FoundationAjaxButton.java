package com.iluwatar.foundation.button;

import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.MarkupStream;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.util.lang.Args;

public class FoundationAjaxButton extends AjaxButton {

	private static final long serialVersionUID = 1L;

	private IModel<FoundationButtonOptions> optionsModel;

	public FoundationAjaxButton(String id) {
		this(id, new FoundationButtonOptions());
	}
	
	public FoundationAjaxButton(String id, FoundationButtonOptions options) {
		super(id);
		Args.notNull(options, "options");
		optionsModel = Model.of(options);
		add(new FoundationButtonBehavior(optionsModel));
	}
	
	public FoundationAjaxButton(String id, Form<?> form, FoundationButtonOptions options) {
		super(id, form);
		Args.notNull(options, "options");
		optionsModel = Model.of(options);
		add(new FoundationButtonBehavior(optionsModel));
	}
	
	public FoundationAjaxButton(String id, IModel<String> model, FoundationButtonOptions options) {
		super(id, model);
		Args.notNull(options, "options");
		optionsModel = Model.of(options);
		add(new FoundationButtonBehavior(optionsModel));
	}
	
	public FoundationAjaxButton(String id, IModel<String> model, Form<?> form, FoundationButtonOptions options) {
		this(id, model, form, Model.of(options));
	}

	public FoundationAjaxButton(String id, IModel<String> model, Form<?> form, IModel<FoundationButtonOptions> optionsModel) {
		super(id, model, form);
		Args.notNull(optionsModel, "optionsModel");
		this.optionsModel = optionsModel;
		add(new FoundationButtonBehavior(optionsModel));
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
