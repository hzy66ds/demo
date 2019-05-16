package com.ivan.demo.main.myStudy.lambda;


import java.util.ArrayList;
import java.util.List;

public class lambdaTest {

    public static void main(String[] args) {

        List<Artist> allArtists = new ArrayList<>();

        Artist artist1 = new Artist();
        artist1.setOrigin("London");
        artist1.setName("name1");
        Artist artist2 = new Artist();
        artist2.setOrigin("New York");
        artist2.setName("name2");
        Artist artist3 = new Artist();
        artist3.setOrigin("San Fransisco");
        artist3.setName("name3");
        allArtists.add(artist1);
        allArtists.add(artist2);
        allArtists.add(artist3);

        allArtists.stream()
                .filter(artist -> {
                    System.out.println(artist.getName());
                    return artist.isFrom("London");
                })
        .count();
    }
}
