package com.laotapo.service.hystric;

import org.springframework.stereotype.Component;

import com.laotapo.service.SchedualServiceHi;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry "+name;
	}

}
