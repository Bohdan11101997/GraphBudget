package com.university.controller;


import com.university.services.TerritorialUnitService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
@RequestMapping("/territorialUnit")
public class TerritorialUnitController {


    private TerritorialUnitService territorialUnitService;


    @GetMapping(value = "/findTerritorialUnitByName")
    public String ewrwr() {
        return "index";
    }

    @PostMapping(value = "/findTerritorialUnitByName")
    public String findBySearchTerm(@RequestParam String name,
                                   @RequestParam(name = "start_date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate start_date,
                                   @RequestParam(name = "end_date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate end_date,
                                   Model model) {
        model.addAttribute("budgetAnalyze", territorialUnitService.getAnalyzeBudget(name, start_date, end_date));
        System.out.println(territorialUnitService.getAnalyzeBudget(name, start_date, end_date));
        return "index";
    }

}
