package com.kelaniya.uni.v4;

public class CommandLineInputs {

    private final String[] args;

    //Constructor of the class
    public CommandLineInputs(String[] arguments){
        this.args = arguments;
    }

    public String getOperator(){
        //Make sure to validate the arguments before using..
        if (args.length == 0){
            System.out.println("Please provide the operation as an argument");
            return ""; // Will change in the future
        }

        String operator = args[0];

        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul") || operator.equals("div") ) ){
            System.out.println("please provide add,sub,mul or div as the operator");
            return ""; // Will change in the future
        }

        return operator;
    }
}
