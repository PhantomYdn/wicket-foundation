package com.iluwatar.foundation.breadcrumbs;

import java.io.Serializable;

import org.apache.wicket.Page;

public class BreadcrumbsItem implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Class<? extends Page> clazz;
	private String title;
	private boolean disabled;
	
	public BreadcrumbsItem(Class<? extends Page> clazz, String title, boolean disabled) {
		this.clazz = clazz;
		this.title = title;
		this.disabled = disabled;
	}

	public Class<? extends Page> getClazz() {
		return clazz;
	}

	public void setClazz(Class<? extends Page> clazz) {
		this.clazz = clazz;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}
	
}
