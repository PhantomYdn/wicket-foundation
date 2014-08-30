package com.iluwatar.foundation.button;

import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.MarkupStream;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.util.lang.Args;

public abstract class FoundationAjaxLink<T> extends AjaxLink<T> {

	private static final long serialVersionUID = 1L;

	private IModel<FoundationButtonOptions> optionsModel;
	
	public FoundationAjaxLink(String id) {
		this(id, new FoundationButtonOptions());
	}

	public FoundationAjaxLink(String id, FoundationButtonOptions options) {
		super(id);
		Args.notNull(options, "options");
		optionsModel = Model.of(options);
		add(new FoundationButtonBehavior(optionsModel));
	}
	
	public FoundationAjaxLink(String id, IModel<T> model) {
		this(id, model, new FoundationButtonOptions());
	}

	public FoundationAjaxLink(String id, IModel<T> model, FoundationButtonOptions options) {
		this(id, model, Model.of(options));
	}

	public FoundationAjaxLink(String id, IModel<T> model, IModel<FoundationButtonOptions> optionsModel) {
		super(id, model);
		Args.notNull(optionsModel, "optionsModel");
		this.optionsModel = optionsModel;
		add(new FoundationButtonBehavior(this.optionsModel));
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
