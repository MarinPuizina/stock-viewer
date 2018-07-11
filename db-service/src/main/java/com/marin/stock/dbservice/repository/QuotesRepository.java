package com.marin.stock.dbservice.repository;

import com.marin.stock.dbservice.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuotesRepository extends JpaRepository<Quote, Integer> {
}
