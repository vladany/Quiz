package edu.fra.uas.security.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.fra.uas.conversation.service.ConversationUserService;
import edu.fra.uas.conversation.service.dto.ConversationDTO;
import edu.fra.uas.security.model.CurrentUser;
import edu.fra.uas.security.service.user.UserService;

@Controller
public class LoginController {

	private static final Logger log = LoggerFactory.getLogger(LoginController.class);
	
	 private UserService userService;

	private CurrentUser currentUser;


	    @Autowired
	    public ConversationController(UserService securityUserService, CurrentUser currentUser) {
	      
	        this.userService = securityUserService;
	        this.currentUser = currentUser;
	    }

	    @RequestMapping(value = "/first", method = {RequestMethod.POST, RequestMethod.GET})
	  public String firstPage(@RequestParam String email, @RequestParam String password, Model model) {
	      	log.debug("/first --> log in with email " + email + " and password " + password);
	          if (!userService.existsByEmail(email)) {
	          	log.debug("/first --> email was wrong!");
	              model.addAttribute("error","wrong login");
	              return "login";
	          }
	          if (!password.equals(userService.getUserByEmail(email).get().getPassword())) {
	          	log.debug("/first --> password was wrong!");
	              model.addAttribute("error","wrong login");
	              return "login";
	          }
	      }
	    
	@RequestMapping(value = { "/", "/login" }, method = RequestMethod.GET)
	public String getLoginPage(@RequestParam Optional<String> error, Model model) {
		log.debug("GET /login --> Welcome to SocialApp");
		return "login";
	}
	
	@RequestMapping(value = "logout", method = RequestMethod.POST)
	public String getLogout(Model model) {
		return "logout";
	}

}
