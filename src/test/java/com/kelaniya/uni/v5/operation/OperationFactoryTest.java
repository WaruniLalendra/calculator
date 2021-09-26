package com.kelaniya.uni.v5.operation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class OperationFactoryTest {
    //test cases
    //1.If the operator is add - should return the object of add

    @Test
    public void should_return_add_operation_object_when_operator_is_add(){

        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("add");

        //Verify that the operation object is an instant of AddOperation class
        assertThat(operation, instanceOf(AddOperation.class));

    }


    //2.If the operator is sub - should return the object of sub
    @Test
    public void should_return_sub_operation_object_when_operator_is_sub(){

        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("sub");

        //Verify that the operation object is an instant of AddOperation class
        assertThat(operation, instanceOf(SubOperation.class));

    }

    //3.If the operator is mul - should return the object of mul
    @Test
    public void should_return_mul_operation_object_when_operator_is_mul(){

        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("mul");

        //Verify that the operation object is an instant of AddOperation class
        assertThat(operation, instanceOf(MulOperation.class));

    }

    //4.If the operator is div - should return the object of div
    @Test
    public void should_return_div_operation_object_when_operator_is_div(){

        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("div");

        //Verify that the operation object is an instant of AddOperation class
        assertThat(operation, instanceOf(DivOperation.class));

    }





}