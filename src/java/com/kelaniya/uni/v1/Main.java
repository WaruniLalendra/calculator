package com.kelaniya.uni.v1;

public class Main {
    public static void main(String[] args){
        //System.out.println("hello world");

        GetData data = new GetData();
        OperationHandler op = new OperationHandler();

        data.getData();
        op.selectOperation();

    }
}
