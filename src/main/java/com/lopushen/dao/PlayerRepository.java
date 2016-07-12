package com.lopushen.dao;

import com.lopushen.entity.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by i.lopushen on 12/07/2016.
 */
@RestResource(path = "players", rel = "player")
public interface PlayerRepository extends CrudRepository<Player, Long> {
}
