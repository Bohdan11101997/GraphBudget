package com.university.services;

import java.time.LocalDate;

public interface RevenueService {

     Double getValueAllRevenueByUnit(String name, LocalDate start_date, LocalDate end_date);
}
