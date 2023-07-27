package com.mackerel.canse.controller;

import com.mackerel.canse.entity.inc.Footer;
import com.mackerel.canse.repository.inc.FooterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/footer")
@CrossOrigin(origins = { "http://localhost:4200"})
public class FooterController {

    @Autowired
    private FooterRepository footerRepository;

    @GetMapping("/")
    public Optional<Footer> getFooterContent(){
        return footerRepository.findById(1);
    }

    @PatchMapping("/edit")
    public Integer editFooterContent(@RequestBody Footer footer){
        return footerRepository.save(footer).getId();
    }

}
