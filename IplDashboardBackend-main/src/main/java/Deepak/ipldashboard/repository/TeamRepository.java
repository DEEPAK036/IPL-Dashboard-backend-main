package Deepak.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import Deepak.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>  {

    Team findByTeamName(String teamName);
    
}
