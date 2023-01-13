package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CountCommentsTest {

    @Test
    void countLinesTest1() {
        //Arrange
        String code = "// This file contains 3 lines of code\n" +
                "     public interface Dave {\n" +
                "       /**\n" +
                "        * count the number of lines in a file\n" +
                "        */\n" +
                "       int countLines(File inFile); // not the real signature!\n" +
                "     }";

        //Act
        int numOfCodeLines = CountComments.countLines(code);

        //Assert
        Assertions.assertEquals(3, numOfCodeLines);
    }

    @Test
    void countLinesTest2() {
        //Arrange
        String code = "     /*****\n" +
                "     * This is a test program with 5 lines of code\n" +
                "     *  \\/* no nesting allowed!\n" +
                "     //*****//***/// Slightly pathological comment ending...\n" +
                "  \n" +
                "    public class Hello {\n" +
                "        public static final void main(String [] args) { // gotta love Java\n" +
                "            // Say hello\n" +
                "          System./*wait*/out./*for*/println/*it*/(\"Hello/*\");\n" +
                "        }\n" +
                "  \n" +
                "    }";

        //Act
        int numOfCodeLines = CountComments.countLines(code);

        //Assert
        Assertions.assertEquals(5, numOfCodeLines);
    }
}