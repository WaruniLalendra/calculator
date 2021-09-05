package com.kelaniya.uni.v4;
//package com.kelaniya.uni.v3.operation.AddOperation;

import com.kelaniya.uni.v4.operation.AddOperation;
import com.kelaniya.uni.v4.operation.MulOperation;
import com.kelaniya.uni.v4.operation.Operation;
import com.kelaniya.uni.v4.operation.SubOperation;

import java.io.IOException;

//LISKOV Substitution principle
public class Main{


    public static void main(String[] args) throws IOException {

        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumber();

        //Decision making + Coordination
        Operation operation = null;
        if (operator.equals("add")){
            operation = new AddOperation();
        }else if (operator.equals("sub")){
            operation = new SubOperation();
        }else if (operator.equals("mul")){
            operation = new MulOperation();
        }

        Double result = operation.execute(numbers);
        System.out.println("The result is:" + result);

    }

}
