package himedia.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import himedia.hellospring.vo.UserVo;

@Controller
@RequestMapping("/users")
public class UsersController {
	// GET - /users/join
//	@RequestMapping(value={"/", "/join"}, method=RequestMethod.GET)
	@GetMapping({"/", "/join"})
	public String joinform() {
		return "/WEB-INF/views/users/joinform.jsp";
	}
	// POST - /users/join -> /users/joinsuccess redirect
	
//	@RequestMapping(value="/join", method=RequestMethod.GET)
	@PostMapping("/join")
	public String joinAction(@ModelAttribute UserVo vo) {
		System.out.println("FORM DATA:" + vo);
		// view 이름 대신에 redirect
		return "redirect:/users/joinsuccess";
	}
	// GET - /users/joinsuccess
	@GetMapping("/joinsuccess")
	public String joinsuccess() {
		return "/WEB-INF/views/users/joinsuccess.jsp";
	}
	

}
