package com.bham.pij.assignments.calculator;

//Zheng Biao 2133456

import java.util.ArrayList;

public class Calculator {

    // Recognize Method
    public float evaluate(String expression) {

        // expression transfer to tsf String Array
        String[] tsf = expression.split(" ");
        float flrt;

        // recognize operators
        if (expression.contains(" + ") || expression.contains(" - ") ||
                expression.contains(" * ") || expression.contains(" / ")) {

            // valid format, recognize " / 0"
            if (expression.contains(" / 0") || expression.contains("..")) {
                flrt = Float.MIN_VALUE;
            }
            // no " / 0" and operator invalid format
            else {

                //recognize "(+" or ")+" special situation
                if (expression.contains(" + )") || expression.contains(" - ) ") ||
                        expression.contains(" * ) ") || expression.contains(" / ) ") ||

                        //convert condition - operators
                        expression.contains(" ( - ") || expression.contains(" ( * ") ||
                        expression.contains(" ( / ") || expression.contains(" ( + ") ||

                        // special condition for num ( or ) num
                        expression.contains(" ) 1 ") || expression.contains(" ) 2 ") ||
                        expression.contains(" ) 3 ") || expression.contains(" ) 4 ") ||
                        expression.contains(" ) 5 ") || expression.contains(" ) 6 ") ||
                        expression.contains(" ) 7 ") || expression.contains(" ) 8 ") ||
                        expression.contains(" ) 9 ") || expression.contains(" ) 0 ") ||

                        // convert condition - nums
                        expression.contains(" 1 ( ") || expression.contains(" 2 ( ") ||
                        expression.contains(" 3 ( ") || expression.contains(" 4 ( ") ||
                        expression.contains(" 5 ( ") || expression.contains(" 6 ( ") ||
                        expression.contains(" 7 ( ") || expression.contains(" 8 ( ") ||
                        expression.contains(" 9 ( ") || expression.contains(" 0 ( ") ||

                        // special condition for num( or )num
                        expression.contains(" )1 ") || expression.contains(" )2 ") ||
                        expression.contains(" )3 ") || expression.contains(" )4 ") ||
                        expression.contains(" )5 ") || expression.contains(" )6 ") ||
                        expression.contains(" )7 ") || expression.contains(" )8 ") ||
                        expression.contains(" )9 ") || expression.contains(" )0 ") ||

                        // convert condition - num)
                        expression.contains(" 1) ") || expression.contains(" 2) ") ||
                        expression.contains(" 3) ") || expression.contains(" 4) ") ||
                        expression.contains(" 5) ") || expression.contains(" 6) ") ||
                        expression.contains(" 7) ") || expression.contains(" 8) ") ||
                        expression.contains(" 9) ") || expression.contains(" 0) ") ||

                        // convert condition - (nums
                        expression.contains(" (1 ") || expression.contains(" (2 ") ||
                        expression.contains(" (3 ") || expression.contains(" (4 ") ||
                        expression.contains(" (5 ") || expression.contains(" (6 ") ||
                        expression.contains(" (7 ") || expression.contains(" (8 ") ||
                        expression.contains(" (9 ") || expression.contains(" (0 ") ||

                        //Strange numbers
                        expression.contains(" .") || expression.contains(". ") ||


                        expression.contains("1. ") || expression.contains("2. ") ||
                        expression.contains("3. ") || expression.contains("4. ") ||
                        expression.contains("5. ") || expression.contains("6. ") ||
                        expression.contains("7. ") || expression.contains("8. ") ||
                        expression.contains("9. ") || expression.contains("0. ") ||


                        expression.contains(" .1") || expression.contains(" .2") ||
                        expression.contains(" .3") || expression.contains(" .4") ||
                        expression.contains(" .5") || expression.contains(" .6") ||
                        expression.contains(" .7") || expression.contains(" .8") ||
                        expression.contains(" .9") || expression.contains(" .0") ||


                        expression.contains("1/") || expression.contains("2/") ||
                        expression.contains("3/") || expression.contains("4/") ||
                        expression.contains("5/") || expression.contains("6/") ||
                        expression.contains("7/") || expression.contains("8/") ||
                        expression.contains("9/") || expression.contains("0/") ||


                        expression.contains("/1") || expression.contains("/2") ||
                        expression.contains("/3") || expression.contains("/4") ||
                        expression.contains("/5") || expression.contains("/6") ||
                        expression.contains("/7") || expression.contains("/8") ||
                        expression.contains("/9") || expression.contains("/0") ||
                        expression.contains("=")) {
                    flrt = Float.MIN_VALUE;
                } else { // valid method after checking

                    // tsf to ArrayList - format
                    ArrayList<String> format_2 = new ArrayList<>();
                    for (int i = 0; i < tsf.length; i++) {
                        format_2.add(tsf[i]);
                    }

                    // acquire the length of Arraylist - format
                    int length = format_2.size();

                    // Loop format util get result
                    while (length > 1) {
                        // for formula does not have brackets
                        if (!format_2.contains("(")) {
                            if (format_2.contains("*")) {

                                //transfer operator String -> char -- multiple
                                int position = format_2.indexOf("*");

                                // acquire result & transfer to String
                                String result = String.valueOf(getCurrentValue(format_2.get(position - 1), format_2.get(position + 1), '*'));
                                format_2.set(position, result);
                                format_2.remove(format_2.indexOf(result) + 1);
                                format_2.remove(format_2.indexOf(result) - 1);
                                length = format_2.size();

                                // add & sub
                                if (format_2.contains("+") && !format_2.contains("*") && !format_2.contains("/")) { // for add

                                    //transfer operator String -> char -- divide
                                    int positiona = format_2.indexOf("+");

                                    // acquire result & transfer to String
                                    String resulta = String.valueOf(getCurrentValue(format_2.get(positiona - 1), format_2.get(positiona + 1), '+'));
                                    format_2.set(positiona, resulta);
                                    format_2.remove(format_2.indexOf(resulta) - 1);
                                    format_2.remove(format_2.indexOf(resulta) + 1);
                                    length = format_2.size();
                                } else if (format_2.contains("-")) { // for sub

                                    //transfer operator String -> char -- divide
                                    int positiond = format_2.indexOf("-");

                                    // acquire result & transfer to String
                                    String resultd = String.valueOf(getCurrentValue(format_2.get(positiond - 1), format_2.get(positiond + 1), '-'));
                                    format_2.set(positiond, resultd);
                                    format_2.remove(format_2.indexOf(resultd) - 1);
                                    format_2.remove(format_2.indexOf(resultd) + 1);
                                    length = format_2.size();
                                }


                            } else if (format_2.contains("/")) {

                                //transfer operator String -> char -- divide
                                int position = format_2.indexOf("/");

                                // acquire result & transfer to String
                                String result = String.valueOf(getCurrentValue(format_2.get(position - 1), format_2.get(position + 1), '/'));
                                format_2.set(position, result);
                                format_2.remove(format_2.indexOf(result) - 1);
                                format_2.remove(format_2.indexOf(result) + 1);
                                length = format_2.size();

                                // add & sub
                                if (format_2.contains("+") && !format_2.contains("*") && !format_2.contains("/")) { // for add

                                    //transfer operator String -> char -- divide
                                    int positiona = format_2.indexOf("+");

                                    // acquire result & transfer to String
                                    String resulta = String.valueOf(getCurrentValue(format_2.get(positiona - 1), format_2.get(positiona + 1), '+'));
                                    format_2.set(positiona, resulta);
                                    format_2.remove(format_2.indexOf(resulta) - 1);
                                    format_2.remove(format_2.indexOf(resulta) + 1);
                                    length = format_2.size();
                                } else if (format_2.contains("-") && !format_2.contains("*") && !format_2.contains("/")) { // for sub

                                    //transfer operator String -> char -- divide
                                    int positiond = format_2.indexOf("-");

                                    // acquire result & transfer to String
                                    String resultd = String.valueOf(getCurrentValue(format_2.get(positiond - 1), format_2.get(positiond + 1), '-'));
                                    format_2.set(positiond, resultd);
                                    format_2.remove(format_2.indexOf(resultd) - 1);
                                    format_2.remove(format_2.indexOf(resultd) + 1);
                                    length = format_2.size();
                                }
                            } else {
                                if (format_2.contains("+")) { // for add

                                    //transfer operator String -> char -- divide
                                    int positiona = format_2.indexOf("+");

                                    // acquire result & transfer to String
                                    String resulta = String.valueOf(getCurrentValue(format_2.get(positiona - 1), format_2.get(positiona + 1), '+'));
                                    format_2.set(positiona, resulta);
                                    format_2.remove(format_2.indexOf(resulta) - 1);
                                    format_2.remove(format_2.indexOf(resulta) + 1);
                                    length = format_2.size();
                                } else if (format_2.contains("-")) { // for sub

                                    //transfer operator String -> char -- divide
                                    int positiond = format_2.indexOf("-");

                                    // acquire result & transfer to String
                                    String resultd = String.valueOf(getCurrentValue(format_2.get(positiond - 1), format_2.get(positiond + 1), '-'));
                                    format_2.set(positiond, resultd);
                                    format_2.remove(format_2.indexOf(resultd) - 1);
                                    format_2.remove(format_2.indexOf(resultd) + 1);
                                    length = format_2.size();
                                }
                            }
                        } else {
                            if (format_2.size() == 11) {
                                char operation1 = format_2.get(2).charAt(0);
                                char operation2 = format_2.get(5).charAt(0);
                                char operation3 = format_2.get(8).charAt(0);

                                String left = String.valueOf(getCurrentValue(format_2.get(1), format_2.get(3), operation1));
                                String right = String.valueOf(getCurrentValue(format_2.get(7), format_2.get(9), operation3));
                                float result = getCurrentValue(left, right, operation2);

                                for (int i = 0, j = format_2.size(); j > 0; j--) {
                                    format_2.remove(i);
                                }
                                format_2.add(String.valueOf(result));
                                break;
                            } else
                                break;
                        }

                    }
                    if (format_2.contains("*") || format_2.contains("+") || format_2.contains("/")) {
                        flrt = Float.MIN_VALUE;
                    } else {
                        flrt = Float.parseFloat(format_2.get(0));
                    }
                }
            }
        }

        // invalid format
        else {
            flrt = Float.MIN_VALUE;
        }
        return flrt;
    }

    // Calculation method
    public float getCurrentValue(String a1, String a2, char operator) {


        float a = Float.parseFloat(a1);
        float b = Float.parseFloat(a2);

        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                return 0F;
        }
    }
}