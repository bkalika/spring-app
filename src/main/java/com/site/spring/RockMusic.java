package com.site.spring;

import org.springframework.stereotype.Component;

//@Component("musicBean")
//@Component
public class RockMusic implements Music {

	@Override
	public String getSong() {
		return "Wind cries Mary";
	}

}
