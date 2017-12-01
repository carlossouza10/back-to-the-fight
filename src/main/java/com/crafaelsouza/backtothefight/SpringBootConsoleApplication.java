package com.crafaelsouza.backtothefight;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner {

    public static void main(String[] args) throws Exception {
    	SpringApplication app = new SpringApplication(SpringBootConsoleApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

    //access command line arguments
    @Override
    public void run(String... args) throws Exception {

        //do something

    }
}