package com.intv.resource.bundle;

import java.util.ListResourceBundle;

public class DemoBundle_en_US extends ListResourceBundle {
	static final Object[][] contents= {{"SIGN_IN", "SignIn"},
										{"USERNAME", "UserName"},
										{"PASSWORD", "Password"}};
	@Override
	protected Object[][] getContents() {
		// TODO Auto-generated method stub
		return contents;
	}

}
