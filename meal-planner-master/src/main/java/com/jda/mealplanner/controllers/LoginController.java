package com.jda.mealplanner.controllers;
//Separation of Concerns design principles 
import java.net.URI;
import java.util.List;
import java.util.Optional;
import com.jda.mealplanner.model.Login;
import com.jda.mealplanner.repository.LoginRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.jda.mealplanner.model.Login;
import com.jda.mealplanner.spoonacular.service.LoginService;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class LoginController {
    @Autowired
    private LoginService Service;

    @GetMapping("/register")
    public String add(Model model) {
        model.addAttribute("Login", new Login());
        return "register";
    }

    @RequestMapping(value = "/save-reg", method = RequestMethod.POST)
    public String saveSong(@ModelAttribute("Login") Login lng) {
        Service.save(lng);
        return "redirect:/";
    }


    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
    
        Optional<Login> login = Service.findByUsername(username);
        if (login.isPresent() && login.get().getPassword().equals(password)) {
            return "redirect:/planning";
        } else {
            return "login";
        }
    }
    
	@GetMapping("/logout")
	public String logout(Model model) {
		return "redirect:http://localhost:8083/";
	}
	
    @GetMapping("/")
    public String ViewFirstPage() {
        return "login";
    }

    @GetMapping("/about")
    public String ViewInfoPage() {
        return "about";
    }


}
