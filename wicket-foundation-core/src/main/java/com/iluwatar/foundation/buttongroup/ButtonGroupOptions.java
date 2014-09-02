package com.iluwatar.foundation.buttongroup;

import java.io.Serializable;

import com.iluwatar.foundation.button.FoundationButtonColor;
import com.iluwatar.foundation.button.FoundationButtonRadius;

public class ButtonGroupOptions implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private FoundationButtonRadius radius;
	private FoundationButtonColor color;
	private ButtonGroupStacking stacking;
	
	public ButtonGroupOptions() {
	}

	public ButtonGroupOptions(FoundationButtonRadius radius) {
		this.radius = radius;
	}
	
	public ButtonGroupOptions(FoundationButtonColor color) {
		this.color = color;
	}
	
	public ButtonGroupOptions(ButtonGroupStacking stacking) {
		this.stacking = stacking;
	}
	
	public ButtonGroupOptions(ButtonGroupOptions other) {
		this.radius = other.radius;
		this.color = other.color;
		this.stacking = other.stacking;
	}
	
	public FoundationButtonRadius getRadius() {
		return radius;
	}
	public ButtonGroupOptions setRadius(FoundationButtonRadius radius) {
		this.radius = radius;
		return this;
	}
	public FoundationButtonColor getColor() {
		return color;
	}
	public ButtonGroupOptions setColor(FoundationButtonColor color) {
		this.color = color;
		return this;
	}
	public ButtonGroupStacking getStacking() {
		return stacking;
	}
	public ButtonGroupOptions setStacking(ButtonGroupStacking stacking) {
		this.stacking = stacking;
		return this;
	}
	
}
