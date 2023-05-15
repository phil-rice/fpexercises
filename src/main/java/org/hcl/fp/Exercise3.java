package org.hcl.fp;

import java.util.List;
import java.util.function.Function;

public interface Exercise3 {

    /** Returns a function that applies the function f to every element in a list */
    static Function<List<String>, List<String>> mapFn(Function<String, String> f) {
        throw new RuntimeException("Not implemented");
    }

    /**
     * Returns a Function that adds the value to the input. So for example add("X") will return a function that appends 'X' to the input.
     */
    static Function<String, String> add(String value) {
        throw new RuntimeException("Not implemented");
    }

    /**
     * returns a function that calls fn1 and then calls fn2 returning the result.
     * For example compose(x -> x.toUpperCase(), x -> x + "_done") will return a function that uppercases the input and then appends "_done".
     * For example compose(add("1"),add("2")) will return a function that adds "12" to the input
     */
    static Function<String, String> compose(Function<String, String> fn1, Function<String, String> fn2) {
        throw new RuntimeException("Not implemented");
    }

}
