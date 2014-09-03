package com.iluwatar;

import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.iluwatar.foundation.alert.FoundationAlert;

public class AlertsPage extends BasePage {

	private static final long serialVersionUID = 1L;

	public AlertsPage(PageParameters params) {
		super(params);
		add(new FoundationAlert("basic", Model.of("This is standard alert.")));
	}
}
