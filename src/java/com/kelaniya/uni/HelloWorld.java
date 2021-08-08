package com.kelaniya.uni;

public class HelloWorld {
    public static void main(String[] args){
        //System.out.println("hello world");

        GetData data = new GetData();
        OperationHandler op = new OperationHandler();

        data.getData();
        op.selectOperation();

    }
}
