package org.example;

import java.util.List;

import static org.example.CountComments.countLines;

public class Main {
    public static void main(String[] args) {
        List<String> lines = ReadFromFile.readLineByLine("/Users/HU900849/Desktop/CodeKata/CodeKata-13/src/test/resources/code.txt");
        String str = ReadFromFile.makeString(lines);

        System.out.println(countLines(str));
    }
}