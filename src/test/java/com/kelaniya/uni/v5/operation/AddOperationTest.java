package com.kelaniya.uni.v5.operation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class AddOperationTest {

    //cases
    //5,6 => 11
    //1,2 => 3
    //0,0 => 0
    //4,5 => 9
    //-1,-2 => -3 ........ infinite number of cases

    //test cases
    // +ve number + (+)ve number => correct answer => 5,6 =>11
    // zero + zero = zero =>0,0=0
    // negative value + negative value => correct answers=> -1,-2=>-3
    //negative value and positive value => correct answer => -4 +5 => 1

    @Test
    public void should_add_positive_values(){

        AddOperation addOperation = new AddOperation();
        Double result = addOperation.execute(new Double[]{5.0,6.0});

        assertThat(result, is(11.0));
    }

    @Test
    public void should_add_zeros(){

        AddOperation addOperation = new AddOperation();
        Double result = addOperation.execute(new Double[]{0.0,0.0});

        assertThat(result, is(0.0));
    }

    @Test
    public void should_add_negatives(){

        AddOperation addOperation = new AddOperation();
        Double result = addOperation.execute(new Double[]{-1.0,-2.0});

        assertThat(result, is(-3.0));
    }
}

