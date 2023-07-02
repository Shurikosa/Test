package org.example;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    List <String> namesCity = new ArrayList<String>();
    public static void main(String[] args) {
        System.out.println("Hello!");

    }
    public void getNameFile() {
        try {
            namesCity = Files.readAllLines(Paths.get("city.txt"), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
