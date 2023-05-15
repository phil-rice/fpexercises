package org.hcl.fp;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Function;

import static org.hcl.fp.Exercise2.*;
import static org.junit.jupiter.api.Assertions.*;

class Exercise2Test {

    @Test
    void testCanMapFn() {
        Function<List<Double>, List<Double>> listFn = mapFn(x -> x * 2.0);
        assertEquals(List.of(), listFn.apply(List.of()));
        assertEquals(List.of(2.0, 4.0, 6.0), listFn.apply(List.of(1.0, 2.0, 3.0)));
    }

    @Test
    void testCanAdd() {
        Function<Double, Double> add1 = add(1.0);
        assertEquals(2, add1.apply(1.0));
        assertEquals(3, add1.apply(2.0));

        Function<Double, Double> add2 = add(2.0);
        assertEquals(3, add2.apply(1.0));
        assertEquals(4, add2.apply(2.0));
    }

    @Test
    void testCanCompose() {
        Function<Double, Double> add1 = add(1.0);
        Function<Double, Double> add2 = add(2.0);
        Function<Double, Double> add3 = compose(add1, add2);
        assertEquals(4, add3.apply(1.0));
        assertEquals(5, add3.apply(2.0));
    }

}