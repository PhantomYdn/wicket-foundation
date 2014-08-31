package com.iluwatar.foundation.breadcrumbs;

import java.io.Serializable;

import org.apache.wicket.Page;

public class BreadcrumbsItem implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Class<? extends Page> clazz;
	private String title;
	
	public BreadcrumbsItem(Class<? extends Page> clazz, String title) {
		this.clazz = clazz;
		this.title = title;
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
	
}
