package com.bham.pij.assignments.pontoon;

import java.util.ArrayList;
import java.util.Collections;


public class test {

    private ArrayList<Integer> values = new ArrayList<>();
    private final int current = 1;

    public static void main(String[] args) {

        test test = new test();
        test.values = test.PossibleResultDegree(4);
        System.out.println(test.values);
        System.out.println(test.values.size());
    }

    public ArrayList<Integer> PossibleResultDegree(int high) {
        int data = 0;
        ArrayList<Integer> possibleResult = new ArrayList<>();
        int length = 0;
        int pre_length = 0;

        for (int i = 1; i <= high; i++) {
            if (possibleResult.size() == 0) {
                possibleResult.add(data + 1);
                possibleResult.add(data + 11);
            } else {
                for (int j = pre_length; j < length; j++) {
                    possibleResult.add(possibleResult.get(j) + 1);
                    possibleResult.add(possibleResult.get(j) + 11);
                }
            }
            pre_length = length;
            length = possibleResult.size();
        }

        ArrayList<Integer> nvalues = new ArrayList<>();
        for (int i = 0; i < possibleResult.size(); i++) {
            for (int j = i + 1; j < possibleResult.size(); j++) {
                if (possibleResult.get(i).equals(possibleResult.get(j))) {
                    j = ++i;

                }
            }
            nvalues.add(possibleResult.get(i));
        }

        possibleResult = nvalues;
        Collections.sort(possibleResult);

        ArrayList<Integer> valuessssss = possibleResult;
        System.out.println(valuessssss);

        for (int i = 0; i < valuessssss.size(); i++) {
            valuessssss.set(i, (valuessssss.get(i) + current));
        }

        return valuessssss;
    }

// =======================================================================
// =======================================================================
// =======================================================================
    private ArrayList<Integer> getBestNumericalHandValue() {

        ArrayList<Integer> nvalues = new ArrayList<>();
        for (int i = 0; i < values.size(); i++) {
            for (int j = i + 1; j < values.size(); j++) {
                if (values.get(i).equals(values.get(j))) {
                    j = ++i;

                    System.out.println(values);
                }
            }
            nvalues.add(values.get(i));
        }
        values = nvalues;
        return values;
    }

    private int getBest() {
        ArrayList<Integer> lovely_result = new ArrayList<>();
        for (Integer value : values) {
            if (value <= 21) {
                lovely_result.add(value);
            }
        }
        Collections.sort(lovely_result);
        values = lovely_result;
        return values.get(values.size() - 1);
    }

    private void name() {
        for (int i = 0; i < 4; i++) {
            char name = (char) (65 + i);
            System.out.println(name);
        }
    }
}
