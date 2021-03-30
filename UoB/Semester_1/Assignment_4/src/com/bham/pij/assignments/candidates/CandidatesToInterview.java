package com.bham.pij.assignments.candidates;
// Zheng Biao 2133456

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CandidatesToInterview {

    tableBuilder builder = new tableBuilder();
    ArrayList<HashMap<String, Object>> list_local = builder.list;

    public void findCandidates() throws IOException {
        String[] keywordsDegree = {"Degree in Computer Science", "Masters in Computer Science"};
        String[] keywordsExperience = {"Data Analyst", "Programmer", "Computer programmer", "Operator"};

        BufferedReader reader = new BufferedReader(new FileReader
                ("G:\\Entrance\\Java Program\\Training & UoB\\UoB\\Assignment_4\\src\\com\\bham\\pij\\assignments\\candidates\\cleancv.txt"));

        BufferedWriter writer = new BufferedWriter(new FileWriter
                ("G:\\Entrance\\Java Program\\Training & UoB\\UoB\\Assignment_4\\src\\com\\bham\\pij\\assignments\\candidates\\to-interview.txt"));
        try {
            String clean;
            while ((clean = reader.readLine()) != null) {

                int counter = 0;

                for (String i : keywordsDegree) {
                    for (String j : keywordsExperience) {

                        if (clean.contains(i) && clean.contains(j) && counter == 0) {
                            String tsf = clean.replaceAll(",", " ");
                            StringBuilder output = new StringBuilder();
                            for (int k = 0; k < tsf.length() - 1; k++) {
                                output.append(tsf.charAt(k));
                            }
                            writer.write(String.valueOf(output));
                            writer.flush();
                            counter++;
                            writer.write("\n");
                            writer.flush();
                        }
                    }

                }
            }
        } catch (IOException ignored) {

        }

    }

    public void candidatesWithExperience() throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter
                ("G:\\Entrance\\Java Program\\Training & UoB\\UoB\\Assignment_4\\src\\com\\bham\\pij\\assignments\\candidates\\to-interview-experience.txt"));


        builder.Builder();


        for (HashMap<String, Object> i : list_local) {
            ArrayList<String> exp_len = (ArrayList<String>) i.get("Experience");

            try {
                for (String j : exp_len) {
                    if (Integer.parseInt(j) > 5) {
                        writer.write(i.get("Identifier") + " " + j);
                        writer.write("\n");
                        writer.flush();
                    }
                }
            } catch (NullPointerException ignored) {
            }
        }

    }

    public void createCSVFile() throws IOException {

        Object[] head =
                {"Identifier", "Qualification", "Position1", "Experience1", "Position2", "Experience2", "eMail"};

        List<Object> headList = Arrays.asList(head);

        ArrayList<ArrayList<Object>> data = new ArrayList<>();

        BufferedWriter writeText = new BufferedWriter(new FileWriter
                ("G:\\Entrance\\Java Program\\Training & UoB\\UoB\\Assignment_4\\src\\com\\bham\\pij\\assignments\\candidates\\to-interview-table-format.csv"));

        BufferedReader reader = new BufferedReader
                (new FileReader("G:\\Entrance\\Java Program\\Training & UoB\\UoB\\Assignment_4\\src\\com\\bham\\pij\\assignments\\candidates\\cleancv.txt"));

        String line;

        writeText.write(headList.toString().
                replaceAll("[\\[\\]]", "").
                replaceAll(", ", ","));

        writeText.flush();
        writeText.newLine();
        writeText.flush();

        while ((line = reader.readLine()) != null) {

            if (!line.contains("None")) {
                String[] dataList = line.split(",");

                ArrayList<String> tsf = new ArrayList<>(Arrays.asList(dataList));

                while (tsf.size() != 7) {
                    tsf.add(tsf.size() - 1, "");
                }

                writeText.write(tsf.toString().
                        replaceAll("[\\[\\]]", "").
                        replaceAll(", ", ","));

                writeText.flush();
                writeText.newLine();
                writeText.flush();
                tsf.clear();
            }
        }


        BufferedReader csvReader = new BufferedReader
                (new FileReader("G:\\Entrance\\Java Program\\Training & UoB\\UoB\\Assignment_4\\src\\com\\bham\\pij\\assignments\\candidates\\to-interview-table-format.csv"));
        String csvLine;

        while ((csvLine = csvReader.readLine()) != null) {

            String[] output = csvLine.split(",");
            for (int i = 0; i < output.length; i++) {
                if (i == 4 || i == 5) {
                } else {
                    switch (i) {
                        case 0:
                            System.out.print(output[i] + " ".repeat(12 - output[i].length()));
                            break;
                        case 2:
                            System.out.print(output[i] + " ".repeat(14 - output[i].length()));
                            break;
                        case 1:
                            System.out.print(output[i] + " ".repeat(35 - output[i].length()));
                            break;
                        case 3:
                            if (output[i].equals("Experience1")) {
                                System.out.print("Experience" + "");
                            } else {
                                if (output[i].length() == 1) {

                                    System.out.print(" ".repeat((10 - output[i].length()) / 2) +
                                            output[i] + " ".repeat((10 - output[i].length()) / 2 + 1));
                                } else {
                                    System.out.print(" ".repeat((10 - output[i].length()) / 2) +
                                            output[i] + " ".repeat((10 - output[i].length()) / 2));
                                }
                            }
                            break;
                        case 6:
                            System.out.print("  " + output[i] + " ".repeat(25 - output[i].length()));
                    }
                }
            }
            System.out.println();
        }

    }
}