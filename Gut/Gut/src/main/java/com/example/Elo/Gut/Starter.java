package com.example.Elo.Gut;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {
        System.out.print("Dobry day");
    }
}
