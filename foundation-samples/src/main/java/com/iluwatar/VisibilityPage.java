package com.iluwatar;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.iluwatar.foundation.behavior.HiddenByScreenSizeBehavior;
import com.iluwatar.foundation.behavior.HiddenByScreenSizeBehavior.HiddenByScreenSizeType;
import com.iluwatar.foundation.behavior.HideByScreenSizeBehavior;
import com.iluwatar.foundation.behavior.HideByScreenSizeBehavior.HideByScreenSizeType;
import com.iluwatar.foundation.behavior.ShowByOrientationBehavior;
import com.iluwatar.foundation.behavior.ShowByOrientationBehavior.ShowByOrientationType;
import com.iluwatar.foundation.behavior.ShowByScreenSizeBehavior;
import com.iluwatar.foundation.behavior.ShowByScreenSizeBehavior.ShowByScreenSizeType;
import com.iluwatar.foundation.behavior.TouchDetectionBehavior;
import com.iluwatar.foundation.behavior.TouchDetectionBehavior.TouchDetectionType;
import com.iluwatar.foundation.behavior.VisibleForScreenSizeBehavior;
import com.iluwatar.foundation.behavior.VisibleForScreenSizeBehavior.VisibleForScreenSizeType;
import com.iluwatar.foundation.border.FoundationBorder;

public class VisibilityPage extends BasePage {

	private static final long serialVersionUID = 1L;

	public VisibilityPage(PageParameters params) {
		super(params);
		
		// show by screen size
		
		FoundationBorder showByScreenSize = new FoundationBorder("showByScreenSize");
		add(showByScreenSize);
		
		Label showForSmallOnly = new Label("showForSmallOnly", Model.of("This text is shown only on a small screen."));
		showByScreenSize.add(showForSmallOnly);
		showForSmallOnly.add(new ShowByScreenSizeBehavior(Model.of(ShowByScreenSizeType.SHOW_FOR_SMALL_ONLY)));
		
		Label showForMediumUp = new Label("showForMediumUp", Model.of("This text is shown on medium screens and up."));
		showByScreenSize.add(showForMediumUp);
		showForMediumUp.add(new ShowByScreenSizeBehavior(Model.of(ShowByScreenSizeType.SHOW_FOR_MEDIUM_UP)));
		
		Label showForMediumOnly = new Label("showForMediumOnly", Model.of("This text is shown only on a medium screen."));
		showByScreenSize.add(showForMediumOnly);
		showForMediumOnly.add(new ShowByScreenSizeBehavior(Model.of(ShowByScreenSizeType.SHOW_FOR_MEDIUM_ONLY)));
		
		Label showForLargeUp = new Label("showForLargeUp", Model.of("This text is shown on large screens and up."));
		showByScreenSize.add(showForLargeUp);
		showForLargeUp.add(new ShowByScreenSizeBehavior(Model.of(ShowByScreenSizeType.SHOW_FOR_LARGE_UP)));
		
		Label showForLargeOnly = new Label("showForLargeOnly", Model.of("This text is shown only on a large screen."));
		showByScreenSize.add(showForLargeOnly);
		showForLargeOnly.add(new ShowByScreenSizeBehavior(Model.of(ShowByScreenSizeType.SHOW_FOR_LARGE_ONLY)));
		
		Label showForXlargeUp = new Label("showForXlargeUp", Model.of("This text is shown on xlarge screens and up."));
		showByScreenSize.add(showForXlargeUp);
		showForXlargeUp.add(new ShowByScreenSizeBehavior(Model.of(ShowByScreenSizeType.SHOW_FOR_XLARGE_UP)));
		
		Label showForXlargeOnly = new Label("showForXlargeOnly", Model.of("This text is shown only on an xlarge screen."));
		showByScreenSize.add(showForXlargeOnly);
		showForXlargeOnly.add(new ShowByScreenSizeBehavior(Model.of(ShowByScreenSizeType.SHOW_FOR_XLARGE_ONLY)));
		
		Label showForXxlargeUp = new Label("showForXxlargeUp", Model.of("This text is shown on xxlarge screens and up."));
		showByScreenSize.add(showForXxlargeUp);
		showForXxlargeUp.add(new ShowByScreenSizeBehavior(Model.of(ShowByScreenSizeType.SHOW_FOR_XXLARGE_UP)));
		
		// hide by screen size
		
		FoundationBorder hideByScreenSize = new FoundationBorder("hideByScreenSize");
		add(hideByScreenSize);
		
		Label hideForSmallOnly = new Label("hideForSmallOnly", Model.of("You are not on a small screen."));
		hideByScreenSize.add(hideForSmallOnly);
		hideForSmallOnly.add(new HideByScreenSizeBehavior(Model.of(HideByScreenSizeType.HIDE_FOR_SMALL_ONLY)));
		
		Label hideForMediumUp = new Label("hideForMediumUp", Model.of("You are not on a medium, large, xlarge, or xxlarge screen."));
		hideByScreenSize.add(hideForMediumUp);
		hideForMediumUp.add(new HideByScreenSizeBehavior(Model.of(HideByScreenSizeType.HIDE_FOR_MEDIUM_UP)));
		
		Label hideForMediumOnly = new Label("hideForMediumOnly", Model.of("You are not on a medium screen."));
		hideByScreenSize.add(hideForMediumOnly);
		hideForMediumOnly.add(new HideByScreenSizeBehavior(Model.of(HideByScreenSizeType.HIDE_FOR_MEDIUM_ONLY)));
		
		Label hideForLargeUp = new Label("hideForLargeUp", Model.of("You are not on a large, xlarge, or xxlarge screen."));
		hideByScreenSize.add(hideForLargeUp);
		hideForLargeUp.add(new HideByScreenSizeBehavior(Model.of(HideByScreenSizeType.HIDE_FOR_LARGE_UP)));
		
		Label hideForLargeOnly = new Label("hideForLargeOnly", Model.of("You are not on a large screen."));
		hideByScreenSize.add(hideForLargeOnly);
		hideForLargeOnly.add(new HideByScreenSizeBehavior(Model.of(HideByScreenSizeType.HIDE_FOR_LARGE_ONLY)));
		
		Label hideForXlargeUp = new Label("hideForXlargeUp", Model.of("You are not on an xlarge screen and up."));
		hideByScreenSize.add(hideForXlargeUp);
		hideForXlargeUp.add(new HideByScreenSizeBehavior(Model.of(HideByScreenSizeType.HIDE_FOR_XLARGE_UP)));
		
		Label hideForXlargeOnly = new Label("hideForXlargeOnly", Model.of("You are not on an xlarge screen."));
		hideByScreenSize.add(hideForXlargeOnly);
		hideForXlargeOnly.add(new HideByScreenSizeBehavior(Model.of(HideByScreenSizeType.HIDE_FOR_XLARGE_ONLY)));
		
		Label hideForXxlargeUp = new Label("hideForXxlargeUp", Model.of("You are not on an xxlarge screen."));
		hideByScreenSize.add(hideForXxlargeUp);
		hideForXxlargeUp.add(new HideByScreenSizeBehavior(Model.of(HideByScreenSizeType.HIDE_FOR_XXLARGE_UP)));
		
		// orientation detection
		
		FoundationBorder orientationDetection = new FoundationBorder("orientationDetection");
		add(orientationDetection);
		
		Label showForLandscape = new Label("showForLandscape", Model.of("You are in landscape orientation."));
		orientationDetection.add(showForLandscape);
		showForLandscape.add(new ShowByOrientationBehavior(Model.of(ShowByOrientationType.SHOW_FOR_LANDSCAPE)));
		
		Label showForPortrait = new Label("showForPortrait", Model.of("You are in portrait orientation."));
		orientationDetection.add(showForPortrait);
		showForPortrait.add(new ShowByOrientationBehavior(Model.of(ShowByOrientationType.SHOW_FOR_PORTRAIT)));
		
		// touch detection
		
		FoundationBorder touchDetection = new FoundationBorder("touchDetection");
		add(touchDetection);
		
		Label showForTouch = new Label("showForTouch", Model.of("You are on a touch-enabled device."));
		touchDetection.add(showForTouch);
		showForTouch.add(new TouchDetectionBehavior(Model.of(TouchDetectionType.SHOW_FOR_TOUCH)));
		
		Label hideForTouch = new Label("hideForTouch", Model.of("You are not on a touch-enabled device."));
		touchDetection.add(hideForTouch);
		hideForTouch.add(new TouchDetectionBehavior(Model.of(TouchDetectionType.HIDE_FOR_TOUCH)));
		
		// accessibility - hidden by screen size
		
		FoundationBorder hiddenFor = new FoundationBorder("hiddenFor");
		add(hiddenFor);
		
		Label hiddenForSmallOnly = new Label("hiddenForSmallOnly", Model.of("You are not on a small screen."));
		hiddenFor.add(hiddenForSmallOnly);
		hiddenForSmallOnly.add(new HiddenByScreenSizeBehavior(Model.of(HiddenByScreenSizeType.HIDDEN_FOR_SMALL_ONLY)));
		
		Label hiddenForMediumUp = new Label("hiddenForMediumUp", Model.of("You are not on a medium, large, xlarge, or xxlarge screen."));
		hiddenFor.add(hiddenForMediumUp);
		hiddenForMediumUp.add(new HiddenByScreenSizeBehavior(Model.of(HiddenByScreenSizeType.HIDDEN_FOR_MEDIUM_UP)));
		
		Label hiddenForMediumOnly = new Label("hiddenForMediumOnly", Model.of("You are not on a medium screen."));
		hiddenFor.add(hiddenForMediumOnly);
		hiddenForMediumOnly.add(new HiddenByScreenSizeBehavior(Model.of(HiddenByScreenSizeType.HIDDEN_FOR_MEDIUM_ONLY)));
		
		Label hiddenForLargeUp = new Label("hiddenForLargeUp", Model.of("You are not on a large, xlarge, or xxlarge screen."));
		hiddenFor.add(hiddenForLargeUp);
		hiddenForLargeUp.add(new HiddenByScreenSizeBehavior(Model.of(HiddenByScreenSizeType.HIDDEN_FOR_LARGE_UP)));
		
		Label hiddenForLargeOnly = new Label("hiddenForLargeOnly", Model.of("You are not on a large screen."));
		hiddenFor.add(hiddenForLargeOnly);
		hiddenForLargeOnly.add(new HiddenByScreenSizeBehavior(Model.of(HiddenByScreenSizeType.HIDDEN_FOR_LARGE_ONLY)));
		
		Label hiddenForXlargeUp = new Label("hiddenForXlargeUp", Model.of("You are not on an xlarge screen and up."));
		hiddenFor.add(hiddenForXlargeUp);
		hiddenForXlargeUp.add(new HiddenByScreenSizeBehavior(Model.of(HiddenByScreenSizeType.HIDDEN_FOR_XLARGE_UP)));
		
		Label hiddenForXlargeOnly = new Label("hiddenForXlargeOnly", Model.of("You are not on an xlarge screen."));
		hiddenFor.add(hiddenForXlargeOnly);
		hiddenForXlargeOnly.add(new HiddenByScreenSizeBehavior(Model.of(HiddenByScreenSizeType.HIDDEN_FOR_XLARGE_ONLY)));
		
		Label hiddenForXxlargeUp = new Label("hiddenForXxlargeUp", Model.of("You are not on an xxlarge screen."));
		hiddenFor.add(hiddenForXxlargeUp);
		hiddenForXxlargeUp.add(new HiddenByScreenSizeBehavior(Model.of(HiddenByScreenSizeType.HIDDEN_FOR_XXLARGE_UP)));
		
		// accessibility - visible by screen size
		
		FoundationBorder visibleFor = new FoundationBorder("visibleFor");
		add(visibleFor);
		
		Label visibleForSmallOnly = new Label("visibleForSmallOnly", Model.of("This text is visible only on a small screen."));
		visibleFor.add(visibleForSmallOnly);
		visibleForSmallOnly.add(new VisibleForScreenSizeBehavior(Model.of(VisibleForScreenSizeType.VISIBLE_FOR_SMALL_ONLY)));
		
		Label visibleForMediumUp = new Label("visibleForMediumUp", Model.of("This text is visible on medium screens and up."));
		visibleFor.add(visibleForMediumUp);
		visibleForMediumUp.add(new VisibleForScreenSizeBehavior(Model.of(VisibleForScreenSizeType.VISIBLE_FOR_MEDIUM_UP)));
		
		Label visibleForMediumOnly = new Label("visibleForMediumOnly", Model.of("This text is visible only on a medium screen."));
		visibleFor.add(visibleForMediumOnly);
		visibleForMediumOnly.add(new VisibleForScreenSizeBehavior(Model.of(VisibleForScreenSizeType.VISIBLE_FOR_MEDIUM_ONLY)));
		
		Label visibleForLargeUp = new Label("visibleForLargeUp", Model.of("This text is visible on large screens and up."));
		visibleFor.add(visibleForLargeUp);
		visibleForLargeUp.add(new VisibleForScreenSizeBehavior(Model.of(VisibleForScreenSizeType.VISIBLE_FOR_LARGE_UP)));
		
		Label visibleForLargeOnly = new Label("visibleForLargeOnly", Model.of("This text is visible only on a large screen."));
		visibleFor.add(visibleForLargeOnly);
		visibleForLargeOnly.add(new VisibleForScreenSizeBehavior(Model.of(VisibleForScreenSizeType.VISIBLE_FOR_LARGE_ONLY)));
		
		Label visibleForXlargeUp = new Label("visibleForXlargeUp", Model.of("This text is visible on xlarge screens and up."));
		visibleFor.add(visibleForXlargeUp);
		visibleForXlargeUp.add(new VisibleForScreenSizeBehavior(Model.of(VisibleForScreenSizeType.VISIBLE_FOR_XLARGE_UP)));
		
		Label visibleForXlargeOnly = new Label("visibleForXlargeOnly", Model.of("This text is visible only on an xlarge screen."));
		visibleFor.add(visibleForXlargeOnly);
		visibleForXlargeOnly.add(new VisibleForScreenSizeBehavior(Model.of(VisibleForScreenSizeType.VISIBLE_FOR_XLARGE_ONLY)));
		
		Label visibleForXxlargeUp = new Label("visibleForXxlargeUp", Model.of("This text is visible on xxlarge screens and up."));
		visibleFor.add(visibleForXxlargeUp);
		visibleForXxlargeUp.add(new VisibleForScreenSizeBehavior(Model.of(VisibleForScreenSizeType.VISIBLE_FOR_XXLARGE_UP)));
		
	}

}
