package com.iluwatar.foundation.button;

import java.io.Serializable;

public class FoundationButtonOptions implements Serializable {

	private static final long serialVersionUID = 1L;

	private FoundationButtonSize size;
	private FoundationButtonColor color;
	private FoundationButtonRadius radius;
	private FoundationButtonState state;
	private FoundationButtonExpansion expansion;
	
	public FoundationButtonOptions() {
	}
	
	public FoundationButtonOptions(FoundationButtonSize size) {
		this.size = size;
	}

	public FoundationButtonOptions(FoundationButtonColor color) {
		this.color = color;
	}

	public FoundationButtonOptions(FoundationButtonRadius radius) {
		this.radius = radius;
	}

	public FoundationButtonOptions(FoundationButtonState state) {
		this.state = state;
	}

	public FoundationButtonOptions(FoundationButtonExpansion expansion) {
		this.expansion = expansion;
	}
	
	public FoundationButtonOptions(FoundationButtonOptions options) {
		this.size = options.getFoundationButtonSize();
		this.color = options.getFoundationButtonColor();
		this.radius = options.getFoundationButtonRadius();
		this.state = options.getFoundationButtonState();
		this.expansion = options.getFoundationButtonExpansion();
	}
	
	public FoundationButtonSize getFoundationButtonSize() {
		return size;
	}

	public FoundationButtonOptions setFoundationButtonSize(FoundationButtonSize foundationButtonSize) {
		this.size = foundationButtonSize;
		return this;
	}

	public FoundationButtonColor getFoundationButtonColor() {
		return color;
	}

	public FoundationButtonOptions setFoundationButtonColor(FoundationButtonColor foundationButtonColor) {
		this.color = foundationButtonColor;
		return this;
	}

	public FoundationButtonRadius getFoundationButtonRadius() {
		return radius;
	}

	public FoundationButtonOptions setFoundationButtonRadius(FoundationButtonRadius foundationButtonRadius) {
		this.radius = foundationButtonRadius;
		return this;
	}

	public FoundationButtonState getFoundationButtonState() {
		return state;
	}

	public FoundationButtonOptions setFoundationButtonState(FoundationButtonState foundationButtonState) {
		this.state = foundationButtonState;
		return this;
	}

	public FoundationButtonExpansion getFoundationButtonExpansion() {
		return expansion;
	}

	public FoundationButtonOptions setFoundationButtonExpansion(FoundationButtonExpansion foundationButtonExpansion) {
		this.expansion = foundationButtonExpansion;
		return this;
	}
	
	public FoundationButtonOptions reset() {
		size = null;
		color = null;
		radius = null;
		state = null;
		expansion = null;
		return this;
	}
}
