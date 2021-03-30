package com.bham.pij.assignments.calculator;

import java.util.ArrayList;
import java.util.Stack;

public class Calculator_2 {
    public ArrayList<String> tsf_2 = new ArrayList<>();

    public float evaluate(String expression) {

        // expression trasfer to tsf String Array
        String[] fml = expression.split(" ");
        float result = 0;

        // recognize operators
        if (expression.contains(" + ") || expression.contains(" - ") ||
                expression.contains(" * ") || expression.contains(" / ")) {

            // valid format, recognize " / 0"
            if (expression.contains(" / 0") || expression.contains("..")) {
                return result = Float.MIN_VALUE;
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
                    return result = Float.MIN_VALUE;
                } else { // valid method after checking

                    // tsf to ArrayList - format
                    for (int i = 0; i < fml.length; i++) {
                        tsf_2.add(fml[i]);
                    }
                    result = RPN(fml);
                    return result;
                }
            }

        }
        return result;
    }

    public float getCurrentValue ( float b, float a, String operator){

        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                return Float.MIN_VALUE;
        }
    }

    public boolean isOperator (String token){
        return "+-/".contains(token);
    }

    public float RPN (String[] al) {
        Stack<Float> stack = new Stack<>();
        for (String token : al) {
            stack.push(isOperator(token) ?
                    getCurrentValue(stack.pop(), stack.pop(), token)
                    : Float.parseFloat(token));
        }
        return stack.pop();
    }
}