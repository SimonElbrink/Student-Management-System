package se.lexicon.simon.assignment.spring_school_manager.service;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class ScannerInputService implements UserInputService {
	
	
	private Scanner scanner;

	public ScannerInputService() {
		System.out.println("ScannerInputService: Inside Constructor");
	}

	@Override
	public String getString() {
		return null;
	}

	@Override
	public int getInt() {
		// TODO Auto-generated method stub
		return 0;
	}

}
