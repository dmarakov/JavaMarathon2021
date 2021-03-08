package day12.task4;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("John");
        members1.add("Paul");
        members1.add("Leo");

        List<String> members2 = new ArrayList<>();
        members2.add("Sasha");
        members2.add("Misha");
        members2.add("Serega");

        MusicBand band1 = new MusicBand("Scorpions", 1970, members1);
        MusicBand band2 = new MusicBand("Deep Purple",1980,members2);

        band1.printMembers();
        band2.printMembers();
        MusicBand.transferMembers(band1,band2);
        band1.printMembers();
        band2.printMembers();

    }
}
