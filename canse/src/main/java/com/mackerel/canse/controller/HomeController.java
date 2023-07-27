package com.mackerel.canse.controller;

import com.mackerel.canse.entity.home.Home;
import com.mackerel.canse.repository.home.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/home")
@CrossOrigin(origins = { "http://localhost:4200"})
public class HomeController {


    @Autowired
    private HomeRepository homeRepository;

    @GetMapping("/")
    public Optional<Home> getHomeContent(){
        return homeRepository.findById(1);
    }

    @PatchMapping("/edit")
    public Integer editHomeContent(@RequestBody Home home){
        return homeRepository.save(home).getId();
    }

}
