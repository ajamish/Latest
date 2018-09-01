package com.intv.resource.bundle;

import java.util.ListResourceBundle;

public class DemoBundle_fr_FR extends ListResourceBundle {
	
	static final Object[][] contents= {{"SIGN_IN"},{"SignIn"},
			{"USERNAME"},{"UserName"},
			{"PASSSWORD"},{"Password"}};

	
	@Override
	protected Object[][] getContents() {
		// TODO Auto-generated method stub
		return contents;
	}

}
