package org.example;

public class CountComments {
    public static int countLines(String string) {
        //replace comments
        string = string.replaceAll("(/\\*([^*]|[\\r\\n]|(\\*+([^*/]|[\\r\\n])))*\\*+/)|(//.*)", "");

        //replace empty lines
        string = string.replaceAll("(?m)^[ \t]*\r?\n", "");

        String[] lines = string.split("\r\n|\r|\n");

        return lines.length;
    }
}
