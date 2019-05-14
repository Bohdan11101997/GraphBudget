package com.university.repositories;

import com.university.domain.Cost;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface CostRepository extends Neo4jRepository<Cost, Long> {


    @Query("MATCH (t:TerritorialUnit {name: 'Ukraine' } )-[:PARENT*1..15]->(p)-[:PAY]-(c:Cost)  RETURN t,p,c")
    Collection<Cost> getAllCostUnit(@Param("territorialUnit") String territorialUnit);
}
