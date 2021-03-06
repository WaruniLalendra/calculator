package com.kelaniya.uni.v5.repository;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileNumberRepository implements NumberRepository {

    public Double[] getNumber() throws NumberRepositoryException {

        //read the numbers text file
        List<String> numbersStrs = null;
        try {
            numbersStrs = Files.readAllLines(
                    Paths.get("C:\\Users\\Waruni Lalendra\\Desktop\\2021\\calculator\\numbers.txt")
            );
        } catch (IOException e) {
            throw new NumberRepositoryException(e,"Couldn't find the text file");
        }

        //System.out.println(numbersStrs.get(0));

        double number1 = Double.parseDouble((numbersStrs.get(0)));
        double number2 = Double.parseDouble((numbersStrs.get(1)));

        return new Double[]{number1, number2};
    }

}
