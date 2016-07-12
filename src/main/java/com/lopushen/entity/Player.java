package com.lopushen.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by i.lopushen on 12/07/2016.
 */
@Entity
public class Player {
    @GeneratedValue
    @Id
    private Long id;
    private String name;
    private String position;

    public Player() {
    }

    public Player(String name, String position) {
        this.name = name;
        this.position = position;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
