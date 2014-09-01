package com.iluwatar.foundation.buttongroup;

import com.iluwatar.foundation.button.FoundationButtonColor;
import com.iluwatar.foundation.button.FoundationButtonRadius;

public class ButtonGroupOptions {

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
