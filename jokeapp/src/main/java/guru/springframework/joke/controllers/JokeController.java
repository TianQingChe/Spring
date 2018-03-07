package guru.springframework.joke.controllers;

import guru.springframework.joke.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    @Value("${guru.jms.username}")
    private String name;
    public String showName(){
        return name;
    }
    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model){
       model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";
    }
}
