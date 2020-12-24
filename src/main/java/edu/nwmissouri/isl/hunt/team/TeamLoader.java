
package edu.nwmissouri.isl.hunt.team;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import reactor.core.publisher.Flux;

@Component
public class TeamLoader implements ApplicationRunner {

  private static final Logger log = LoggerFactory.getLogger(TeamLoader.class);
  private final TeamRepository repo;

  TeamLoader(final TeamRepository inRepo) {
    this.repo = inRepo;
  }

  @Override
  public void run(final ApplicationArguments args) {
    log.info("Team loader started with args " + args);
    if (repo.count().block() == 0L) {
      var reader = new BufferedReader(
          new InputStreamReader(getClass().getClassLoader().getResourceAsStream("teams.txt")));
      Flux.fromStream(reader.lines()
          .filter(line -> !line.trim().isEmpty())
          .map(line -> 
            repo.save(new Team(Integer.parseInt(line.split(",")[0]), line.split(",")[1]))
          )
      ).subscribe(m -> log.info("New team loaded: {}", m.block()));
      log.info("Repository contains {} entries.", repo.count().block());
    }
  }

}
