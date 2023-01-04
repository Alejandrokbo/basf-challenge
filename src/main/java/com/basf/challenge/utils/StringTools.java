package com.basf.challenge.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTools {
    public static String cleanText(String str) {
        str = StringTools.removeTags(str);
        str = str.replaceAll("[\n\r\t]", "");
        str = str.replace("&nbsp;", "");
        str = StringTools.removeMoreThanOneSpace(str).trim();
        return str;
    }

    public static String removeTags(String stringWithTags) {
        StringBuilder stringWithoutTags = new StringBuilder();
        boolean esCaracterApertura = false;
        boolean esCaracterClausura = false;
        boolean hayQueIgnorarCaracter = false;

        for (int i = 0; i < stringWithTags.length(); ++i) {
            char c = stringWithTags.charAt(i);
            esCaracterApertura = c == '<';
            hayQueIgnorarCaracter = esCaracterApertura || hayQueIgnorarCaracter;
            if (!hayQueIgnorarCaracter) {
                stringWithoutTags.append(c);
            }

            esCaracterClausura = c == '>';
            if (esCaracterClausura) {
                hayQueIgnorarCaracter = false;
            }
        }

        return stringWithoutTags.toString();
    }

    public static String removeMoreThanOneSpace(String inputStr) {
        String patternStr = "  *";
        String replaceStr = " ";
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(inputStr);
        return matcher.replaceAll(replaceStr);
    }
}
