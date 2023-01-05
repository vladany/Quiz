package edu.fra.uas.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.fra.uas.entity.User;
import edu.fra.uas.model.SignupForm;
import edu.fra.uas.repository.UserRepository;

@Controller
public class SignUpController {

	// autowire user repository
	 @Autowired
	 private UserRepository userRepo;
 
 // method to get signup page
 @GetMapping(path = "/signup")
 public String getSignupPage() {
  return "signup";
 }
 // method to submit signup

 @PostMapping(path="/signup")
 public String submitSignup(SignupForm signupForm) {
 
	 User user = null;
	 if(null != signupForm) {
	  user = new User(signupForm.getFirstName(), signupForm.getLastName(), signupForm.getEmailId(), signupForm.getPassword());
	 }
	 userRepo.save(user);
 return "signup-success";
	 }
 
 }