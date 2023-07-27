package com.mackerel.canse.controller;

import com.mackerel.canse.entity.inc.Header;
import com.mackerel.canse.repository.inc.HeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/header/")
@CrossOrigin(origins = { "http://localhost:4200"})
public class HeaderController {

    @Autowired
    private HeaderRepository headerRepository;

    @GetMapping("/")
    public Optional<Header> getHeaderContent(){
        return headerRepository.findById(1);
    }

    @PatchMapping("/edt")
    public Integer editHeaderContent(@RequestBody Header header){
        return headerRepository.save(header).getId();
    }

}
