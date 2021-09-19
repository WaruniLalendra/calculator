package com.kelaniya.uni.v5.operation;

public class AddOperation implements Operation {


    public Double execute(Double[] numbers){
        return numbers[0]+numbers[1];
    }
}

//what is the responsibility of the add operation class? - Add two numbers

//Figure out the test cases