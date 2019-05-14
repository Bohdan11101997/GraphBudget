package com.university.domain;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
public class TerritorialUnit {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

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


    @Relationship(type = "RECEIVED")
    private List<Revenue> revenue;


    @Relationship(type = "CHILD")
    private List<TerritorialUnit> child;

    public List<Revenue> getRevenue() {
        return revenue;
    }

    public void setRevenue(List<Revenue> revenue) {
        this.revenue = revenue;
    }

    public List<TerritorialUnit> getChild() {
        return child;
    }

    public void setChild(List<TerritorialUnit> child) {
        this.child = child;
    }

    public List<TerritorialUnit> getParent() {
        return parent;
    }

    public void setParent(List<TerritorialUnit> parent) {
        this.parent = parent;
    }

    @Relationship(type = "PARENT", direction = Relationship.INCOMING)
    private List<TerritorialUnit> parent;



    public TerritorialUnit() {

    }

    public TerritorialUnit( String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TerritorialUnit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", revenue=" + revenue +
                ", child=" + child +
                ", parent=" + parent +
                '}';
    }
}
