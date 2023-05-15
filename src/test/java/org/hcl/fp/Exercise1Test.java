package org.hcl.fp;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Function;

import static org.hcl.fp.Exercise1.*;
import static org.junit.jupiter.api.Assertions.*;

class Exercise1Test {

    @Test
    void testCanMapFn() {
        Function<List<Integer>, List<Integer>> listFn = mapFn(x -> x * 2);
        assertEquals(List.of(), listFn.apply(List.of()));
        assertEquals(List.of(2, 4, 6), listFn.apply(List.of(1, 2, 3)));
    }

    @Test
    void testCanAdd() {
        Function<Integer, Integer> add1 = add(1);
        assertEquals(2, add1.apply(1));
        assertEquals(3, add1.apply(2));

        Function<Integer, Integer> add2 = add(2);
        assertEquals(3, add2.apply(1));
        assertEquals(4, add2.apply(2));
    }

    @Test
    void testCanCompose() {
        Function<Integer, Integer> add1 = add(1);
        Function<Integer, Integer> add2 = add(2);
        Function<Integer, Integer> add3 = compose(add1, add2);
        assertEquals(4, add3.apply(1));
        assertEquals(5, add3.apply(2));
    }

}