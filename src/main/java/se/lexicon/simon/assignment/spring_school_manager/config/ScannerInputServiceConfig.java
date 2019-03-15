package se.lexicon.simon.assignment.spring_school_manager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import se.lexicon.simon.assignment.spring_school_manager.data_access.StudentDao;
import se.lexicon.simon.assignment.spring_school_manager.data_access.StudentDaoListImpl;
import se.lexicon.simon.assignment.spring_school_manager.service.*;


@Configuration
public class ScannerInputServiceConfig {
	
	@Bean
	public UserInputService scannerInputService() {
		return new ScannerInputService();
	}
	
	@Bean
	public StudentDao studentDaoListImpl() {
		return new StudentDaoListImpl(scannerInputService());
		
	}

}
