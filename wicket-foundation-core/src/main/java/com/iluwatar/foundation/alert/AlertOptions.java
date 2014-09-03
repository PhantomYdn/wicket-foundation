package com.iluwatar.foundation.alert;

import java.io.Serializable;

import com.iluwatar.foundation.button.FoundationButtonColor;
import com.iluwatar.foundation.button.FoundationButtonRadius;

public class AlertOptions implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private FoundationButtonColor color;
	private FoundationButtonRadius radius;
	
	public AlertOptions() {
	}

	public AlertOptions(FoundationButtonColor color) {
		this.color = color;
	}

	public AlertOptions(FoundationButtonRadius radius) {
		this.radius = radius;
	}

	public AlertOptions(AlertOptions other) {
		this.color = other.color;
		this.radius = other.radius;
	}
	
	public FoundationButtonColor getColor() {
		return color;
	}
	
	public AlertOptions setColor(FoundationButtonColor color) {
		this.color = color;
		return this;
	}
	
	public FoundationButtonRadius getRadius() {
		return radius;
	}
	
	public AlertOptions setRadius(FoundationButtonRadius radius) {
		this.radius = radius;
		return this;
	}
}
