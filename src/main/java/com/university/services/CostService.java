package com.university.services;

import java.time.LocalDate;

public interface CostService {

    Double getValueAllCostByUnit(String name, LocalDate start_date, LocalDate end_date);

}
