package com.iluwatar.foundation.buttongroup;

import java.io.Serializable;

import com.iluwatar.foundation.button.FoundationButtonColor;
import com.iluwatar.foundation.button.FoundationButtonRadius;

public class ButtonGroupOptions implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private FoundationButtonRadius radius;
	private FoundationButtonColor color;
	private ButtonGroupStacking stacking;
	
	public FoundationButtonRadius getRadius() {
		return radius;
	}
	public void setRadius(FoundationButtonRadius radius) {
		this.radius = radius;
	}
	public FoundationButtonColor getColor() {
		return color;
	}
	public void setColor(FoundationButtonColor color) {
		this.color = color;
	}
	public ButtonGroupStacking getStacking() {
		return stacking;
	}
	public void setStacking(ButtonGroupStacking stacking) {
		this.stacking = stacking;
	}
	
}
