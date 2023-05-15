package org.hcl.fp;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Function;

import static org.hcl.fp.Exercise3.*;
import static org.junit.jupiter.api.Assertions.*;

class Exercise3Test {

    @Test
    void testCanMapFn() {
        Function<List<String>, List<String>> listFn = mapFn(x -> x.toUpperCase());
        assertEquals(List.of(), listFn.apply(List.of()));
        assertEquals(List.of("ONE", "TWO", "THREE"), listFn.apply(List.of("one", "two", "three")));
    }

    @Test
    void testCanAdd() {
        Function<String, String> add1 = add("1");
        assertEquals("a1", add1.apply("a"));
        assertEquals("b1", add1.apply("b"));

        Function<String, String> add2 = add("2");
        assertEquals("a2", add2.apply("a"));
        assertEquals("b2", add2.apply("b"));
    }

    @Test
    void testCanCompose() {
        Function<String, String> add1 = x -> x.toUpperCase();
        Function<String, String> add2 = x -> x + "_done!";
        Function<String, String> add3 = compose(add1, add2);
        assertEquals("A_done!", add3.apply("a"));
        assertEquals("B_done!", add3.apply("b"));
    }

}