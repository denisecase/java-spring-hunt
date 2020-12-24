package edu.nwmissouri.isl.hunt.team;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TeamRepository extends ReactiveSortingRepository<Team, String>  {

    Flux<Team> findAllById();
    Flux<Team> findAllByIdNotNullOrderByIdAsc(final Pageable page);
    Mono<Team> findById(int id);
 
}