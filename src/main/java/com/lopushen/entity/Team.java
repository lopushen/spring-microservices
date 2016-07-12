package com.lopushen.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by i.lopushen on 11/07/2016.
 */
@Entity
public class Team {
    @GeneratedValue
    @Id
    private Long id;
    private String name;
    private String location;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Player> players;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
}
