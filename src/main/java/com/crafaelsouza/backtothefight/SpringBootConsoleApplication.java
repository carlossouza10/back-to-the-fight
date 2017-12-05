package com.crafaelsouza.backtothefight;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.crafaelsouza.backtothefight.domain.model.GameFlow;
import com.crafaelsouza.backtothefight.domain.service.FlowService;

@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner {

	@Autowired
	private FlowService flowService;
	
    public static void main(String[] args) throws Exception {
    	SpringApplication app = new SpringApplication(SpringBootConsoleApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

    //access command line arguments
    @Override
    public void run(String... args) throws Exception {
		Scanner scanner = null;
		while (true) {
			GameFlow gameFlow = flowService.startGameFlow();

			scanner = new Scanner(System.in);
			System.out.print(gameFlow.getQuestion() + "\n" + gameFlow.getOptions().toString());
			String option = scanner.nextLine();
			System.out.println(option);

		}
    }
}