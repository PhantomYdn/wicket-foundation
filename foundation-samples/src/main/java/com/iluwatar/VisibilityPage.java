package com.iluwatar;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.iluwatar.foundation.behavior.HideByScreenSizeBehavior;
import com.iluwatar.foundation.behavior.HideByScreenSizeBehavior.HideByScreenSizeType;
import com.iluwatar.foundation.behavior.ShowByOrientationBehavior;
import com.iluwatar.foundation.behavior.ShowByOrientationBehavior.ShowByOrientationType;
import com.iluwatar.foundation.behavior.ShowByScreenSizeBehavior;
import com.iluwatar.foundation.behavior.ShowByScreenSizeBehavior.ShowByScreenSizeType;

public class VisibilityPage extends BasePage {

	private static final long serialVersionUID = 1L;

	public VisibilityPage(PageParameters params) {
		super(params);
		
		// show by screen size
		
		Label showForSmallOnly = new Label("showForSmallOnly", Model.of("This text is shown only on a small screen."));
		add(showForSmallOnly);
		showForSmallOnly.add(new ShowByScreenSizeBehavior(Model.of(ShowByScreenSizeType.SHOW_FOR_SMALL_ONLY)));
		
		Label showForMediumUp = new Label("showForMediumUp", Model.of("This text is shown on medium screens and up."));
		add(showForMediumUp);
		showForMediumUp.add(new ShowByScreenSizeBehavior(Model.of(ShowByScreenSizeType.SHOW_FOR_MEDIUM_UP)));
		
		Label showForMediumOnly = new Label("showForMediumOnly", Model.of("This text is shown only on a medium screen."));
		add(showForMediumOnly);
		showForMediumOnly.add(new ShowByScreenSizeBehavior(Model.of(ShowByScreenSizeType.SHOW_FOR_MEDIUM_ONLY)));
		
		Label showForLargeUp = new Label("showForLargeUp", Model.of("This text is shown on large screens and up."));
		add(showForLargeUp);
		showForLargeUp.add(new ShowByScreenSizeBehavior(Model.of(ShowByScreenSizeType.SHOW_FOR_LARGE_UP)));
		
		Label showForLargeOnly = new Label("showForLargeOnly", Model.of("This text is shown only on a large screen."));
		add(showForLargeOnly);
		showForLargeOnly.add(new ShowByScreenSizeBehavior(Model.of(ShowByScreenSizeType.SHOW_FOR_LARGE_ONLY)));
		
		Label showForXlargeUp = new Label("showForXlargeUp", Model.of("This text is shown on xlarge screens and up."));
		add(showForXlargeUp);
		showForXlargeUp.add(new ShowByScreenSizeBehavior(Model.of(ShowByScreenSizeType.SHOW_FOR_XLARGE_UP)));
		
		Label showForXlargeOnly = new Label("showForXlargeOnly", Model.of("This text is shown only on an xlarge screen."));
		add(showForXlargeOnly);
		showForXlargeOnly.add(new ShowByScreenSizeBehavior(Model.of(ShowByScreenSizeType.SHOW_FOR_XLARGE_ONLY)));
		
		Label showForXxlargeUp = new Label("showForXxlargeUp", Model.of("This text is shown on xxlarge screens and up."));
		add(showForXxlargeUp);
		showForXxlargeUp.add(new ShowByScreenSizeBehavior(Model.of(ShowByScreenSizeType.SHOW_FOR_XXLARGE_UP)));
		
		// hide by screen size
		
		Label hideForSmallOnly = new Label("hideForSmallOnly", Model.of("You are not on a small screen."));
		add(hideForSmallOnly);
		hideForSmallOnly.add(new HideByScreenSizeBehavior(Model.of(HideByScreenSizeType.HIDE_FOR_SMALL_ONLY)));
		
		Label hideForMediumUp = new Label("hideForMediumUp", Model.of("You are not on a medium, large, xlarge, or xxlarge screen."));
		add(hideForMediumUp);
		hideForMediumUp.add(new HideByScreenSizeBehavior(Model.of(HideByScreenSizeType.HIDE_FOR_MEDIUM_UP)));
		
		Label hideForMediumOnly = new Label("hideForMediumOnly", Model.of("You are not on a medium screen."));
		add(hideForMediumOnly);
		hideForMediumOnly.add(new HideByScreenSizeBehavior(Model.of(HideByScreenSizeType.HIDE_FOR_MEDIUM_ONLY)));
		
		Label hideForLargeUp = new Label("hideForLargeUp", Model.of("You are not on a large, xlarge, or xxlarge screen."));
		add(hideForLargeUp);
		hideForLargeUp.add(new HideByScreenSizeBehavior(Model.of(HideByScreenSizeType.HIDE_FOR_LARGE_UP)));
		
		Label hideForLargeOnly = new Label("hideForLargeOnly", Model.of("You are not on a large screen."));
		add(hideForLargeOnly);
		hideForLargeOnly.add(new HideByScreenSizeBehavior(Model.of(HideByScreenSizeType.HIDE_FOR_LARGE_ONLY)));
		
		Label hideForXlargeUp = new Label("hideForXlargeUp", Model.of("You are not on an xlarge screen and up."));
		add(hideForXlargeUp);
		hideForXlargeUp.add(new HideByScreenSizeBehavior(Model.of(HideByScreenSizeType.HIDE_FOR_XLARGE_UP)));
		
		Label hideForXlargeOnly = new Label("hideForXlargeOnly", Model.of("You are not on an xlarge screen."));
		add(hideForXlargeOnly);
		hideForXlargeOnly.add(new HideByScreenSizeBehavior(Model.of(HideByScreenSizeType.HIDE_FOR_XLARGE_ONLY)));
		
		Label hideForXxlargeUp = new Label("hideForXxlargeUp", Model.of("You are not on an xxlarge screen."));
		add(hideForXxlargeUp);
		hideForXxlargeUp.add(new HideByScreenSizeBehavior(Model.of(HideByScreenSizeType.HIDE_FOR_XXLARGE_UP)));
		
		// orientation detection
		
		Label showForLandscape = new Label("showForLandscape", Model.of("You are in landscape orientation."));
		add(showForLandscape);
		showForLandscape.add(new ShowByOrientationBehavior(Model.of(ShowByOrientationType.SHOW_FOR_LANDSCAPE)));
		
		Label showForPortrait = new Label("showForPortrait", Model.of("You are in portrait orientation."));
		add(showForPortrait);
		showForPortrait.add(new ShowByOrientationBehavior(Model.of(ShowByOrientationType.SHOW_FOR_PORTRAIT)));
		
	}

}
