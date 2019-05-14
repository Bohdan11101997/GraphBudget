package com.university.controller;


import com.university.domain.Revenue;
import com.university.repositories.RevenueRepository;
import com.university.services.RevenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
@RequestMapping("/")
public class RevenueController {

    final private
    RevenueService revenueService;

    @Autowired
    RevenueRepository revenueRepository ;

    @Autowired
    public RevenueController(RevenueService revenueService) {
        this.revenueService = revenueService;
    }

    @GetMapping("/all3")
    public Collection<Revenue> getall() {
        String name = "Ukraine";
        return revenueRepository.getAll();
    }


}
