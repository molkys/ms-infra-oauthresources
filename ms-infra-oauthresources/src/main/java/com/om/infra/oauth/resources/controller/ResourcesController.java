package com.om.infra.oauth.resources.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourcesController {

	@GetMapping("/hello")
	// @PreAuthorize => Validates whether the user has the given role prior to execute the code
	@PreAuthorize("hasRole('ROLE_USER')")
	public String hello() {
		return "hello";
	}
}
