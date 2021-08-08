package com.kelaniya.uni;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class GetData {

    public static double num1;
    public static double num2;

    public void getData(){

        try {
            File file = new File("src\\java\\com\\kelaniya\\uni\\number.txt");
            Scanner fileScanner = new Scanner(file);

            while(fileScanner.hasNextLine()) {
                String data = fileScanner.nextLine();
                num1 = Double.parseDouble(data.split(" ")[0]);
                num2 = Double.parseDouble(data.split(" ")[1]);
            }

            System.out.println(num1);
            System.out.println(num2);

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }


    }
}
