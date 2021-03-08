package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("John",20));
        members1.add(new MusicArtist("Paul",23));
        members1.add(new MusicArtist("Leo",30));

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Sasha",40));
        members2.add(new MusicArtist("Misha",50));
        members2.add(new MusicArtist("Serega",60));

        MusicBand band1 = new day12.task5.MusicBand("Scorpions", 1970,members1);
        MusicBand band2 = new day12.task5.MusicBand("Deep Purple",1980,members2);

        band1.printMembers();
        band2.printMembers();
        MusicBand.transferMembers(band1,band2);
        band1.printMembers();
        band2.printMembers();

    }
}
