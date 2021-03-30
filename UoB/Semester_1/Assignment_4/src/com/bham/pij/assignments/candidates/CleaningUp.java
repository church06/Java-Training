package com.bham.pij.assignments.candidates;
// Zheng Biao 2133456

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class CleaningUp {

    private final String[] titles = {"Identifier", "Qualification", "Position", "Experience", "eMail"};
    private ArrayList<HashMap<String, Object>> list_cleancv = new ArrayList<>();

    public void cleanUpFile() throws IOException {

        tableBuilder tableBuilder = new tableBuilder();
        tableBuilder.Builder();

        list_cleancv = tableBuilder.list;
        for (HashMap<String, Object> i : list_cleancv) {
            System.out.println(i);
        }
        writeIntoTxt();

    }

    private void writeIntoTxt() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("G:\\Entrance\\JavaProgram\\Training_and_UoB\\UoB\\Assignment_4\\src\\com\\bham\\pij\\assignments\\candidates\\cleancv.txt"));

        for (HashMap<String, Object> j : list_cleancv) {

            int counter = 0;

            for (String i : titles) {
                if (!i.equals("Position") && !i.equals("Experience")) {
                    writer.write(j.get(i) + ",");
                } else {
                    if (j.get("Position") != null && j.get("Experience") != null && counter == 0) {

                        ArrayList<String> position = new ArrayList<>((ArrayList<String>) j.get("Position"));
                        ArrayList<String> experience = new ArrayList<>((ArrayList<String>) j.get("Experience"));

                        counter += 1;

                        for (int k = 0; k < position.size(); k++) {

                            writer.write(position.get(k) + ",");
                            writer.flush();
                            writer.write(experience.get(k) + ",");
                            writer.flush();
                        }
                    }
                }
            }
            writer.write("\n");
            writer.flush();
        }
        writer.close();
    }

}
