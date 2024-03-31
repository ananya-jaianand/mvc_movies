package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.demo.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @Autowired
    MovieService movieService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("movies",movieService.getAllMovie());
        return "home";
    }

    @PostMapping("/rate")
    public String rate(@RequestParam("movieId") Long Id,@RequestParam("rating") Double rating) {
        movieService.rateMovie(Id, rating);
        return "redirect:/";
    }
    
}
