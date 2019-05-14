package com.university.services.impl;

import com.university.repositories.TerritorialUnitRepository;
import com.university.services.CostService;
import com.university.services.RevenueService;
import com.university.services.TerritorialUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class TerritorialUnitServiceImpl implements TerritorialUnitService {

    private TerritorialUnitRepository territorialUnitRepository;
    private CostService costService;
    private RevenueService revenueService;



    @Autowired
    public TerritorialUnitServiceImpl(TerritorialUnitRepository territorialUnitRepository, CostService costService, RevenueService revenueService) {
        this.territorialUnitRepository = territorialUnitRepository;
        this.costService = costService;
        this.revenueService = revenueService;
    }


    @Override
    public Double getAnalyzeBudget(String name, LocalDate start_date, LocalDate end_date) {

        return (costService.getValueAllCostByUnit(name, start_date, end_date )/revenueService.getValueAllRevenueByUnit(name, start_date, end_date))*100 ;
    }
}
