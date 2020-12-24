package edu.nwmissouri.isl.hunt;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.nwmissouri.isl.hunt.home.HomeController;
import edu.nwmissouri.isl.hunt.team.TeamController;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private HomeController homeController;

	@Autowired
	private TeamController teamController;


	@Test
	public void contextLoads() {
		assertThat(homeController).isNotNull();
		assertThat(teamController).isNotNull();
	}

}
