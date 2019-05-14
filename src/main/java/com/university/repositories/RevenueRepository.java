package com.university.repositories;

import com.university.domain.Revenue;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;


public interface RevenueRepository extends Neo4jRepository<Revenue, Long> {

    @Query("MATCH (m:TerritorialUnit {name: 'Ukraine' } )-[:PARENT*1..15]->(r)<-[:RECEIVED]-(e:Revenue)  RETURN m,r,e")
    Collection<Revenue> getValueAllRevenueByUnit(@Param("territorialUnit") String territorialUnit);

    @Query("MATCH (n) RETURN n LIMIT 25")
    Collection<Revenue> getAll();

}
