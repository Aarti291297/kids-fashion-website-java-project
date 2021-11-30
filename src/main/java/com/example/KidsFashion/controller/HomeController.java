package com.example.KidsFashion.controller;

import javax.servlet.http.HttpSession;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.KidsFashion.entity.CheckoutData;
import com.example.KidsFashion.entity.ContactData;
import com.example.KidsFashion.entity.LoginData;
import com.example.KidsFashion.entity.LogoutData;
import com.example.KidsFashion.entity.UserData;
import com.example.KidsFashion.repository.CheckRepository;
import com.example.KidsFashion.repository.ContactRepository;
import com.example.KidsFashion.repository.UserRepository;



@Controller
public class HomeController {
	
	@Autowired
	private UserRepository repo;
	@Autowired
	private CheckRepository check;
	@Autowired
	private ContactRepository con;
	
	@GetMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/signup")
	public String signup()
	{
		return "signup";
	}
	
	@GetMapping("/about")
	public String about()
	{
		return "About";
	}
	
	@GetMapping("/cart")
	public String cart()
	{
		return "cart";
	}
	
	@GetMapping("/cloths")
	public String Cloths()
	{
		return "Cloths for girls";
	}
	
	@GetMapping("/boys")
	public String boys()
	{
		return "Cloths for boys";
	}
	
	
	@GetMapping("/fashion")
	public String fashion()
	{
		return "Fashion Accessories for kids";
	}
	
	
	
	@GetMapping("/bags")
	public String bags()
	{
		return "Bags";
	}
	
	@GetMapping("/caps&hats")
	public String capsandhats()
	{
		return "Caps&Hats";
	}
	
	
	@GetMapping("/0-2yrs")
	public String oneyrs()
	{
		return "0-2yrs";
	}
	
	@GetMapping("/3-7yrs")
	public String sevenyrs()
	{
		return "3-7yrs";
	}
	
	@GetMapping("/7-12yrs")
	public String twelveyrs()
	{
		return "7-12yrs";
	}
	
	@GetMapping("/12+yrs")
	public String twelveplus()
	{
		return "12+yrs";
	}
	
	@GetMapping("/liliput")
	public String liliput()
	{
		return "LILIPUT";
	}
	
	@GetMapping("/kapkids")
	public String kapkids()
	{
		return "KAPKIDS";
	}
	
	@GetMapping("/chicco")
	public String chicco()
	{
		return "CHICCO";
	}
	
	@GetMapping("/ruff")
	public String ruff()
	{
		return "RUFF";
	}
	
	@GetMapping("/checkout")
	public String checkout()
	{
		return "checkout";
	}
	
	@GetMapping("/checkoutnote")
	public String checkoutnote()
	{
		return "checkoutnote";
	}
	
	
	@PostMapping("/register")
	public String register(@ModelAttribute UserData u, HttpSession session)
	{
		System.out.println(u);
		
		repo.save(u);
		session.setAttribute("message", "User Register Successfully");
		
		
		return "redirect:/login";
	}
	
	@PostMapping("/checkoutpage")
	public String checkoutpage(@ModelAttribute CheckoutData c, HttpSession session)
	{
		System.out.println(c);
		
		check.save(c);
		session.setAttribute("message", "User Register Successfully");
		
		
		return "redirect:/checkoutnote";
	}
	
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute LoginData u, HttpSession session)
	{
		System.out.println(u);
		
		
		return "redirect:/home";
	}
	
	@PostMapping("/logout")
	public String logout(@ModelAttribute LogoutData u, HttpSession session)
	{
		System.out.println(u);
		
		
		return "redirect:/login";
	}
	
	@PostMapping("/contact")
	public String contact(@ModelAttribute ContactData u, HttpSession session)
	{
		con.save(u);
		session.setAttribute("message", "User Register Successfully");
		
		
		return "redirect:/home";
	}
	
}
