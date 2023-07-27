package com.mackerel.canse.controller;

import com.mackerel.canse.repository.home.HomeRepository;
import com.mackerel.canse.repository.inc.FooterRepository;
import com.mackerel.canse.repository.inc.HeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = { "http://localhost:4200"})
public class AdminController {

    @Autowired
    private HeaderRepository headerRepository;

    @Autowired
    private HomeRepository homeRepository;

    @Autowired
    private FooterRepository footerRepository;

    @GetMapping("/")
    public List<Optional<Object>> getAllContent(){
        List<Optional<Object>> allContent = new ArrayList<>();
        allContent.add(Optional.of(headerRepository.findById(1)));
        allContent.add(Optional.of(homeRepository.findById(1)));
        allContent.add(Optional.of(footerRepository.findById(1)));
        return allContent ;
    }


}
