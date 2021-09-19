package com.trabalho;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Poobd2007Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Poobd2007Application.class).headless(false).run(args);
    }
}