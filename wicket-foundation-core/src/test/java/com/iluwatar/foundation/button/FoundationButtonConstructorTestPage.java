package com.iluwatar.foundation.button;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.Model;

public class FoundationButtonConstructorTestPage extends WebPage {

	private static final long serialVersionUID = 1L;
	
	public FoundationButtonConstructorTestPage() {
		Form<Void> form = new Form<>("form");
		add(form);
		form.add(new FoundationAjaxButton("btn1", form, new ButtonOptions()));
		form.add(new FoundationAjaxButton("btn2", Model.of("foobar"), new ButtonOptions()));
		form.add(new FoundationAjaxButton("btn3", Model.of("foobar"), form, new ButtonOptions()));
	}
}
