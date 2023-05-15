package org.hcl.fp;

import java.util.List;
import java.util.function.Function;

public interface Exercise2 {

    static Function<List<Double>, List<Double>> mapFn(Function<Double, Double> f) {
        throw new RuntimeException("Not implemented");
    }

    /**
     * Returns a Function that adds the value to the input. So for example add(1) will return a function that adds 1 to the input.
     */
    static Function<Double, Double> add(Double value) {
        throw new RuntimeException("Not implemented");
    }

    /**
     * returns a function that calls fn1 and then calls fn2 returning the result.
     * For example compose(x -> x + 1, x -> x * 2) will return a function that adds 1 to the input and then multiplies the result by 2.
     * For example compose(add(1),add(2)) will return a function that adds 3 to the input
     */
    static Function<Double, Double> compose(Function<Double, Double> fn1, Function<Double, Double> fn2) {
        throw new RuntimeException("Not implemented");
    }

}
