package com.university.domain;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Revenue {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Double value;



    private String start_date;

    public String getDate() {
        return start_date;
    }

    public void setDate(String start_date) {
        this.start_date = start_date;
    }


    public Revenue( String name) {
        this.name = name;
    }

    public Revenue() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Revenue{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", value=" + value +
                ", start_date='" + start_date + '\'' +
                '}';
    }

}
