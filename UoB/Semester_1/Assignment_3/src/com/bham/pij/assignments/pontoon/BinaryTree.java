package com.bham.pij.assignments.pontoon;
// Zheng Biao 2133456
import java.util.ArrayList;
import java.util.Collections;

public class BinaryTree {

    public ArrayList<Integer> PossibleResultDegree(int high) {
        int data = 0;

        ArrayList<Integer> possible_ACE_Result = new ArrayList<>();
        int length = 0;
        int pre_length = 0;

        for (int i = 1; i <= high; i++) {
            if (possible_ACE_Result.size() == 0) {
                possible_ACE_Result.add(data + 1);
                possible_ACE_Result.add(data + 11);
            } else {
                for (int j = pre_length; j < length; j++) {
                    possible_ACE_Result.add(possible_ACE_Result.get(j) + 1);
                    possible_ACE_Result.add(possible_ACE_Result.get(j) + 11);
                }
            }
            pre_length = length;
            length = possible_ACE_Result.size();
        }

        for (int i = 0; i < possible_ACE_Result.size(); i++) {
            for (int j = 1; j < possible_ACE_Result.size(); j++) {
                if (possible_ACE_Result.get(i).equals(possible_ACE_Result.get(j))) {
                    possible_ACE_Result.remove(j);
                    j = i + 1;
                }
            }
        }

        ArrayList<Integer> nvalues = new ArrayList<>();
        for (int i = 0; i < possible_ACE_Result.size(); i++) {
            for (int j = i + 1; j < possible_ACE_Result.size(); j++) {
                if (possible_ACE_Result.get(i).equals(possible_ACE_Result.get(j))) {
                    j = ++i;
                }
            }
            nvalues.add(possible_ACE_Result.get(i));
        }
        Collections.sort(possible_ACE_Result);
        return possible_ACE_Result;
    }
}
