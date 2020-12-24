package edu.nwmissouri.isl.hunt.team;

import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class TeamController {

  private TeamRepository teamRepository;

  public TeamController(TeamRepository inRepo) {
    this.teamRepository = inRepo;
  }

  @GetMapping("/team")
  public Flux<Team> getTeamFlux() {
    return teamRepository.findAll();
  }

  @GetMapping("/team-paged")
  public Flux<Team> getTeamFlux(final @RequestParam(name = "page") int page,
      final @RequestParam(name = "size") int size) {
    return teamRepository.findAllByIdNotNullOrderByIdAsc(PageRequest.of(page, size));
  }

  @GetMapping("/team/{id}")
  public Mono<ResponseEntity<Team>> getTeamMono(@PathVariable(value = "id") int id) {
      return teamRepository.findById(id)
      .map(savedTeam -> ResponseEntity.ok(savedTeam))
      .defaultIfEmpty(ResponseEntity.notFound().build());
  }

}
