package com.iluwatar;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.iluwatar.foundation.behavior.ShowByScreenSizeBehavior;
import com.iluwatar.foundation.behavior.ShowByScreenSizeBehavior.ShowByScreenSizeType;

public class VisibilityPage extends BasePage {

	private static final long serialVersionUID = 1L;

	public VisibilityPage(PageParameters params) {
		super(params);
		
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
	}

}
