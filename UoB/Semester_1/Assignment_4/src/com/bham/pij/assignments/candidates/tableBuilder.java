package com.bham.pij.assignments.candidates;
// Zheng Biao 2133456

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

public class tableBuilder {

    public ArrayList<HashMap<String, Object>> list = new ArrayList<>();

    int num;
    int num_f = 1;

    String name;
    String formatted_Name;

    String qualification;
    ArrayList<String> position = new ArrayList<>();
    ArrayList<String> experience = new ArrayList<>();
    String email;

// ========================================================================================================================

    public void Builder() {


        String dirty;
        // Hashmap for store
        HashMap<String, Object> block = new HashMap<>();

        Path fileIn = Paths.get("dirtycv.txt");

        try {
            // -------------------------------------------------------- Reader
            BufferedReader in = new BufferedReader(new FileReader
                    ("G:\\Entrance\\JavaProgram\\Training_and_UoB\\UoB\\Assignment_4\\dirtycv.txt"));
            // -------------------------------------------------------- Reader

            while ((dirty = in.readLine()) != null) {

                numSetting(dirty);
                nameSetting(dirty);
                formattedNameAdding(block);

                qualificationSetting(dirty);
                qualificationAdding(block);

                positionSetting(dirty);
                experienceSetting(dirty);


                if (dirty.contains("eMail:") || dirty.equals("End")) {
                    positionAdding(block);
                    experienceAdding(block);

                    position.clear();
                    experience.clear();
                }

                emailSetting(dirty);
                emailAdding(block);

                listBuilder(dirty, block);
                blockCleaner(dirty, block);
            }

        } catch (IOException ignored) {

        }
    }

// ========================================================================================================================
// ========================================================================================================================

    // only change when num is not 0
    private void numSetting(String dirty) {
        if (cvDetect(dirty) != 0) {
            num = cvDetect(dirty);
        }
    }

    // CV title test
    private int cvDetect(String input) {

        int counter;

        if (input.contains("CV ")) {
            counter = Integer.parseInt(String.valueOf(input.charAt(3)));
            return counter;
        } else {
            return 0;
        }
    }
// -------------------------------------------------------------------------

    // only change name when name is not null
    private void nameSetting(String dirty) {
        if (nameDetect(dirty) != null) {
            name = nameDetect(dirty);
        }
    }

    // name title detect
    private String nameDetect(String input) {

        String name_num = null;

        if (input.contains("Surname:")) {

            StringBuilder name = new StringBuilder();

            for (int i = input.indexOf(":") + 1; i < input.length(); i++) {
                name.append(input.charAt(i));
            }
            name_num = name.toString();
        }
        return name_num;
    }

    // formative name & add to Hashmap - block
    private void formattedNameAdding(HashMap<String, Object> block) {
        if (num != 0 && name != null) {
            formatted();
            block.put("Identifier", formatted_Name);
            num_f++;
        }
    }

    // format name
    private void formatted() {

        String num = String.format("%04d", this.num);
        formatted_Name = name + num;

        this.num = 0;

        name = null;
    }

// ========================================================================================================================
// ========================================================================================================================

    // set qualification to current employee
    private void qualificationSetting(String dirty) {
        if (qualificationDetect(dirty) != null) {
            qualification = qualificationDetect(dirty);
        }
    }

    // Qualification title detect
    private String qualificationDetect(String input) {

        String qualification = null;

        if (input.contains("Qualification:")) {
            StringBuilder name = new StringBuilder();

            for (int i = input.indexOf(":") + 1; i < input.length(); i++) {
                name.append(input.charAt(i));
            }

            qualification = name.toString();
        }
        return qualification;
    }

    // add qualification to Hashmap - block
    private void qualificationAdding(HashMap<String, Object> block) {
        if (qualification != null) {
            block.put("Qualification", qualification);
        }
    }

// ========================================================================================================================
// ========================================================================================================================

    // set position to current employee
    private void positionSetting(String dirty) {
        if (positionDetect(dirty) != null) {
            position.add(positionDetect(dirty));
        }
    }

    // Position title detect
    private String positionDetect(String input) {

        String position_local = null;

        if (input.contains("Position:")) {
            StringBuilder name = new StringBuilder();

            for (int i = input.indexOf(":") + 1; i < input.length(); i++) {
                name.append(input.charAt(i));
            }

            position_local = name.toString();
        }
        return position_local;
    }

    // add position to Hashmap - block
    private void positionAdding(HashMap<String, Object> block) {
        if (!position.isEmpty()) {
            ArrayList<String> tsf = new ArrayList<>(position);
            block.put("Position", tsf);
        }
    }

// ========================================================================================================================

    // set experience to current employee
    private void experienceSetting(String dirty) {
        if (experienceDetect(dirty) != null) {
            experience.add(experienceDetect(dirty));
        }
    }

    // Experience title detect
    private String experienceDetect(String input) {

        String experience_local = null;

        if (input.contains("Experience:")) {
            StringBuilder name = new StringBuilder();

            for (int i = input.indexOf(":") + 1; i < input.length(); i++) {
                name.append(input.charAt(i));
            }

            experience_local = name.toString();
        }
        return experience_local;
    }

    // add experience to Hashmap - block
    private void experienceAdding(HashMap<String, Object> block) {
        if (!experience.isEmpty()) {
            ArrayList<String> tsf = new ArrayList<>(experience);
            block.put("Experience", tsf);
        }
    }

// ========================================================================================================================

    // set email to current employee
    private void emailSetting(String dirty) {
        if (emailDetect(dirty) != null) {
            email = emailDetect(dirty);
        }
    }

    // eMail title detect
    private String emailDetect(String input) {

        String email = null;

        if (input.contains("eMail:")) {
            StringBuilder name = new StringBuilder();

            for (int i = input.indexOf(":") + 1; i < input.length(); i++) {
                name.append(input.charAt(i));
            }

            email = name.toString();
        }
        return email;
    }

    // add email to Hashmap - block
    private void emailAdding(HashMap<String, Object> block) {
        if (email != null) {
            block.put("eMail", email);
        }
    }

// ========================================================================================================================
// ========================================================================================================================

    // clear Hashmap
    private void blockCleaner(String dirty, HashMap<String, Object> block) {
        if (dirty.equals("End"))
            block.clear();
    }

    // add Hashmap to Arraylist (list) & use as table
    private void listBuilder(String dirty, HashMap<String, Object> block) {

        HashMap<String, Object> tsf = new HashMap<>(block);

        if (dirty.equals("End") && !block.isEmpty()) {
            list.add(tsf);
        }
    }
}
