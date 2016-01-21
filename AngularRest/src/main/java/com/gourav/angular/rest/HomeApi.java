package com.gourav.angular.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gourav.angular.model.User;

@RestController
public class HomeApi {

	@Autowired
	User user;

	@RequestMapping(value = "/getUser", method = RequestMethod.GET, produces = {
			"application/xml", "application/json" })
	public User getUser() {
		User user = new User();
		user.setAddress("talwara");
		user.setEmail("test@test.com");
		user.setMobile("8978455612");
		user.setName("Gourav");
		user.setPincode(1224566);
		return user;
	}

}
