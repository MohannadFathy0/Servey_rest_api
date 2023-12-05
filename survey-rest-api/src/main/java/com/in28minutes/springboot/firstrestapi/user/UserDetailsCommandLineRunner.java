package com.in28minutes.springboot.firstrestapi.user;

import org.slf4j.Logger;
import java.util.List;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsCommandLineRunner implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	private UserDetailsRepository repository;

	public UserDetailsCommandLineRunner(UserDetailsRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public void run(String... args) throws Exception {

		repository.save(new UserDetails("Mohannad", "Admin"));
		repository.save(new UserDetails("Fathy", "User"));

		List<UserDetails> users = repository.findByRole("Admin");
		users.forEach(user -> logger.info(user.toString()));
	}

}
