package com.lopushen.controller;

import com.lopushen.dao.TeamRepository;
import com.lopushen.entity.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by i.lopushen on 11/07/2016.
 */
@RestController
public class TeamController {

    @Autowired
    private TeamRepository teamRepository;

    @RequestMapping("teams")
    public Iterable<Team> getTeams() {
        return teamRepository.findAll();
    }


    @PostConstruct
    public void init() {
        List<Team> list = new ArrayList<>();

        Team team = new Team();
        team.setLocation("Harlem");
        team.setName("Globetrotters");
        list.add(team);

        team = new Team();
        team.setLocation("Washington");
        team.setName("Generals");
        list.add(team);

        teamRepository.save(list);
    }
}
