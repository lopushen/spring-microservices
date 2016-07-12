package com.lopushen.dao;

import com.lopushen.entity.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

/**
 * Created by i.lopushen on 11/07/2016.
 */

@Repository
@RestResource(path = "teams", rel = "team")
public interface TeamRepository extends CrudRepository<Team, Long>{
}
