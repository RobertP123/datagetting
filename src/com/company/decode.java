package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.util.Scanner;

public class decode {
    public static File[] getFiles() {
        File dir = new File("C:/Users/RP211094/IdeaProjects/datagetting/src/test");

        File[] matches = dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(".osu");
            }
        });
        return matches;
    }
    public static String[] getData(File[] matches){
        try {
            for (int i = 0; i < matches.length; i++) {
                Scanner sc = new Scanner(matches[i]).useDelimiter("\n\n");
                while (sc.hasNext()) {
                    final String lineFromFile = sc.nextLine();
                    if (lineFromFile.contains("[HitObjects]")) {
                        while(sc.hasNext()) {
                            String data = sc.nextLine();

                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String[] timings = {"uwu"};
        return timings;
    }
}
