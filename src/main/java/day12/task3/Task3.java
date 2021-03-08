package day12.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        MusicBand band1 = new MusicBand("Hello1", 1980);
        MusicBand band2 = new MusicBand("Hello2", 2010);
        MusicBand band3 = new MusicBand("Hello3", 1982);
        MusicBand band4 = new MusicBand("Hello4", 2001);
        MusicBand band5 = new MusicBand("Hello5", 1977);
        MusicBand band6 = new MusicBand("Hello6", 2018);
        MusicBand band7 = new MusicBand("Hello7", 1965);
        MusicBand band8 = new MusicBand("Hello8", 2016);
        MusicBand band9 = new MusicBand("Hello9", 2006);
        MusicBand band10 = new MusicBand("Hello10", 1999);

        List<MusicBand> bands = new ArrayList<>();
        bands.add(band1);
        bands.add(band2);
        bands.add(band3);
        bands.add(band4);
        bands.add(band5);
        bands.add(band6);
        bands.add(band7);
        bands.add(band8);
        bands.add(band9);
        bands.add(band10);
        Collections.shuffle(bands);
        System.out.println(bands);
        System.out.println(groupsAfter2000(bands));


//        for (MusicBand band : bands) {
//            if (band.getYear() > 2000) {
//                musicBandsAfter2000.add(band);
//            }
//        }

    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> musicBandsAfter2000 = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000) {
                musicBandsAfter2000.add(band);
            }
        }
        return musicBandsAfter2000;




    }

}



