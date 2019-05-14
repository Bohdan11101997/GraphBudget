package com.university.services.impl;

import com.university.domain.Revenue;
import com.university.repositories.RevenueRepository;
import com.university.services.RevenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class RevenueServiceImpl  implements RevenueService {


    final private RevenueRepository revenueRepository;

    @Autowired
    public RevenueServiceImpl(RevenueRepository revenueRepository) {
        this.revenueRepository = revenueRepository;
    }

    public Double getValueAllRevenueByUnit(String name,LocalDate start_date, LocalDate end_date ){
        Double sum = 0.0;
        System.out.println(start_date);
        System.out.println(name);
        for (Revenue revenue : revenueRepository.getValueAllRevenueByUnit(name)) {
            LocalDate date = LocalDate.parse(revenue.getDate());

            if (date.isAfter(start_date) && date.isBefore(end_date)) {

                System.out.println("Ontology date: " +date );
                sum += revenue.getValue();
            }
            System.out.println("sum" + sum);
        }
        return sum;
    }
}
