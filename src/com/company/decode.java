package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Scanner;

public class decode {
    public static File[] getFiles() {
        File dir = new File("C:/Users/pring/IdeaProjects/datagetting/src/test");

        File[] matches = dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(".osu");
            }
        });
        return matches;
    }
    public static ArrayList<ArrayList> getData(File[] matches) {
        ArrayList<ArrayList> timings = new ArrayList<>();
        try {
            timings = new ArrayList<>();
            for (int i = 0; i < matches.length; i++) {
                Scanner sc = new Scanner(matches[i]).useDelimiter("\n\n");
                while (sc.hasNext()) {
                    final String lineFromFile = sc.nextLine();
                    if (lineFromFile.contains("[HitObjects]")) {
                        while (sc.hasNext()) {
                            String data = sc.nextLine();
                            Scanner scan = new Scanner(data).useDelimiter(",");
                            ArrayList<Integer> xyz = new ArrayList<Integer>();
                            for (int j = 0; j < 3; j++) {
                                xyz.add(scan.nextInt());
                            }
                            timings.add(xyz);
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return timings;
    }
}
