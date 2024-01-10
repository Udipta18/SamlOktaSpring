package com.example.samlxml.samlxml;

import org.apache.commons.httpclient.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConMain {
	
	
	
	
	  @RequestMapping("/") public String index_copy() { return "index"; }
	  
	  @GetMapping(value = "/auth/copy") public String handleSamlAuth_Copy() {
	  Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	  if (auth != null) { return "home"; } else { return "/"; } }
	  
	  @RequestMapping("/home") public String home_copy(Model model) {
	  Authentication authentication =
	  SecurityContextHolder.getContext().getAuthentication();
	  model.addAttribute("username", authentication.getPrincipal()); return "home";
	  }
	 
	
		/*
		 * @RequestMapping("/none") public String index() { return "index"; }
		 * 
		 * @GetMapping(value = "/auth") public String handleSamlAuth() { Authentication
		 * auth = SecurityContextHolder.getContext().getAuthentication(); if (auth !=
		 * null) { return "redirect:/home"; } else { return "/"; } }
		 * 
		 * @GetMapping("/auth/home") public String home(Model model) { Authentication
		 * authentication = SecurityContextHolder.getContext().getAuthentication();
		 * model.addAttribute("username", authentication.getPrincipal()); return
		 * "redirect:/home"; }
		 * 
		 * @PostMapping("/auth/home/post") public ResponseEntity<String> homePost() {
		 * 
		 * return ResponseEntity.ok("Hello World!"); }
		 */
	
	
	/*
	 * @RequestMapping("/saml/sso/okta") public String homeSaml(Model model) {
	 * Authentication authentication =
	 * SecurityContextHolder.getContext().getAuthentication();
	 * model.addAttribute("username", authentication.getPrincipal()); return "home";
	 * }
	 */
	 
	 
}
