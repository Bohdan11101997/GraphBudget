package com.university.controller;

import com.university.services.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cost")
public class CostController {

    final private CostService costService;

    @Autowired
    public CostController(CostService costService) {
        this.costService = costService;
    }

}
