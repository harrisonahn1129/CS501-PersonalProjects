package com.example.c4_p33;


import java.util.Locale;

public class encrypt {

    private static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private static String finalText = "";
    private static Integer oriPosition;
    private static Integer updated;
    private static Integer finalPos;
    private static String converted;
    private static String output = "";

    public static String convertString(String text, Integer num){

        for (int i = 0; i < text.length(); i++){
            if(text.charAt(i) != ' '){
                oriPosition = alphabet.indexOf(text.charAt(i));
                updated = num + oriPosition;
                if (updated >= alphabet.length()){
                    finalPos = updated - alphabet.length();
                }
                else {
                    finalPos = updated;
                }
                converted = alphabet.substring(finalPos,finalPos + 1);
                finalText = finalText + converted;
            }
            else if(text.charAt(i) == ' '){
                finalText = finalText + " ";
            }
        }
        output = finalText;
        finalText = "";
        return output;
    }

}
