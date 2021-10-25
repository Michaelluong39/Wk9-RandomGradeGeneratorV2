package com.company.controllers;

import com.company.views.Requests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static String studentName;
    public static String name;
    public static Requests view;

    public static void main(String[] args) {
        view = new Requests();
        // call file
        String dirString = "C:\\Users\\xkeit\\OneDrive\\Desktop\\CISP401(v2)" +
                "\\Wk9 - Random Grade Generator v2 (HW)\\src\\com\\company\\GradeBook";


        //create directory, access file directory
        Path dirPath = Paths.get(dirString);
        Path filePath = Paths.get(dirString);
        File students = filePath.toFile();

/*
        System.out.println("File name : " + filePath.getFileName());
        System.out.println("Absoulte path:" + filePath.toAbsolutePath());
        System.out.println("Is writeable: " + Files.isWritable(filePath));

 */


        //file reader class
        /*
            try {
                BufferedReader in = new BufferedReader(
                        new FileReader(gradeBook));
                List<String> lines = new ArrayList<String>();
                String line = null;
                while ((line = in.readline()) != null){
                    lines.add(line);
                }
                try {
                    String line = in.readLine();
                    System.out.println(line);
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

         */
        //display files
        String dirString2 = "C:\\Users\\xkeit\\OneDrive\\Desktop\\CISP401(v2)\\" +
                "Wk9 - Random Grade Generator v2 (HW)\\src\\com\\company\\GradeBook\\";
        Path dirPath2 = Paths.get(dirString2);
        if (Files.exists(dirPath2) && Files.isDirectory(dirPath2)) {
            System.out.println("Directory: " + dirPath2.toAbsolutePath());
            System.out.println("Files: ");
            try {
                DirectoryStream<Path> dirStream2 = Files.newDirectoryStream(dirPath2); //directory list for Path
                for (Path p : dirStream2) { //loops a directory listing
                    if (Files.isRegularFile(p)) {
                        String fileName = p.getFileName().toString();   //convert pathname to string
                        //eliminates file extension
                        int pos = fileName.lastIndexOf(".");
                        if (pos > 0) {
                            fileName = fileName.substring(0, pos);
                        }
                        System.out.print(fileName + " ");

                        try {
                            BufferedReader in = new BufferedReader(
                                                 new FileReader(dirString2 + p.getFileName().toString()));
                            try {
                                String line;
                                while ((line = in.readLine()) != null) {
                                    System.out.println(line);
                                }
                                in.close();
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        studentName = nameRequest();
        /*
        //class for reading file
        reader readFile = new reader();
        String filename= "C:\\Users\\xkeit\\OneDrive\\Desktop\\CISP401(v2)\\" +
                "Wk9 - Random Grade Generator v2 (HW)\\src\\com\\company\\GradeBook"
        try {
            String[] lines = readFile.readLines(filename);
            for (String line : lines){
                System.out.println(line);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        }

         */

    }

    private static String nameRequest() {
        name = view.callName();
        return name;
    }
}
