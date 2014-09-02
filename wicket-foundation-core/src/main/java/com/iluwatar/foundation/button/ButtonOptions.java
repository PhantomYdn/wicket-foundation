package com.iluwatar.foundation.button;

import java.io.Serializable;

public class ButtonOptions implements Serializable {

	private static final long serialVersionUID = 1L;

	private FoundationButtonSize size;
	private FoundationButtonColor color;
	private FoundationButtonRadius radius;
	private FoundationButtonState state;
	private FoundationButtonExpansion expansion;
	
	public ButtonOptions() {
	}
	
	public ButtonOptions(FoundationButtonSize size) {
		this.size = size;
	}

	public ButtonOptions(FoundationButtonColor color) {
		this.color = color;
	}

	public ButtonOptions(FoundationButtonRadius radius) {
		this.radius = radius;
	}

	public ButtonOptions(FoundationButtonState state) {
		this.state = state;
	}

	public ButtonOptions(FoundationButtonExpansion expansion) {
		this.expansion = expansion;
	}
	
	public ButtonOptions(ButtonOptions options) {
		this.size = options.getFoundationButtonSize();
		this.color = options.getFoundationButtonColor();
		this.radius = options.getFoundationButtonRadius();
		this.state = options.getFoundationButtonState();
		this.expansion = options.getFoundationButtonExpansion();
	}
	
	public FoundationButtonSize getFoundationButtonSize() {
		return size;
	}

	public ButtonOptions setFoundationButtonSize(FoundationButtonSize foundationButtonSize) {
		this.size = foundationButtonSize;
		return this;
	}

	public FoundationButtonColor getFoundationButtonColor() {
		return color;
	}

	public ButtonOptions setFoundationButtonColor(FoundationButtonColor foundationButtonColor) {
		this.color = foundationButtonColor;
		return this;
	}

	public FoundationButtonRadius getFoundationButtonRadius() {
		return radius;
	}

	public ButtonOptions setFoundationButtonRadius(FoundationButtonRadius foundationButtonRadius) {
		this.radius = foundationButtonRadius;
		return this;
	}

	public FoundationButtonState getFoundationButtonState() {
		return state;
	}

	public ButtonOptions setFoundationButtonState(FoundationButtonState foundationButtonState) {
		this.state = foundationButtonState;
		return this;
	}

	public FoundationButtonExpansion getFoundationButtonExpansion() {
		return expansion;
	}

	public ButtonOptions setFoundationButtonExpansion(FoundationButtonExpansion foundationButtonExpansion) {
		this.expansion = foundationButtonExpansion;
		return this;
	}
	
	public ButtonOptions reset() {
		size = null;
		color = null;
		radius = null;
		state = null;
		expansion = null;
		return this;
	}
}
