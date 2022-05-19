package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /*String zipFilePath = "X://My Documents//Downloads//test/1636008 Suzuyu - Euphorium.osz";
        String destDirectory = "C:/Users/RP211094/IdeaProjects/datagetting/src/test";
        UnzipUtility unzipper = new UnzipUtility();
        try {
            unzipper.unzip(zipFilePath, destDirectory);
        } catch (Exception ex) {
            ex.printStackTrace();
        }*/
        System.out.println(Arrays.toString(decode.getFiles()));
        System.out.println(decode.getData(decode.getFiles()));
    }
}
